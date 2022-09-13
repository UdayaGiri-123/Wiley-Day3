package BankAcc;

public enum AccountType {
  SAVINGS("savings",500),CURRENT("current",1000);
  String Type="";
  int minBalance=0;
  private AccountType(String s,int x) {
	  this.minBalance=x;
	  this.Type=s;
  }
}
