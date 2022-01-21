import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */
        Samochod samochod = new Samochod("Honda", "Accord", 2200, 30000);
        System.out.println(samochod.toString());

        Jeep jeep = new Jeep("Mitsubishi", "Outlander", 1800, 45000, 23);
        System.out.print(jeep.toString());

        Sportowy sportowy = new Sportowy("Porshe","911", 6000, 35000,2,6);
        System.out.println(sportowy.toString());

        List<Samochod> listaSamochodow = new ArrayList<>();
        listaSamochodow.add(samochod);
        listaSamochodow.add(jeep);
        listaSamochodow.add(sportowy);

        System.out.println(listaSamochodow);
    }
}
