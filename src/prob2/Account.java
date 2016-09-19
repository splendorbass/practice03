package prob2;

public class Account {
	private String accountNo;
	private int balance;
	
	public Account( String accountNo ){
		setAccountNo(accountNo);
		System.out.println(this.accountNo+"계좌가 개설되었습니다.");
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void save(int money){
		this.balance += money;
		System.out.println(this.accountNo+"계좌에 "+ money+"만원이 입금되었습니다.");
	}
	public void deposit(int money){
		this.balance -= money;
		System.out.println(this.accountNo+"계좌에 "+ money+"만원이 출금되었습니다.");
	}
	
	
	

}
