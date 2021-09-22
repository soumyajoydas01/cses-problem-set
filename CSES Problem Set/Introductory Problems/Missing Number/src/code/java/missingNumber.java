import java.util.*;
public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long sum = n*(n+1)/2;
        long temp =0;
        for (int i = 1; i < n; i++) {
            long k = sc.nextLong();
            temp = temp+k;
        } 
        
        long ans = sum - temp;
        System.out.println(ans);
        sc.close();
    }
    
}