/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banks;

import java.util.Scanner;

public class Banks {

public static void main(String[] args) {
Scanner stdin = new Scanner(System.in);
int selection = 0;

//Create object
ATM User = new ATM();

//Loop for menu until exit is chosen
do {
//Display ATM menu options
 System.out.println(" Menu");
 System.out.println("1: Check balance");
 System.out.println("2: Deposit");
 System.out.println("3: Withdrawal");
 System.out.println("9: EXIT");
   
//Prompt for ATM menu selection
 System.out.print("\nEnter your selection: ");
 selection = stdin.nextInt();
 System.out.println();
   
//Switch for ATM methods
 switch(selection) {
 case 1 : User.displayBalance();
  break;
 case 2 : User.deposit(stdin);
  break;
 case 3 : User.withdrawal(stdin);
  break;
 case 9 : System.out.println("Thank you for using the ATM!");
  break;
 default :
  System.out.println("Invalid choice\n");}
 } while (selection != 9);
stdin.close();
}

}