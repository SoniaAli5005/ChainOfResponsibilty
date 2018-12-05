package chainOfResponsibility;

public class DispenseTwentyPounds implements DispensingChain {
	
	private DispensingChain dispenseChain;
	
	@Override
	public void setNextChain(DispensingChain nextChain) {
		this.dispenseChain = nextChain;
	}
	
	@Override
	public void dispensingAmount(MoneyDispensed moneyDispensed) {
		if(moneyDispensed.getAmount() >= 20){
			int num = moneyDispensed.getAmount()/20;
			int remainder = moneyDispensed.getAmount() % 20;
			System.out.println(num+" £20 note has been dispensed");
			if(remainder !=0) this.dispenseChain.dispensingAmount(new MoneyDispensed(remainder));
		}
		else{
			this.dispenseChain.dispensingAmount(moneyDispensed);
		}
	
	}
}
