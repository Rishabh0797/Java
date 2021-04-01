import java.util.*;

class room
{
   int l,b,h;
   Scanner kb=new Scanner(System.in);
  
   void getdata()
   {
     System.out.println("Enter Length : ");
     l=kb.nextInt();
     System.out.println("Enter Breadth : ");
     b=kb.nextInt();
     System.out.println("Enter Height : ");
     h=kb.nextInt();
   }

   void vol()
   {
     System.out.println("Volume of room is : "+(l*b*h));
   }
}

class volume
{
  public static void main(String args[])
  {
    room r=new room();

    r.getdata();
    r.vol();
  }
}