package BankAcc;

public class MainBank {

	public static void main(String[] args) {
		AccountType savings = AccountType.SAVINGS;
		AccountType current = AccountType.CURRENT;
		BankTrans b1 = new BankTrans(101,"Udaya Giri",savings,1000);
		BankTrans b2 = new BankTrans(102,"Loka",savings,100);
		BankTrans b3 = new BankTrans(103,"Raji",current,500);
		b1.despositAmount(1000);
		b2.despositAmount(100);
		b3.despositAmount(200);
		b1.withdrawAmount(100);
		BankTrans.totalBalance();
	}

}
