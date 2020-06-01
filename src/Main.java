import java.util.Scanner;

public class Main {
public static void main(String[] args) {
 Scanner sr = new Scanner(System.in);
 int n = sr.nextInt();
 int a[] = new int [n];
 int b[] = new int [n];
 for(int i=0;i<n;i++) {
a[i]=sr.nextInt();
b[i]=sr.nextInt();
 }
 Greedy(n,a,b);
}
 private static void Greedy(int n,int start[],int end[]){
int j=0;
int count = 0;
 for (int i=1;i<n;i++){
 if (start[i]>=end[j]){
 j=i;
 }else{
 count++;
 }
}
 if (n==0){
 System.out.println(count);
}else{
System.out.println(count+1);
 }
}
}