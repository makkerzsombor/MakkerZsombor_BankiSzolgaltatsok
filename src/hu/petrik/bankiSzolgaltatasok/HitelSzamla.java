package hu.petrik.bankiSzolgaltatasok;

public class HitelSzamla extends Szamla{
    private int hitelKeret;
    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }
    @Override
    public boolean kivesz(int osszeg) {
        if (osszeg <= this.hitelKeret + this.aktualisEgyenleg){
            return true;
        }else {
            return false;
        }
    }
    public int getHitelKeret() {
        return this.hitelKeret;
    }

}
