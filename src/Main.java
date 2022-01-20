import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        Student one = new Student();
        one.name = "Piotr";
        one.surname = "Rynkowski";
        one.indexNum = 1111;
        one.scholarship = false;

        Student two = new Student();
        two.name = "Magda";
        two.surname = "Pietraszek";
        two.indexNum = 1112;
        two.scholarship = true;

        Student three = new Student();
        three.name = " Iza ";
        three.surname = " Rybińska";
        three.indexNum = 1113;
        three.scholarship = false;

        String[]tab1 = new String[]{one.name, two.name, three.name};
        String[] tab2 = new String[]{one.surname, two.surname, three.surname};
        int[] tab3 = new int[]{one.indexNum, two.indexNum, three.indexNum};
        boolean[] tab4  = new boolean[]{one.scholarship, two.scholarship, three.scholarship};
        for (int i = 0; i< tab1.length; i++)
        {
            System.out.print(tab1[i] + " " );
        }
        System.out.print("\n");

        for (int i = 0; i< tab2.length; i++)
        {
            System.out.print(tab2[i] + " ");
        }

        System.out.print("\n");

        for (int i = 0; i < tab3.length; i ++){
            System.out.print(tab3[i] + " ");
        }

        System.out.print("\n");

        for ( int i = 0; i < tab4.length; i++){
            System.out.print(tab4[i] + " ");
        }
    }
}
