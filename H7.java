//Karl eerik kotter
import java.util.Scanner;

/**
 Loo lihtne alamprogramm, mis küsib kasutajalt kahte arvu ning üritad teha mingit aritmeetilist tehet.
Programm töötab kuni kasutaja on lisanud kenasti arvud. Kui kasutaja lisab arvude asemel kogemata teksti, siis annad sellest viisakalt teada ja töötad edasi (tsükkel). Kasuta vea tuvastamiseks erindeid.
 */




public class H7 {

    public static void main(String[] args) {
            while (true){ 
                try {
                    Scanner sisestus = new Scanner(System.in);
                    System.out.print("Sisestage esimene arv liitmiseks: ");

                    int sisestus1 = sisestus.nextInt();

                    System.out.print("Sisestage teine arv liitmiseks: ");

                    int sisestus2 = sisestus.nextInt();
                    int tehe = sisestus1 + sisestus2;

                    sisestus.close();

                    System.out.println(tehe);
                    break;

                    } catch (Exception e) {

                        System.out.println("sisestage ainult arvud!"); 

                    }

            }
            
        }
        
            
        }  
        
 
