import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int n = sc.nextInt();
        int i,m=0,flag=0;
        if(n==0||n==1){
            System.out.println(n+" is Prime Number");
        }else{
            for(i=2;i<n/2;i++){
                if(n%i==0){
                    System.out.println(n+" is not Prime Number");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(n+" is Prime Number");
            }
        }


    }
}
