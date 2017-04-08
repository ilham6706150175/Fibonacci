package jurnal8;

import java.util.Scanner;

public class Jurnal8 {
    
    public static void main(String[] args) {
        long hasil = 0;
        Scanner show = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Deret Fibonacci : ");
        int n = show.nextInt();
        long fib[] = new long[n];
        
        fib[0] = 1;
        fib[1] = 1;
        
        for(int i=2; i<n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        
        for(int i=n-1; i>=0; i--){
            System.out.println(fib[i] + " ");
        }
        
    }
}
