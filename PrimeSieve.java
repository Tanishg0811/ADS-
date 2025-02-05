import java.util.*;
public class PrimeSieve {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int n=in.nextInt();
        prime(n);
    }
    public static void prime(int n){
        boolean[] primes = new boolean[n+1];
        for(int i=2;i<n;i++)primes[i]=true;
        primes[0]=primes[1]=false;
        for(int i=2;i*i<=n;i++){
            if(primes[i]){
                for(int j=i*i;j<=n;j+=i)primes[j]=false;
            }
        }

        for(int i=2;i<=n;i++){
            if(primes[i])System.out.print(i+" ");
        }

    }
}
