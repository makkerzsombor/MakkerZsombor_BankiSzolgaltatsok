package hu.petrik.bankiSzolgaltatasok;

import java.util.List;

public class Bank {
    private List<Szamla> szamlaLista;

    public Bank(int maxSzamlaszam) {    }

    public Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret){
        if (hitelKeret > 0){
            HitelSzamla hitelSzamla = new HitelSzamla(tulajdonos, hitelKeret);
            return hitelSzamla;
        }else if (hitelKeret == 0){
            MegtakaritasiSzamla megtakaritasiSzamla = new MegtakaritasiSzamla(tulajdonos);
            return megtakaritasiSzamla;
        }else {
            throw new IllegalArgumentException("Hitelkeret nem lehet kisebb, mint 0!");
        }
    }

    public int getOsszegyenleg(Tulajdonos tulajdonos){
        int osszesEgyenleg = 0;
        for (int i = 0; i < szamlaLista.size(); i++) {
            if (szamlaLista.get(i).getTulajdonos() == tulajdonos){
                osszesEgyenleg += szamlaLista.get(i).aktualisEgyenleg;
            }
        }
        return osszesEgyenleg;
    }

    public int legnagyobbEgyenleguSzamla(Tulajdonos tulajdonos){
        int max = 0;
        for (int i = 0; i < szamlaLista.size(); i++) {
            if (szamlaLista.get(i).aktualisEgyenleg > max ){
                max = szamlaLista.get(i).aktualisEgyenleg;
            }
        }
        return max;
    }

    public long getOsszhitelKeret(){
        int osszeg = 0;
        for (int i = 0; i < szamlaLista.size(); i++) {
            if (szamlaLista.get(i) instanceof HitelSzamla){
                osszeg += ((HitelSzamla) szamlaLista.get(i)).getHitelKeret();
            }
        }
        return osszeg;
    }
}
