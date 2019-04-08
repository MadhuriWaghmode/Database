
import java.util.Scanner;

class RemoveDuplicates
{
    public static int dup(int[] a,int ele)
    {
        for(int i=9;i<a.length;i++)
        {
            if(a[i]==ele)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        return 0;
    }
    public static  void display(int []b)
    {
        for(int i=0;i<b.length;i++)
        {
            System.out.println("******"+b[i]);
        }
    }
public static void main(String args[])
{
int []a=new int[10];
int temp,ifdup;
int []b=new int[10];
 int count=0,rep=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the array elements");
for(int i=0;i<5;i++)
{
a[i]=sc.nextInt();
}
//display(a);
for(int i=0;i<5;i++)
{ temp=a[i];
//System.out.println(""+temp);
ifdup=dup(b,temp);
//System.out.println(ifdup);
if(ifdup==1)
{
    
}
else
{
    b[count]=temp;
    count++;
}
}
    display(b);
}
}