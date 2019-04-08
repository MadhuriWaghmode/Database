import static java.lang.System.out;
import java.util.Scanner;

class secondLarge
{
public static void main(String args[])
{
int []a=new int[10];
int temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter array elements");
for(int i=0;i<10;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<10;i++)
{
for(int j=i;j<10;j++)
{
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("Second largest number in the array"+a[1]);
}
}