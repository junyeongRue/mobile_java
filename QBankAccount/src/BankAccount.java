
public class BankAccount {

	private int balance = 100;
	public int getBalance() {
	return balance;
	}
	
	synchronized public void Deposit(int money){
		balance += money;
		System.out.println("����:"+balance+" "+ money+"��Ů�Ա�");
	}
	synchronized public void withDraw(int money) {
	balance -= money;
		System.out.println("����:"+balance+" "+money+"��ŭ ���");
	} 
	public void add(int money) {
	balance += money;
	System.out.println("���� : " + balance + " " + money + " ��ŭ �Ա�");
	}
	public void delete(int money) {
	balance -= money;
	System.out.println("���� : " +balance + " " + money + " ��ŭ ���");
	}

}
