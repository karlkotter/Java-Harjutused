import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

//Karl Eerik Kotter

/* 
Loo uus klassi fail ja lisa kõige ette oma nimega kommentaar
Loo alamprogramm, mis lubab kasutajal lisada erinevaid täisarve kuni ta soovib (kui kasutaja jätab sisestuse tühjaks, siis tsükkel katkestatakse).
Lisatud täisarvud lisatakse loendisse, leitakse kogu summa ja keskmine (kasuta alamprogramme)
Kõik arvud, summa ja keskmine salvestatakse tekstifaili
*/


public class H6 {

     public static void main(String[] args) {
 
          ArrayList<Integer> arvud = new ArrayList<Integer>(); // tegin array kuhu lahevad koik arvud
 
          System.out.println("sisestage numbrid, lopetuseks vajutage enterit");
          Scanner sisestus = new Scanner(System.in);
 
          while (true) {
 
               String sisestus1 = sisestus.nextLine(); // kusib niikaua kuniks kasutaja sisestab kas enteri voi tahe
 
               if (sisestus1.equals("")) { // Siin loppeb kogumine ara kuna vajutati enterit
 
                    System.out.println("Vajutasite enterit\n");
                    break;
 
               } else {

                    int arv = Integer.parseInt(sisestus1);
                    arvud.add(arv);

              }
         }

         System.out.println("Sisestatud arvud: " + arvud); // valjastan enda jaoks koik arvud naha et koik ikka tootab
         int summa = summa(arvud); // votab alumisest alamprogrammist arvud
         double keskmine = keskmine(arvud);
         System.out.println("Arvude summa: " + summa + ", Arvude keskmine: " + keskmine);
         

          try { // txt faili salvestamine
               FileWriter fail = new FileWriter("arvud.txt");
               fail.write("Sisestatud arvud: " + arvud + "\n");
               fail.write("Arvude summa: " + summa + "\n");
               fail.write("Arvude keskmine: " + keskmine);
               fail.close();
          } catch (IOException e) {
               System.out.println("salvestamine feilis");
          }
     }


     
     //alamprogramm et leida summa, ja see hiljem valjastada
     public static int summa(ArrayList<Integer> arvud) {
         int summa = 0;
         for (int arv : arvud) {
             summa += arv;
         }
         return summa;
     }
     
     //alamprogramm et leida keskmine 
     public static double keskmine(ArrayList<Integer> arvud) {
         int summa = summa(arvud);
         double keskmine = (double) summa / arvud.size();
         return keskmine;
     }
}
 
          
