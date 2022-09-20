
public class BankAccount {
 private String accountId;
 private String accountHolderName;
 BankAccountType accountType;
 
 //calculateTotalInterest() 
 public double calculateTotalInterest(double amount, int years) {
	 try {
		 if(amount<0)
			 throw new DepositAmountException();
		 return amount*accountType.interest*years/100;
	 }
	 catch(Exception e) {
		 System.out.println(e.getMessage());
	 }
	 return 0;
 }
// DepositAmountException
 
// constructor
public BankAccount(String accountId, String accountHolderName, BankAccountType accountType) {
	this.accountId = accountId;
	this.accountHolderName = accountHolderName;
	this.accountType = accountType;
}
 }
