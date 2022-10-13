package hu.petrik.bankiSzolgaltatasok;

public class HitelSzamla extends Szamla{
    private int hitelKeret;
    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }
    @Override
    public boolean kivesz(int osszeg) {
        return false;
    }
}
