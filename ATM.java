
package javaapplication.atm;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
    int balance = 100000;
    int withdraw;
    int deposit;  
          
    //create scanner class object to get choice of user  
    Scanner s1 = new Scanner(System.in);  
          
    while(true)  
        {  
            System.out.println("Welcome to XYZ Bank Atm");  
            System.out.println("Choose 1 to Withdraw");  
            System.out.println("Choose 2 to Deposit");  
            System.out.println("Choose 3 to Check Balance"); 
            System.out.println("Choose 4 to Transfer Money"); 
            System.out.println("Choose 5 to EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
            //get choice from user  
            int choice = s1.nextInt();  
            switch(choice)  
            {  
                case 1:  //for withdrawal
                          System.out.print("Enter money to be withdrawn:");  
                  //input for withdrawal money  
                  withdraw = s1.nextInt();  
                  if(balance >= withdraw)  
                  {   
                      balance = balance - withdraw;  
                      System.out.println("Please collect your money");  
                  }  
                  else  
                  {  
                     System.out.println("Insufficient Balance!");  
                  }    
                break;
                case 2:  //for deposit
                    System.out.print("Enter money to be deposited: ");  
                    //input for deposit amount  
                    deposit = s1.nextInt();  
                    balance = balance + deposit;  
                    System.out.println(" ");
                    System.out.println("Your Money has been successfully deposited");  
                break;  
                case 3:  
                    //check balance 
                    System.out.println("Your Current Balance : " + balance);  
                    System.out.println("");  
                    break;  
                case 4:
                    //Transfer money
                    System.out.println("enter the account number of recipient: ");
                    int acc = s1.nextInt();
                    int accbalance = 3000;//account balance of recipient(example)
                    System.out.println("Enter the amount: ");
                    int amount = s1.nextInt();
                    balance = balance - amount;
                    accbalance = accbalance + amount;
                    System.out.println(amount + " has been successfully transfered to acc. no. "+ acc);
                break;
                case 5:  
                    //exit from the menu  
                    System.exit(0);  
                break;
                default:
                  System.out.println("Enter a valid Choice number!");
                break;
            }  

        }      
    
    
    
    }
}
