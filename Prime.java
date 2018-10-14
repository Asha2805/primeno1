import java.util.*;
public class Prime
{
public static void main(String[] args)
{
int n,flag=0;
Scanner q=new Scanner(System.in);
n=q.nextInt();
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
flag=1;
}
}
if(flag==0)
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}
}
