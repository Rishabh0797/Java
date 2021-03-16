import java.util.Scanner;

class rect
{
   int l,b;
   Scanner kb=new Scanner(System.in); 
   
   void getdata()
   {
     System.out.println("Enter Length : ");
     l=kb.nextInt();
     System.out.println("Enter Breadth : ");
     b=kb.nextInt();
   }

   void area()
   {
     int ar=0;
     ar=l*b;
     System.out.println("Area of rectangle is: "+ar);
   }

   void perimeter()
   {
     int pr;
     pr=2*(l+b);
     System.out.println("Perimeter of rectangle is: "+pr);
   }
}

class rectangle
{
  public static void main(String args[])
  {
    rect r=new rect();
    
    r.getdata();
    r.area();
    r.perimeter();
  }
}
