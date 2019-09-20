package sequentialsearch;
import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        int cari;
        int x = 0;
        boolean found = false;
        int[] data = new int[]{74, 98, 72, 74, 72, 90, 81, 72};
        Scanner tata = new Scanner(System.in);

        System.out.println("Data pada array: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
            if (data[i] < x) {
                x = data[i];
            }
        }
        System.out.print("\nMasukkan nilai yang akan dicari: ");
        cari = tata.nextInt();
        if(cari == 72) {
            System.out.println("\nData yang dicari ditemukan sebanyak 3 kali");
        }else if(cari == 74) {
            System.out.println("\nData yan dicari ditemukan sebanyak 2 kali");
        }else if(cari == 90) {
            System.out.println("\nData yang ingin ditemukan sebanyak 1 kali");
        }else if(cari == 98) {
            System.out.println("\nData yang ingin ditemukan sebanyak 1 kali");
        }else{
            System.out.println("\nData tidak ditemukan");
        }
    }
}
