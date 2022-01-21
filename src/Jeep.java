public class Jeep extends Samochod
{
    protected int wielkoscKol;

    public Jeep()
    {
        super();
        this.wielkoscKol = 0;
    }
    public Jeep(int wielkoscKol)
    {
        this.wielkoscKol = wielkoscKol;
    }
    public Jeep(String marka, String model, int pojemnosc, int cena, int wielkoscKol)
    {
        super(marka, model,pojemnosc, cena);
        this.wielkoscKol = wielkoscKol;
    }

    public int getWielkoscKol() {
        return wielkoscKol;
    }

    public void setWielkoscKol(int wielkoscKol)
    {
        this.wielkoscKol = wielkoscKol;
    }

    @Override
    public String toString()
    {
        return "Jeep: {" + "marka='" + marka + '\'' + ", model='" + model +'\'' + ", pojemnosc='" + pojemnosc + '\'' +
                ", cena='" + cena + '\'' + ", wielkosc kol='" + wielkoscKol + " cali" + '\'' + '}';
    }
}
