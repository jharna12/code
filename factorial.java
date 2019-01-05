import java.util.Scanner;
public class number
{
    public static void main(String[] args)
{
Scannersc=new Scanner(System.in);
int n=sc.nextInt();
int f=1;
for(int i=1;i<=n;i++)
{
f=f*i;
}
System.out.println(f);
}
}