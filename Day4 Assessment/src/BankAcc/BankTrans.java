package BankAcc;

public class BankTrans {
 // Account details
 private int accountId;
 private String accountHolderName;
 private AccountType accountType;
 // Opening bank balance
 private double openingBalance;
 // Cash available in the current bank account
 private double currentBalance;
 // Cash available in the bank
 static double totalBalance;
 //depositAmount()
 public void despositAmount(double amount) {
	 if(amount<=0) {
		 System.out.println("Invalid Amount.");
	 }
	 else {
		 currentBalance+=amount;
		 totalBalance+=amount;
		 System.out.println("Deposited amount" + amount);
		 System.out.println("Current balance available in the account "+ this.accountId+" is "+this.currentBalance);
		 System.out.println("----------");
	 }
 }
 //withdrawAmount()
public void withdrawAmount(double amount) {
	 if(amount<=0) {
		 System.out.println("Invalid Amount.");
		 System.out.println("----------");}
	 else if(amount>this.currentBalance) {
			 System.out.println("Funds insufficient");
			 System.out.println("----------");}
	 else if(amount>this.currentBalance-this.accountType.minBalance){
		 System.out.println("Minimum balance is must..cant withdraw");
		 System.out.println("----------");
	 }
	 else {
		 this.currentBalance-=amount;
		 this.totalBalance-=amount;
		 System.out.println("Amount Withdrawn "+amount);
		 System.out.println("Current balance available in the account "+ this.accountId+" is "+this.currentBalance);
		 System.out.println("----------");
	 }
 }
 //getCurrentBalance()
public void currentBalance() {
	System.out.println("Current balance available in bank account "+ this.accountId+" is "+this.currentBalance);
	System.out.println("----------");
	}
 //displayTotalBalance()
public static void totalBalance() {
	System.out.println("Current balance available in bank is "+ totalBalance); 
	System.out.println("----------");
}
 
 //constructor
 public BankTrans(int accId,String accholder,AccountType accountType,double openingamount) {
	 this.accountId=accId;
	 this.accountHolderName=accholder;
	 this.accountType=accountType;
	 if(openingamount<accountType.minBalance) {
		 System.out.println("Minimum balance required for "+accountType.Type+" is "+accountType.minBalance);
		 System.out.println("----------");
	 }
	 else {
		 this.openingBalance+=openingamount;
		 this.currentBalance+=openingamount;
		 totalBalance+=openingamount;
	 }
 }
}
