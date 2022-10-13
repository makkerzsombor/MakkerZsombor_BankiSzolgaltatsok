package hu.petrik.bankiSzolgaltatasok;

public abstract class Szamla extends BankiSzolgaltatas {
    protected int aktualisEgyenleg;

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void befizet(int osszeg){
        this.aktualisEgyenleg += osszeg;
    }

    public abstract boolean kivesz(int osszeg);

    public Kartya ujKartya(String kartyaSzam){
        return new Kartya(this.getTulajdonos(), this, kartyaSzam );
    }
}
