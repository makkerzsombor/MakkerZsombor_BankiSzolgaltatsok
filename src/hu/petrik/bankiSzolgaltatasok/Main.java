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

        System.out.println("Össz hitel keret: "+bank.getOsszhitelKeret());

        HitelSzamla szamla2 = (HitelSzamla) bank.szamlanyitas(peldaTulajdonos, 9999);
        szamla2.befizet(10000);
        System.out.println("Legnagyobb értékű számlánk: "+bank.legnagyobbEgyenleguSzamla(peldaTulajdonos));

        MegtakaritasiSzamla megtakaritasiSzamla2 = new MegtakaritasiSzamla(peldaTulajdonos);
        System.out.println("Kamat: "+megtakaritasiSzamla2.getKamat());
        megtakaritasiSzamla2.befizet(100);
        megtakaritasiSzamla2.kamatJovairas();
        System.out.println("Kamat jóváírás: "+megtakaritasiSzamla2.getAktualisEgyenleg());
        megtakaritasiSzamla2.setKamat(1.2);
        System.out.println("Kamat átírás: "+megtakaritasiSzamla2.getKamat());

        megtakaritasiSzamla2.ujKartya("1234 8695 6571 1964");
        System.out.println(kartya.getKartyaSzam());
    }
}
