package main.java.set.Pesquisa;

import main.java.set.OperacoesBasicas.Convidado;

import java.sql.Array;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void addContact(String name, int contactNumber){
        contatoSet.add(new Contato(name, contactNumber));
    }

    public void showContact(){
        System.out.println(contatoSet);
    }

    public Set<Contato> searchByName(String name){
        Set<Contato> contactsByName = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getName().startsWith(name)) {
                contactsByName.add(c);
            }
        }
        return contactsByName;
    }

    public Contato updateContactNumber(String name, int newNumber){
        Contato updatedContact = null;
        for (Contato c : contatoSet){
            if (c.getName().equalsIgnoreCase(name)){
                c.setContactNumber(newNumber);
                updatedContact = c;
                break;
            }
        }
        return updatedContact;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.addContact("Jef", 283928328);
        agendaContatos.addContact("Duda", 954854989);
        agendaContatos.addContact("Paula", 1929182912);

        agendaContatos.showContact();
        System.out.println(agendaContatos.searchByName("Duda"));

    }
}
