import java.util.Scanner;
public class number
{
    public static void main(String[] args)
{
Scannersc=new Scanner(System.in);
int n=sc.nextInt();
int t=0;
for(int i=2;i<n;i++)
{
if(n%i==0)
{
t=1;
break;
}
}
if(t==1)
System.out.println(" Not Prime");
else
System.out.println("Prime");
}
}