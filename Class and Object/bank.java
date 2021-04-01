import java.util.Scanner;
 
class DemoBank
{
  int acct;
  String name;
  double bal;
  private String pass;
 
  Scanner kb=new Scanner(System.in);

  void getdata()
  {
    System.out.println("Enter Account number : ");
    acct=kb.nextInt();
    System.out.println("Enter Name : ");
    kb.nextLine();
    name=kb.nextLine();
    System.out.println("Enter balance : ");
    bal=kb.nextDouble();
    System.out.println("Set your password");
    pass=kb.next();
  }

  void deposite()
  {
    int amt;
    System.out.println("Enter amount to be deposite : ");
    amt=kb.nextInt();
    bal=bal+amt; 
  }

  void withdrawl()
  {
    int amt;
     String p;
    System.out.println("Enter amount to be withdrawl : ");
    amt=kb.nextInt();
    System.out.println("Enter your password : ");
    p=kb.next();
    if((bal-amt)>=0 && p.equals(pass)){
      bal=bal-amt; 
      }
    else{
     System.out.println("Can't Withdrawl, SORRY" );
       }
  }

  void display()
  {
    System.out.println("Hello Sir/Madam : "+name+"  Your current balance : "+bal);
  }
}

class bank
{
  public static void main(String args[])
  {
    DemoBank r=new DemoBank();
    
    r.getdata();
    Scanner kb = new Scanner(System.in);
    int n;
    System.out.println("Enter 1 => Deposite  or  Enter 2 => Withdrawl");
    System.out.println("Enter your choice : ");
    n=kb.nextInt();
    switch(n)
    {
      case 1:r.deposite();
             break;
      case 2:r.withdrawl();
             break;
      default:System.out.println("Enter valid choice :");
    }
    r.display();
  }
}