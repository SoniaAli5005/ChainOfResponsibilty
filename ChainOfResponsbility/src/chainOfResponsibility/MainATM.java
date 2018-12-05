package chainOfResponsibility;

import java.util.Scanner;

public class MainATM {

	public static void main(String[] args) {
		MainDispensingChain atm = new MainDispensingChain();
		
		while(true) {
			int enteredAmount = 0;
		System.out.println("Please enter the amount of money you wish to dispense: ");
		Scanner userinput = new Scanner(System.in);
		enteredAmount = userinput.nextInt();
		
		if(enteredAmount % 10!=0) {
			System.out.println("Error - Could not carry out request.");
			return;
		}
		
		atm.One.dispensingAmount(new MoneyDispensed(enteredAmount));
	}

}
}
