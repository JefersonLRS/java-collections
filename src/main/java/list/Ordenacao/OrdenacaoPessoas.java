package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> personList;

    public OrdenacaoPessoas() {this.personList = new ArrayList<>();}

    public void addPerson (String name, int age, double height){
        personList.add(new Pessoa(name, age, height));
    }

    public List<Pessoa> orderByAge(){
        List<Pessoa> peopleByAge = new ArrayList<>(personList);
        Collections.sort(peopleByAge);
        return peopleByAge;
    }

    public List<Pessoa> orderByHeight(){
        List<Pessoa> peopleByHeight = new ArrayList<>(personList);
        Collections.sort(peopleByHeight, new ComparableByHeight());
        return peopleByHeight;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();

        ordenacaoPessoa.addPerson("Jef", 22, 1.80);
        ordenacaoPessoa.addPerson("Duda", 23, 1.68);
        ordenacaoPessoa.addPerson("Lucão", 37, 2.09);
        ordenacaoPessoa.addPerson("Bruninho", 35, 1.90);

        System.out.println(ordenacaoPessoa.orderByAge());
        System.out.println(ordenacaoPessoa.orderByHeight());
    }
}
