import java.util.Scanner;
public class number
{
    public static void main(String[] args)
{
Scannersc=new Scanner(System.in);
int n=sc.nextInt();
int q=sc.nextInt();
for(int i=n;i<=q;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
}
}