package chainOfResponsibility;

public class DispenseFiftyPounds implements DispensingChain {
	
	private DispensingChain dispenseChain;
	
	@Override
	public void setNextChain(DispensingChain nextChain) {
		this.dispenseChain = nextChain;
	}
	
	@Override
	public void dispensingAmount(MoneyDispensed moneyDispensed) {
		if(moneyDispensed.getAmount() >= 50){
			int num = moneyDispensed.getAmount()/50;
			int remainder = moneyDispensed.getAmount() % 50;
			System.out.println(num+" £50 note has been dispensed");
			if(remainder !=0) this.dispenseChain.dispensingAmount(new MoneyDispensed(remainder));
		}
		else{
			this.dispenseChain.dispensingAmount(moneyDispensed);
		}
	
	}
}
