import java.util.ArrayList;
import java.util.List;

class Osoba
{
    private String imie;
    private String nazwisko;
    private int indeks;

    Osoba()
    {

    }

    Osoba(String imie, String nazwisko, int indeks)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public void setImie(String imie)
    {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }

    public void setIndeks(int indeks)
    {
        this.indeks = indeks;
    }

    public String getImie()
    {
        return imie;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public int getIndeks()
    {
        return indeks;
    }

    public void daneOsobowe()
    {
        System.out.print("Imie: " + getImie() + " ,nazwisko: " + getNazwisko() + " ,indeks: " + getIndeks() + ".\n");
    }
}

class Student
{
    private Osoba osoba;
    private WydzialEnum wydzial;
}

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)
            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */

        List<Student> listaStudentow = new ArrayList<>();

        Student a = new Student();
        listaStudentow.add(a);
        Student b = new Student();
        listaStudentow.add(b);
        Student c = new Student();
        listaStudentow.add(c);
        Student d = new Student();
        listaStudentow.add(d);
        Student e = new Student();
        listaStudentow.add(e);

        for (Student x : listaStudentow)
        {
            System.out.println(a.toString());
        }

    }
}