import java.util.Scanner;
public class number
{
    public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int y=sc.nextInt();
 if(y%100==0)
 {
if(y%400==0)
System.out.println("yes");
else
System.out.println("not");
}
else if(y%4==0)
System.out.println("yes");
}
}