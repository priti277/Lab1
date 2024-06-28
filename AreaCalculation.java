import java.util.scanner;

public class Field Area Calculation
{

 public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 
System.out.printIn("Please enter the width of the field in feet:  ");

 float w=sc.nextFloat();

float area=I*w;
System.out.printIn("before conveting in acer: "+area);


float areaAcer=area/43560;
System.out.printIn("The area of the flied after covnert in acer:"+areaAcer+"acers");


 }
}