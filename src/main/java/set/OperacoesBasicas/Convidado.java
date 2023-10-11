package main.java.set.OperacoesBasicas;

public class Convidado {

    private String name;
    private int inviteCode;

    public Convidado(String name, int inviteCode) {
        this.name = name;
        this.inviteCode = inviteCode;
    }

    public String getName() {
        return name;
    }

    public int getInviteCode() {
        return inviteCode;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "name='" + name + '\'' +
                ", inviteCode=" + inviteCode +
                '}';
    }
}
