import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 1 enum-y */

        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

        /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
        * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */


        //1a
        enum NumbersEnum {
            ONE, TWO, THREE, FOUR, FIVE, SIX;
        }
        //1b
        enum StatusEnum {
            CONTINUE, END;

        }
        //1c

        boolean size = true;
        while(size){
            System.out.println("loop works");
        }

        //1d

        Scanner scan = new Scanner(System.in);
        System.out.println("Give number");
        while (size) {
            int number = scan.nextInt();
            System.out.println(number);
        }

        //

        System.out.print("give number");
        while (true){
            int n1 = scan.nextInt();
            if( n1 == 0){
                break;
            }else {
                System.out.println(n1);
            }
        }

        //1f

        System.out.println("Give me number");
        int num;
        do {
            num = scan.nextInt();
            switch (num) {
                case 0:
                    System.out.println("End of process");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
                default:
                    System.out.println("There no such number");
                    break;
            }
        }while(num != 0);

        //1g
        System.out.println("Give number");
        while(true){
            int num1 = scan.nextInt();
            if(num1 == 0 ){
                System.out.println(StatusEnum.END.toString());
            }
        }
    }


}
