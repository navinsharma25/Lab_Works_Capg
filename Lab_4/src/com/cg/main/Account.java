package com.cg.main;

public class Account {
	  protected int accNum; 
	  protected double balance;
}	
class SavingsAccount extends Account{
	
	public SavingsAccount(double balance, int accNum)
	{
		{ if (balance > 500.0)
			 this.balance = balance; 
			 this.accNum=accNum; 
		}
	}
	public void deposit(double deposit)
	{
		if (deposit > 500.0)    
	          balance+=deposit; 
	       else
	       {
	    	   System.out.println("Please deposit money greater than 100");
	       }
	}
	public void withdraw(double withdraw)
	{
		   balance-=withdraw;
		   
		   if(balance<500)
		   {
			   balance+=withdraw;
			   System.out.println("\nCannot withdraw money: "+balance);
		   }
		   else
			   System.out.printf("\n%f Debited successfully from account%n%n",withdraw);
	}
}
class CurrentAccount extends Account{
public CurrentAccount(double balance, int accNum) { 
	  { 
		  if (balance > 500.0)
			  this.balance = balance; 
		  this.accNum=accNum; 
	  } 
}
	public void deposit(double deposit)
	{
		if (deposit > 500.0)    
	          balance+=deposit; 
	       else
	       {
	    	   System.out.println("Please deposit money greater than 500");
	       }
	}
public void withdraw(double withdraw) 
{ 
	  balance-=withdraw;

			System.out.printf("\n%f Debited successfully from account%n%n",withdraw); 
		}
}
