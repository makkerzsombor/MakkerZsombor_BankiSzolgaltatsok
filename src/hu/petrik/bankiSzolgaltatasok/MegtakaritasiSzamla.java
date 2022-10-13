package hu.petrik.bankiSzolgaltatasok;

public class MegtakaritasiSzamla extends Szamla{
    private double kamat;
    public static double alapkamat = 1.1;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        kamat = alapkamat;
    }

    @Override
    public boolean kivesz(int osszeg) {
        if (getAktualisEgyenleg() - osszeg >= 0){
            this.aktualisEgyenleg -= osszeg;
            return true;
        }
        return false;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public void kamatJovairas(){
        this.aktualisEgyenleg = (int) (getAktualisEgyenleg() * this.kamat);
    }
}
