public class Main {
    public static void main(String[] args) {
        /*
        Osoba osobaJas=new Osoba("Jas", "Kowalski", 12);
        System.out.println("Imie: "+osobaJas.getImie());
        osobaJas.setImie("Jan");
        System.out.println("Imie nowe: "+osobaJas.getImie());
        Osoba osobaIsia= new Osoba("Isia","Iksinska");
        Osoba osbaX=new Osoba();
        System.out.println(osobaIsia.getWiek());
        System.out.println(osbaX.getWiek());

        System.out.println(osobaIsia);
        */
        System.out.println("liczba utworzonych obiektow; "+Uczen.liczbaObiektow);
        Uczen uczenJas= new Uczen("jas","nowak",7, 237);
        System.out.println("liczba utworzonych obiektow; "+Uczen.liczbaObiektow);
        Uczen uczenBasia= new Uczen("basia","msia",8, 2);
        System.out.println("liczba utworzonych obiektow; "+Uczen.liczbaObiektow);
        Uczen uczenMarek= new Uczen("marek","Sldddedz",7, 7);
        System.out.println("liczba utworzonych obiektow; "+Uczen.liczbaObiektow);
        Uczen uczenMaciek= new Uczen("maciek","Sledzik",7, 297);
        System.out.println("liczba utworzonych obiektow; "+Uczen.liczbaObiektow);
        Uczen uczenEmil= new Uczen("Emil","Sledz",7, 9);
        System.out.println(uczenEmil);
        System.out.println("liczba utworzonych obektow"+Uczen.liczbaObiektow);
    }

}
