public class Uczen extends Osoba{
    /*
    Uczen to klasa potomna
    Osoba to klasa bazowa
    Uczen dziedziczy wszystko? po klasie osoba
     */
    private int nrEwidencyjny;

    public Uczen(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);//wywyolujemy konstruktor klasy bazowej
    }

    public Uczen(String imie, String nazwisko,int wiek, int nrEwidencyjny) {
        super(imie,nazwisko, wiek);
        this.nrEwidencyjny = nrEwidencyjny;
    }
}
