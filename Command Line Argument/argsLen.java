class argsLen
{
public static void main(String args[])
{
int n,num,sum=0;
n=args.length;
System.out.println("Length of Command Line Argument is "+n);
for(int i=0;i<n;i++)
{
   System.out.println(i+" Argument is "+args[i]);
   num=Integer.parseInt(args[i]); 
   sum+=num;
}
System.out.println("Sum is "+sum);

}
}