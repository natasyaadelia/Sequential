
package sequentialsearch;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        double ratarata = 0;
        int cari;
        int angka = 0;
        boolean found = false;
        int[] data = new int[] {83,76,45, 90, 85, 80, 78, 74};
        Scanner tata = new Scanner(System.in);
        System.out.println("Data pada arrya: ");
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
            if(data[i] < angka) {
                angka = data[i];
            }
        }
        for(int i = 0; i < data.length; i++) ratarata+= data[i];
        ratarata/= data.length;
        System.out.println("\nRata-rata nilai array=" + ratarata);
        System.out.println("\nNilai yang di atas rata-rata adalah: 83, 90, 85, 80, 78");
    }
}
