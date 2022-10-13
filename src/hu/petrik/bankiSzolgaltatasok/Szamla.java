package hu.petrik.bankiSzolgaltatasok;

public abstract class Szamla {
    protected int aktualisEgyenleg;

    public Szamla(Tulajdonos tulajdonos) {
        this.aktualisEgyenleg = aktualisEgyenleg;
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void befizet(int osszeg){
        this.aktualisEgyenleg += osszeg;
    }

    public abstract boolean kivesz(int osszeg);
}
