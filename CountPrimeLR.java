import java.util.*;
public class CountPrimeLR {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int L=in.nextInt();
        int R=in.nextInt();
        countPrime(L,R);
    }
    public static void countPrime(int L,int R){
        boolean[] primes = new boolean[R+1];
        for(int i=2;i<R;i++)primes[i]=true;
        primes[0]=primes[1]=false;
        for(int i=2;i*i<=R;i++){
            if(primes[i]){
                for(int j=i*i;j<=R;j+=i)primes[j]=false;
            }
        }
        int count=0;
        for(int i=L;i<=R;i++){
            if(primes[i])count++;
        }
        System.out.println("Count of prime between "+L+"-"+R+" "+count);

    }
}
