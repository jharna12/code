import java.util.Scanner;
import java.lang.Math;
public class number
{
    public static void main(String[] args)
{
Scannersc=new Scanner(System.in);
int t=sc.nextInt();
int n;
n=t;
int r=0,s=0;
while(n>0)
{
r=n%10;
s=s*10+Math.pow(r,3);
n=n/10;
}
if(s==t)
System.out.println("Pallindrome");
else
System.out.println(" No Pallindrome");
}
}