import java.util.*;
public class primerange {
public static boolean isprime(int n){
    boolean isprime = true;
    if(n==2){
        return true;
    }
    for(int i=2; i<=n-1;){
        if(n %i==0)
        isprime=false;
        break;
    }
    return isprime;
}  
public static void primeinrange(int n){
    for(int i= 2; i<=n-1;i++){
        if( isprime(i) ==true){
            System.out.println(i);
        }
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner  (System.in);
    int n = sc.nextInt();
    primeinrange(n);
}
}
