import java.util.stream.IntStream;


//karl eerik kotter 

public class H3 {
    public static void main(String[] args) {

    int [] numbrid = {12,5,10,10,28,17,5,19,0,13,0,22,7,0,17,2,24,1,13,29,0,7,16,8,7,4,27,8,8,23,26,25,15,2,26,1};
    int [][] tempsjakups = {{1,23},{2,15},{3,29},{4,15},{5,26},{6,17},{7,26},{8,15},{9,28},{10,12},{11,24},{12,16},{13,21},{14,10},{15,10},{16,26},{17,27},{18,19},{19,14},{20,14},{21,14},{22,26},{23,20},{24,28},{25,29},{26,11},{27,28},{28,19},{29,25},{30,12}};
    int esimeneArv = numbrid[0];
    int viimaneArv = numbrid[numbrid.length - 1];
    int elementideArv = numbrid.length;
    int elementideSumma = IntStream.of(numbrid).sum();
    
    float summa = 0;
    int i = 0;
    while(i < numbrid.length) {
        summa += numbrid[i];
        i++;
    }
    float elementideKeskmine = (summa / numbrid.length);




    System.out.println("Esimene arv: "+esimeneArv+"\n"+"Viimane arv: " +viimaneArv);
    System.out.println("Elementide arv: "+elementideArv);
    System.out.println("Elementide summa; "+ elementideSumma);
    System.out.println("Elementide keskmine; "+ elementideKeskmine);


    int ridadeArv = tempsjakups.length;
    int veergudeArv = tempsjakups[0].length;
    
    for (int l = 0; l < ridadeArv; l++) {
        for (int j = 1; j < veergudeArv; j++) {
            System.out.print(tempsjakups[i][j] + " ");
        }

    }
}
}