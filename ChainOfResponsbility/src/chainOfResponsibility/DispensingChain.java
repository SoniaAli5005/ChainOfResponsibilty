package chainOfResponsibility;

public interface DispensingChain {
	
	public void setNextChain(DispensingChain nextChain);
	
	public void dispensingAmount(MoneyDispensed moneyDispensed);
	
}
