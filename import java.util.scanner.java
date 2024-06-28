import java.util.scanner;

public class AreaToFind
{
 Scanner sc=new
Scanner(System.in);
float area=0;

public float square()
{
 System.out.printIn("enter length of the square:");
 float s=sc.nextFloat();
 return area=s*2;
}

public float rectangle()
{
 System.out.printIn("enter length and width");
 float l=sc.nextFloat();
 float w=sc.nextFloat();
 return area = l*w;
}

public float triangle()
{
 System.out.printIn("enter base and height");
 float b=sc.nextFloat();
 float h=sc.nextFloat();
 return area =(b*h)/2
}

public static void main(String[] args)
{
 //TODO Auto-generated method stub
 Area ToFind ar=new AreaToFind();
    System.out.printIn(ar.square());
 System.out.printIn(ar.rectangle());
System.out.printIn(ar.triangle());

 }
}

 46 changes: 46 additions & 0 deletions46  
calculatingMarks.txt
Original file line number	Diff line number	Diff line change
@@ -0,0 +1,46 @@
package com.prac;

import java.util.scanner;

public class CalculatingMarks 
{
 public Static void main(String[] args){
        //TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.printIn("Enter marks of Tamil ");
        float Tam=sc.nextFloat();
        System.out.printIn("Enter marks of English ");
        float eng=sc.nextFloat();
        System.out.printIn("Enter marks of Maths: ");
        float math=sc.nextFloat();
        System.out.printIn("Enter marks of Social: ");
        float soc=sc.nextFloat();
        System.out.printIn("Enter marks of Science: ");
        float sci=sc.nextFloat();

        float sum=(Tam+eng+math+soc+sci)/5;

        if(sum>=55 && sum<=60)
        {
            System.out.printIn(" Your grade is A: "+sum);
        }
        else if(sum>=60 && sum<=80)
        {
            System.out.printIn(" Your grade is B: "+sum);
        }
        else if(sum>=70 && sum<=90)
        {
            System.out.printIn(" Your grade is c: "+sum);
        }
        else if(sum>=80 && sum<=90)
        {
            System.out.printIn( "Your grade is A: "+sum);
        }
        else 
        {
            System.out.printIn(" Your are Fail: "+sum);
        }
   }
}
