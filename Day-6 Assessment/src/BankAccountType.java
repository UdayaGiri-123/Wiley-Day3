
public enum BankAccountType {
SAVINGS(5),CURRENT(7);
public int interest;

private BankAccountType(int interest) {
	this.interest = interest;
}

public int getInterestRate() {
	return this.interest;
}

}
