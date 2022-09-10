package atmMachine;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		AtmOperationInterface op=new AtmOperationImp();
		int atmnumber = 5;
		int atmpin = 6;
		System.out.println("-:Welcome to our Hdfc Atm:-");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Atm number:");
		int atmNumber = input.nextInt();
		System.out.println("Enter pin:");
		int pin = input.nextInt();
		
		if ((atmnumber == atmNumber) && (atmpin == pin)) {
			while (true) {
				System.out.println("1.View Available Balance");
				System.out.println("2.Withdraw Amount");
				System.out.println("3.Deposite Amount");
				System.out.println("4.View MiniStatement");
				System.out.println("5.Exit:");
				int ch=input.nextInt();
				
				
				if(ch==1) {
					op.ViewBalance();
					
				}
				else if(ch==2) {
					System.out.println("Enter amount to be withdrawn");
					double withdrawaamount=input.nextDouble();
					op.withdrawAmount(withdrawaamount);
				}
				else if(ch==3) {
					System.out.println("Enter deposite amount");
					double depositeAmount=input.nextDouble();
					op.depositeAmount(depositeAmount);
					}
				else if(ch==4) {
					op.miniStatement();
		}
				
				else if(ch==5) {
					
					System.out.println("Collect Your Card \n thank You");
					System.out.println("want to go back enter yes/no");
					String A=input.next();
					
				}
				else {
			System.out.println("Incorrect atmnumer or pin");
		System.exit(0);
		
	}

}
}
	}
}