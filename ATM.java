
package banks;

import java.util.Scanner;

public class ATM {
//Variables
int balance;
int withdrawalAmount;
int depositAmount;
int withdrawalsToday;

//Method to check account balance
public void displayBalance() {
System.out.println("Account Balance: " + balance + "\n");
}

//Method to deposit money
public int deposit(Scanner stdin) {
System.out.println("Enter deposit amount: ");
depositAmount = stdin.nextInt();
this.balance = balance + depositAmount;
System.out.println("Money successfully deposited!\n");
return balance;
}

//Method to withdrawal money
public int withdrawal(Scanner stdin) {
if (withdrawalsToday < 3) {
 System.out.println("Enter withdrawal amount: ");
 withdrawalAmount = stdin.nextInt();
 balance = this.balance - withdrawalAmount;
 System.out.println("Money successfully withdrawn!\n");
 withdrawalsToday++;
 return balance;
}
else {
 System.out.println("You have exceeded the number of withdrawals allowed today.\n");
 return balance;
}
}
}