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
public class Q2 { 
    
    public static void main(String[]args)
    {
        Scanner k=new Scanner(System.in);
        accountb obj=new accountb("1002","aaa"); 
        accounta in=new accounta("1001","rak",5000);
        
        System.out.println(in.getid());
        System.out.println(in.getname());
        System.out.println(in.getBalance());
        in.credit(1000);
        in.debit(2000);
        System.out.println("ENTER THE AMOUNT TO BE TRANSFERED:");
        int s=k.nextInt();
        in.transferto(0,s);
        obj.transfer(s);
        System.out.println(in);
        
        System.out.println(obj);
    } 
    
}
class accountb
{
    String id;
    String name;
    public int balanceb=0;
    accountb(String i,String n)
    {
        id=i;
        name=n;
        
    }
     void transfer(int amt)
    {
        balanceb=balanceb+amt;
    }
    
    @Override
    public String toString()
    {
       System.out.println("displaying the final balance in account b with details");
       return "name:"+name+"\nID:"+id+"\nbalance"+balanceb; 
    }
}
    
class accounta
{
    String id;
    String name;
    int balance;
    
    accounta(String i,String n,int d)
    {
        id=i;
        name=n;
        balance=d;
    }
    String getid()
    {
        return id;
    }
    String getname()
    {
        return name;
    }
    int getBalance()
    {
        return balance;
    }
    int credit(int amount1)
    {
       balance=amount1+balance;
       return balance;
    }
    int debit(int amount2)
    {
        if(amount2<=balance)
            balance=balance-amount2;
        else
            System.out.println("Amount exceeded balance");
        return balance;
    }
    int transferto(int balanceb,int amount3)
    {
    if(amount3<=balance)
    {
     balance=balance-amount3;
    }
    else
    {
      System.out.println("Amount exceeded balance");  
    }
    return balance;
    }
    @Override
    public String toString()
    {
       System.out.println("displaying the final balance in account a with details");
       return "name:"+name+"\nID:"+id+"\nbalance"+balance; 
    }
}
    

