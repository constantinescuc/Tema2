import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {


    /*
      b.
     1 Citit un numar de la tastatura si stocati valoarea lui intr-o variabila. Generati un numar random intre 1 si 100 si
       stocati acel numar intr-o alta variabila. Daca numarul introdus de la tastatura este mai mic decat numarul random
       generat, afisati mesajul “Numarul introdus este mai mic decat <numar_random>” (inserati valoarea numarului random
       generat in textul afisat).
       */
    public static void punctulB1(){

        Scanner scanner = new Scanner(System.in);
       System.out.println("introduce-ti un numar la tastatura de la 1 la 100");
        int numar = scanner.nextInt();
        int numarGenerat = (int)(Math.random() * 101);
       if (numar < numarGenerat) {
        System.out.println("Numarul generat este mai mare " + numarGenerat);
        }else {System.out.println("Numarul introdus este " + numar + " iar numarul generat este " + numarGenerat);
        }

    }

      /* 2Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile. Folosind structura switch, daca s-a
       introdus un caracter anume, realizati operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran:

        -‘a’: adaugare
        -‘s’: scadere
        -‘i’: inmultire
        -‘p’: impartire
        -‘m’: modul
       Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.
          */
     public static void punctulB2(){
   Scanner input=new Scanner(System.in);
   char operator;
   Double numar1,numar2, result;

    System.out.println("alge-ti o operatie: a - adunare, s - scadere, i - inmultire, p - impartire, m - modul");
   operator = input.next().charAt(0);
      System.out.println("introduce-ti primul numar");
      numar1 = input.nextDouble();;

       System.out.println("introduce-ti al doilea numar");
       numar2 = input.nextDouble();;

       switch (operator) {

           case 'a':
               result = numar1 + numar2;
               System.out.println(numar1 + " + " + numar2 + " = " + result);
               break;

           case 's':
              result = numar1 - numar2;
              System.out.println(numar1 + " - " + numar2 + " = " + result);
               break;

          case 'i':
               result = numar1 * numar2;
               System.out.println(numar1 + " * " + numar2 + " = " + result);
               break;

           case 'p':
               result = numar1 / numar2;
               System.out.println(numar1 + " / " + numar2 + " = " + result);
               break;

           case 'm':
               result = numar1 % numar2;
               System.out.println(numar1 + " % " + numar2 + " = " + result);
               break;

           default:
               System.out.println(" operator invalid!");
               break;
}
}
          /* 3.Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3, respectiv 5 elemente.
         Initializati array-ul. Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.*/

    public static void punctulB3() {
    int[][] array = new int[3][5];
    for (int i = 0; i<=2; i++){
        for( int j= 0; j<=4; j++){
            array[i][j] = i+j;

        }
        }
        System.out.println(array[0][0]);
        System.out.println(array[2][4]);
    }

    /* 4.Definiti un array de char-uri. Iterati array-ul folosind structura for, si afisati pe ecran cate al doilea
     caracter din sir.
     */
    public static void punctulB4() {
        String [] caractere = new String[10];
        caractere[0] = "alune";
        caractere[1] = "mure";
        caractere[2] = "smeura";
        caractere[3] = "gutui";
        caractere[4] = "afine";
        caractere[5] = "mere";
        caractere[6] = "prune";
        caractere[7] = "cirese";
        caractere[8] = "coacaze";
        caractere[9] = "capsuni";
        // iterare array si afisare

        for (int i = 0; i<=9; i++){
            if (i % 2 == 0) {
                System.out.println(caractere[i]);
            }
        }
    }

    /*5.Definiti un array de double, cu valori zecimale. Iterati array-ul folosind strutura for, si daca un element este
     egal cu valoarea 4.5, afisati-l pe ecran. Daca un element este mai mare decat 5, afisati mesajul “Element peste 5”
     */

    public static void punctulB5() {

        double[] zecimale = new double[6];
     zecimale[0] = 3.45;
     zecimale[1] = 21.80;
     zecimale[2] = 4.5;
     zecimale[3] = 1.45;
     zecimale[4] = 2.14;
     zecimale[5] = 12.80;

     for( int i=0 ; i<=6; i++){
         if (zecimale[i]==4.5){
             System.out.println( zecimale[i] + " numarul este 4.5");
         }else if (zecimale[i] >5){
             System.out.println(zecimale[i] + "este mai mare decat 5");
         }
     }
    }
    /*6.Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date este la alegere). Daca iteratia
     este la indexul 2, sa se sara peste. Daca iteratia este la indexul 7, sa se opreasca iteratia. Altfel, sa se
     afiseze mesajul “Index valid” pe ecran.
     */

    public static void punctulB6() {
        int[] numere = new int[9];
        //initializare array
        for (int i = 0; i<9; i++){
            numere[i] =i;
            System.out.println(numere[i]);
        }
        //prelucrare date
        for ( int i= 0; i<9; i++){
            if (i == 2){
                continue;
            }
            if ( i == 7){
                break;
            }
            System.out.println(i + " index valid ");
        }

    }
      //7.Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.

       public static void punctulB7() {

       ArrayList<Integer> lista = new ArrayList<>();

      lista.add(10);
      lista.add(20);
      lista.add(80);
      lista.add(100);
      lista.add(60);


       int suma = 0;

        for( int i = 0; i<5; i++){
            suma = suma + lista.get(i);
        }
           System.out.println(" suma " + suma);

       }

    // 8.Definiti un array si o lista. Determinati daca ele sunt goale sau nu.

    public static void punctulB8() {
        int[] nume_array  = new int[3];
        nume_array[0]= 1;
        nume_array[1]= 2;
        nume_array[2]= 3;


        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(80);
        lista.add(100);
        lista.add(60);

        // verificare array gol
        if(nume_array.length == 0){
            System.out.println("Sirul este gol");
        }else {
            System.out.println("sirul nu este gol");
        }

        lista.clear();
        // verificare ArrayList
        if(lista.isEmpty()){
            System.out.println("Lista este goala");
        }else {
            System.out.println("lista nu este goala");
        }


    }

    public static void main (String[] args){

        punctulB1();
        punctulB2();
        punctulB3();
        punctulB4();
        punctulB5();
        punctulB6();
        punctulB7();
        punctulB8();
        }
}