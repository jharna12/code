import java.util.Scanner;
public class number
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n%2==0)
System.out.println("even");
else if(n%2!=0)
System.out.println("odd");
else if(n<0)
System.out.println("Invalid");
}
}