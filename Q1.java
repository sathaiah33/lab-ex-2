/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LABEX.NO2;

import java.util.Scanner;

/**
 *
 * @author rakesh
 */

 class student1
 {
    int eng;
    int tam;
    int math;
    int bio;
    int chem;
    String name;
    String status;
    int avg;
    int tot;
    void getdata()
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the marks");
    eng =in.nextInt();
    tam =in.nextInt();
    math=in.nextInt();
    bio=in.nextInt();
    chem=in.nextInt();
    }
    void Markcal()
    {
     tot=eng+tam+math+chem+bio;
     System.out.println("TOTAL="+tot);
     avg=(eng+tam+math+chem+bio)/5;
     System.out.println("average="+avg);
     System.out.println("Status calculation:");
     if((eng>40)&&(math>40)&&(tam>40)&&(chem>40)&&(bio>40))
     {
     status="pass";
     System.out.println(status);
     }
     else
     {
         status="fail";
         System.out.println(status);
         
     }
     
    }
    student1(String n)
    {
        name=n;
    }
    void display()
    {
        System.out.println("student name:"+name);
        
        
    }
}
public class Q1
{
public static void main(String[]args)
 { 
    int i;
    String n;
    Scanner in=new Scanner(System.in);
    student1 obj[]=new student1[10];
    for(i=0;i<5;i++)
    {
        System.out.println("Enter the student name");
    n=in.next();
    obj[i]= new student1(n);
    obj[i].getdata();
    obj[i].display();
    obj[i].Markcal();
    
    
    }
 }
}

