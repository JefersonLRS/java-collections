package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = (new HashSet<>());
    }

    public void addGuest (String name, int inviteCode) {
        convidadoSet.add(new Convidado(name, inviteCode));
    }

    public void removeGuest(int inviteCode){
        Convidado guestToRemove = null;
        for (Convidado c : convidadoSet){
            if (c.getInviteCode() == inviteCode) {
                guestToRemove = c;
                break;
            }
        }
        convidadoSet.remove(guestToRemove);
    }

    public int countGuest(){
        return convidadoSet.size();
    }

    public Set<Convidado> showGuests(){
        return convidadoSet;
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidado = new ConjuntoConvidados();

        convidado.addGuest("Jef", 2204);
        convidado.addGuest("Duda", 2708);
        convidado.addGuest("Jess", 1908);
        convidado.addGuest("Felipe", 2909);
        convidado.addGuest("Luize", 1708);

        System.out.println(convidado.showGuests());
        System.out.println(convidado.countGuest());
        convidado.removeGuest(2909);
        System.out.println(convidado.countGuest());


    }
}
