import java.util.Scanner;
public class number
{
    public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int s=0,t=0;
for(int i=1;i<=n;i++)
{
s=s+i;
    if(k==i)
    {
break;
t=1;
    }
}
if(t==1)
System.out.println(s);
}
}