import java.util.*;
public class Arguments
{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
System.out.print("Enter the noof arguments do you want:");
int n=sc.nextInt();
 args = new String[n];
if (n<6){
for(int i=0;i<n;i++)
{
args[i]=sc.nextLine();
}
System.out.println("your argument values are:");
for(int i=0;i<n;i++)
{
System.out.println(args[i]);
}
}
else
{
System.out.println("see your limit");
}
}
}