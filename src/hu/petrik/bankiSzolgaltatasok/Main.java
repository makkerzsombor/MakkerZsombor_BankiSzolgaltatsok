package hu.petrik.bankiSzolgaltatasok;

public class Main {
    public static void main(String[] args) {
        Tulajdonos peldaTulajdonos = new Tulajdonos("Makker Zsombor");
        Szamla szamla = new MegtakaritasiSzamla(peldaTulajdonos);
        System.out.println(peldaTulajdonos.getNev());

        szamla.befizet(20000);
        System.out.println("Számla értékek: "+ szamla.aktualisEgyenleg);
        szamla.kivesz(10000);
        System.out.println("Számla értéke kivétel után: "+ szamla.aktualisEgyenleg);

        HitelSzamla hitelSzamla = new HitelSzamla(peldaTulajdonos, 300);
        System.out.println("Hitelkeretem: "+hitelSzamla.getHitelKeret());
        hitelSzamla.kivesz(100);
        System.out.println("Hitelkeretem kivonás után: "+hitelSzamla.getHitelKeret());

        Kartya kartya = new Kartya(peldaTulajdonos, szamla, "5431 2344 6267 1627");
        System.out.println("Kártyám száma: "+kartya.getKartyaSzam());
        kartya.vasarlas(100);
        System.out.println("A kartyam vásárlás után: "+szamla.aktualisEgyenleg);

        Bank bank = new Bank();
        HitelSzamla szamla1 = (HitelSzamla) bank.szamlanyitas(peldaTulajdonos, 9999);
        szamla1.befizet(10000);
        System.out.println("ossz egyenlegem: "+bank.getOsszegyenleg(peldaTulajdonos));
        szamla1.kivesz(15000);
        System.out.println("ossz egyenlegem kivonás után: "+bank.getOsszegyenleg(peldaTulajdonos));
    }
}
