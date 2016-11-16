
public class BankAccount {

	private int balance = 100;
	public int getBalance() {
	return balance;
	}
	
	synchronized public void Deposit(int money){
		balance += money;
		System.out.println("√—«’:"+balance+" "+ money+"∏∏≈Æ¿‘±›");
	}
	synchronized public void withDraw(int money) {
	balance -= money;
		System.out.println("√—«’:"+balance+" "+money+"∏∏≈≠ √‚±›");
	} 
	public void add(int money) {
	balance += money;
	System.out.println("√—«’ : " + balance + " " + money + " ∏∏≈≠ ¿‘±›");
	}
	public void delete(int money) {
	balance -= money;
	System.out.println("√—«’ : " +balance + " " + money + " ∏∏≈≠ √‚±›");
	}

}
