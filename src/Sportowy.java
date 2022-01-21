public class Sportowy extends Samochod
{
    protected int iloscMiejsc;
    protected int ileDoSetki;

    public Sportowy()
    {
        super();
        this.iloscMiejsc = 0;
        this.ileDoSetki = 0;
    }
    public Sportowy(int iloscMiejsc, int ileDoSetki)
    {
        this.iloscMiejsc = iloscMiejsc;
        this.ileDoSetki = ileDoSetki;
    }
    public Sportowy(String marka, String model, int pojemnosc, int cena, int iloscMiejsc, int ileDoSetki)
    {
        super(marka, model, pojemnosc, cena);
        this.iloscMiejsc = iloscMiejsc;
        this.ileDoSetki = ileDoSetki;
    }

    @Override
    public String toString()
    {
        return "Sportowy: {" + "marka='" + marka + '\'' + ", model='" + model +'\'' + ", pojemnosc='" + pojemnosc + '\'' +
                ", cena='" + cena + '\'' + ", ile sekund rozpedza sie do 100km/h='" + ileDoSetki + " sekudn" + '\'' + ", ilosc miejsc siedzacych='" + iloscMiejsc + '\'' + '}';
    }
}
