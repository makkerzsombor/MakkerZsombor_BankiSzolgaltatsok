package hu.petrik.bankiSzolgaltatasok;

public final class Tulajdonos {
    private String nev;

    public Tulajdonos(String nev) {
        this.nev = nev;
    }

    public String getTulajdonos() {
        return nev;
    }

    public void setTulajdonos(String tulajdonos) {
        this.nev = tulajdonos;
    }
}
