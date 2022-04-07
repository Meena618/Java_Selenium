package com.javvaa;
import java.util.Scanner;

public class ATMProgram {
	public static void main(String args[]) {
		int balance=200000,Withdraw,Deposit;
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			{
				System.out.println("Automated teller machine");
				System.out.println("Choose 1 to Withdraw amount");
				System.out.println("Choose 2 to Deposit amount");
				System.out.println("Choose 3 to check the balance");
				System.out.println("Choose 4 to Exit");
				System.out.println("Choose the operation to perform");
				int choice=sc.nextInt();
				  switch(choice)  
				  {
				  case 1:
					  System.out.println("Enter money to be withdrawn");
					  Withdraw=sc.nextInt();
				if(balance>=Withdraw) {
					balance=balance-Withdraw;
					System.out.println("please collect the amount");
					
				}
				else
				{
				System.out.println("Insuffcient fund");
				}
				
				System.out.println("");
				break;
				  case 2:
					  System.out.println("Enter money to be Deposit");
					 Deposit=sc.nextInt();
					 balance=balance+Deposit;
					 System.out.println("Money successfully deposited");
					 System.out.println("");
						break;
				  case 3:
					  System.out.println("Balance"+balance);
					  System.out.println("");
					  break;
				  case 4:
					  System.exit(0);
					  
					 
					 
				}
				}
				  
				
				
			}
		}
	}


