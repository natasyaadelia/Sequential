
package sequentialsearch;
import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        int k,l,m,n,o;
        k=0;
        l=0;
        m=0;
        n=0;
        o=0;
        String hk,al = new String();
        
        System.out.println("Masukkan kalimat / kata : ");
        al = baca.nextLine() ;
        char tchar[] = new char[al.length()];
        hk = al.toLowerCase();
        for(int y = 0; y < al.length(); y++){
            if(hk.charAt(y)=='a'){
                k++;
            }
            if(hk.charAt(y)=='i'){
                l++;
            }
            if(hk.charAt(y)=='u'){
                m++;
            }
            if(hk.charAt(y)=='e'){
                n++;
            }
            if(hk.charAt(y)=='o'){
                n++;
            }
    }
        System.out.println("a = "+ k);
        System.out.println("b = "+ l);
        System.out.println("c = "+ m);
        System.out.println("d = "+ n);
        System.out.println("e = "+ o);
        System.out.println("total = "+ (k+l+m+n+o));
}
}
