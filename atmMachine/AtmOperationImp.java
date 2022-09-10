package atmMachine;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AtmOperationImp implements AtmOperationInterface{
	ATM atm=new ATM();
	Map<Double,String>ministmnt=new HashMap<>();

	@Override
	public void ViewBalance() {
		System.out.println("your balance is:"+atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double Withdrawaamount) {
		if(Withdrawaamount<=atm.getBalance()) {
		ministmnt.put(Withdrawaamount,"amount withdrawn");
		System.out.println(Withdrawaamount+"withdrawn amount successfully thnk you");
		atm.setBalance (atm.getBalance()-Withdrawaamount);
		ViewBalance();
		
	}
	else {
		System.out.println("insufficent balance");
	}
	}

	@Override
	public void depositeAmount(double depositeAmount) {
		ministmnt.put(depositeAmount,"amount Deposite6d");
		System.out.println(depositeAmount+"deposited successfuully");
		atm.setBalance(atm.getBalance()+depositeAmount); 
		ViewBalance();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void miniStatement() {
		for(Map.Entry<Double,String>m:ministmnt.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		// TODO Auto-generated method stub
		
	}
	

}
