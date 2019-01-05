import java.util.Scanner;
import java.lang.Math;
public class number
{
    public static void main(String[] args)
{
Scannersc=new Scanner(System.in);
int n=sc.nextInt();
int q=sc.nextInt();
for(int i=n;i<=q;i++)
{
for(int j=2;j<i;j++)
{
if(j%i!=0)
{
System.out.println(j);
}
}
}
}
}