package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> bookList;

    public CatalogoLivros() { this.bookList = new ArrayList<>();}

    public void addBook (String title, String author, int yearOfPublication){
        bookList.add(new Livro(title, author, yearOfPublication));
    }

    public List<Livro> searchByAuthor(String author){
        List<Livro> booksOfAuthor = new ArrayList<>();
        if (!bookList.isEmpty()){
            for (Livro l : bookList) {
                if (l.getAuthor().equalsIgnoreCase(author)){
                    booksOfAuthor.add(l);
                }
            }
        }
        return booksOfAuthor;
    }

    public List<Livro> searchByYearInterval(int startYear, int finishYear) {
        List<Livro> bookOfYearInterval = new ArrayList<>();
        if (!bookList.isEmpty()){
            for (Livro l : bookList) {
                if (l.getYearOfPublication() <= finishYear && l.getYearOfPublication() >= startYear){
                    bookOfYearInterval.add(l);
                }
            }
        } return bookOfYearInterval;
    }

    public Livro searchByTitle (String title) {
        Livro bookByTitle = null;
        if (!bookList.isEmpty()){
            for (Livro t : bookList){
                if (t.getTitle().equalsIgnoreCase(title)){
                    bookByTitle = t;
                    break;
                }
            }
        }
        return bookByTitle;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.addBook("titulo 1", "autor 4", 2000);
        catalogoLivros.addBook("titulo 2", "autor 2", 2005);
        catalogoLivros.addBook("titulo 3", "autor 3", 2010);
        catalogoLivros.addBook("titulo 4", "autor 4", 2015);
        catalogoLivros.addBook("titulo 5", "autor 5", 2020);
        catalogoLivros.addBook("titulo 6", "autor 4", 2025);

        System.out.println("Os livros são: " + catalogoLivros.searchByYearInterval(2005, 2021));
        System.out.println("Os livros do autor 4 são: " + catalogoLivros.searchByAuthor("autor 4"));
    }
}
