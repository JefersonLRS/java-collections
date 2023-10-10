package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> cartItems;

    public CarrinhoDeCompras() {
        this.cartItems = new ArrayList<>();
    }

    public void addItems(String name, double price, int quantity) {
        cartItems.add(new Item(name, price, quantity));
    }

    public void removeItems(String name){
        List<Item> itemsToRemove = new ArrayList<>();
        if (!cartItems.isEmpty()){
            for (Item i : cartItems) {
                if (i.getName().equalsIgnoreCase(name)){
                    itemsToRemove.add(i);
                }
                cartItems.removeAll(itemsToRemove);
            }
        } else {
            System.out.println("Sorry but the cart is empty :(");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        if (!cartItems.isEmpty()){
            for (Item i : cartItems) {
                valorTotal += i.getPrice()*i.getQuantity();
            }
            return valorTotal;
        } else {
            throw new RuntimeException("The cart is empty!");
        }
    }

    public void showCartItems(){
        if (!cartItems.isEmpty()){
            System.out.println(this.cartItems);
        } else {
            System.out.println("The cart is empty!");
        }
    }

//    @Override
//    public String toString() {
//        return "CartItems {" + cartItems + "} ";
//    }

    public static void main(String[] args) {
        CarrinhoDeCompras newCart = new CarrinhoDeCompras();

        newCart.addItems("GTX 40660Ti 32GB", 4000.0, 2);
        newCart.addItems("SSD KingStone 2TR nvme", 500.0, 5);
        newCart.addItems("Mouse Logitech", 300.0, 2);
        newCart.showCartItems();
        System.out.println("O valor total da compra é: R$" + newCart.calcularValorTotal());
        newCart.removeItems("SSD KingStone 2TR nvme");
        newCart.showCartItems();
        System.out.println("O valor total da compra é: R$" + newCart.calcularValorTotal());
    }
}
