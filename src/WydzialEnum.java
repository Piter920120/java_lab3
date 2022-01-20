public enum WydzialEnum
{
    ;
    String nazwa;
    String lokalizacja;

    WydzialEnum(String nazwa, String lokalizacja)
    {
        this.nazwa = nazwa;
        this.lokalizacja = lokalizacja;
    }

    WydzialEnum()
    {

    }

    public void setNazwa()
    {
        this.nazwa = nazwa;
    }

    public void setLokalizacja()
    {
        this.lokalizacja = lokalizacja;
    }

    public String getNazwa()
    {
        return nazwa;
    }

    public String getLokalizacja()
    {
        return lokalizacja;
    }

    @Override
    public String toString() {
        return "Nazwa wydzialu: " + getNazwa() + " ,lokalizacja: " + getLokalizacja();
    }
}