
public class SavingsAccount extends BankAccount{
	double interest;
	
	public SavingsAccount(int dollar, int cent, int identity, String name, double fee) {
		super(dollar, cent, identity, name);
		interest = fee;
	}
	
	public void addInterest(){
		if (coin >= 100){
			excess = (int) (cash / 100);
			cash = cash + excess;
			coin = cash % 100;
		}
		cash = cash + cash * interest;
		coin = coin + coin * interest;
	}

	public static void main(String[] args) {
		SavingsAccount save = new SavingsAccount(3, 50, 12345, "Laura", 0.70);
		save.addInterest();
		save.getCash();
		save.getCoin();
	}

}
