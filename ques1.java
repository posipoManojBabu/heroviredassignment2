import java.util.Scanner;
public class ques1 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int A[]=new int[n];
    for(int i=0;i<n;i++){
        A[i]=sc.nextInt();
    }
    for(int i=1;i<n;i++){
        A[i]=A[i]+A[i-1];
    }
    for(int m:A){
        System.out.print(m+" ");
    }
 }   
}
