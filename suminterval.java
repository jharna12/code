import java.util.Scanner;
public class number
{
    public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int s=0;
for(int i=n;i<=k;i++)
{
s=s+i;
}
System.out.println(s);
}
}