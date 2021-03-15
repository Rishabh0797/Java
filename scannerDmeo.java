import java.util.Scanner;

class scannerDmeo
{
	public static void main(String[] args) {
	    Scanner kb=new Scanner(System.in);
	    String name;
	    name=kb.next();                        //Scans String
	    int age;
	    age=kb.nextInt();                      //Scans Integer
	    double s;
	    s=kb.nextDouble();                    //Scans Double
		System.out.println(name+" "+age+" "+s);
	}
}
