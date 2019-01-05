import java.util.Scanner;
import java.lang.Math;
public class number
{
    public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int p=sc.nextInt();
int i;
for(i=t;i<=p;i++)
{ 
int j=i;
int r=0,s=0;
while(i>0)
{
r=i%10;
s=s*10+Math.pow(r,3);
i=i/10;
}
if(j==i)
System.out.println("armstrong");
else
System.out.println(" No armstrong");
}
}