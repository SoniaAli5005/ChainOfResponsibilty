package chainOfResponsibility;

public class DispenseTenPounds implements DispensingChain {
	
	private DispensingChain dispenseChain;
	
	@Override
	public void setNextChain(DispensingChain nextChain) {
		this.dispenseChain = nextChain;
	}
	
	@Override
	public void dispensingAmount(MoneyDispensed moneyDispensed) {
		if(moneyDispensed.getAmount() >= 10){
			int num = moneyDispensed.getAmount()/10;
			int remainder = moneyDispensed.getAmount() % 10;
			System.out.println(num+" £10 note has been dispensed");
			if(remainder !=0) this.dispenseChain.dispensingAmount(new MoneyDispensed(remainder));
		}
		else{
			this.dispenseChain.dispensingAmount(moneyDispensed);
		}
	
	}
}
