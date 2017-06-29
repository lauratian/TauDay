
public class BankAccount {
	int excess = 0;
	static double cash = 0;
	static double coin = 0;
	int id;
	String holder;
	
	public BankAccount(double dollar, double cent, int identity, String name){
		cash = dollar;
		coin = cent;
		id = identity;
		holder = name;
	}
	
	public void setID(int identity){
		id = identity;
	}
	
	public void setName(String name){
		holder = name;
	}
	
	public void getCash(){
		if (coin >= 100){
			excess = (int) (cash / 100);
			cash = cash + excess;
			coin = cash % 100;
		}
		System.out.println(cash);
	}
	
	public void getCoin(){
		if (coin >= 100){
			excess = (int) (cash / 100);
			cash = cash + excess;
			coin = cash % 100;
		}
		System.out.println(coin);
	}
	
	public void getID(){
		System.out.println(id);
	}
	
	public void getName(){
		System.out.println(holder);
	}
	
	public void deposit(int dollar, int cent){
		cash = cash + dollar;
		coin = coin + cent;
	}
	
	public void withdraw(int dollar, int cent){
		cash = cash - dollar;
		coin = coin - cent;
	}
	
	public static void main(String[] args) {
		BankAccount account = new BankAccount(5, 30, 56214, "Laura");
		account.deposit(2, 12);
		account.getCash();
		account.getCoin();
	}

}
