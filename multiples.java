import java.util.Scanner;
public class number
{
    public static void main(String[] args)
{
Scannersc=new Scanner(System.in);
int n=sc.nextInt();
int s=0;
for(int i=1;i<=n;i++)
{
s=n*i;
System.out.println(s);
}
}