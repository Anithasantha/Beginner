import java.io.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int num=1,power,n;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    power=sc.nextInt();
	    for(int i=0;i<power;i++){
	        num=num*n;
	    }
		System.out.println(num);
	}
}
