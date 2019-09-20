
package sequentialsearch;
import java.util.Scanner;
public class SequentialSearch {

    public static void main(String[] args) {
        String cari;
        boolean found = false;
        String[] data = {"Utara","Selatan","Timur","Selatan"};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan data yang ingin dicari");
        cari = input.next();
        for (String data1 : data) {
            if(cari == null ? data[1] == null : cari.equals(data[1])) {
                found = true;
                break;
            }
    }
        
        if (found == true) {
            System.out.println("Data ditemukan!");
        }else{
            System.out.println("Data tidak ditemukan!");
        }
    }
    
}
