mport java.io.*;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int N,K,sum=0;
    int a[]=new int[100];
    Scanner sc=new Scanner(System.in);
    N=sc.nextInt();
    K=sc.nextInt();
    for(int i=0;i<N;i++)
      a[i]=sc.nextInt();
    for(int j=0;j<K;j++)
      sum=sum+a[j];
    System.out.println(sum);
  }
}
