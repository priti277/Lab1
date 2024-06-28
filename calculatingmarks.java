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