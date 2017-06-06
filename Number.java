import java.io.*;
import java.util.Scanner;
public class Number {
    public static void main(String args[])
    {System.out.println("enter no");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int count=0;
    while(n>0)
    {
    int m=n%10;
    n=n/10;
    count++;
    }
    System.out.println(count);
    }
}
