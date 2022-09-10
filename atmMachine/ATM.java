package atmMachine;

public class ATM {
	private double Balance;
	private double Withdrawaamount;
	private double depositeAmount;
	//default constructor
	public ATM() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		this.Balance = balance;
	}
	public double getWithdrawaamount() {
		return Withdrawaamount;
	}
	public void setWithdrawaamount(double withdrawaamount) {
		Withdrawaamount = withdrawaamount;
	}
	public double getdepositeAmount() {
		return depositeAmount;
	}
	public void setdepositeAmount(double depositeAmount) {
		depositeAmount = depositeAmount;
	}
	

}
