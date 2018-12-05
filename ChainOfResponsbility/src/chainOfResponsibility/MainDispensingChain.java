package chainOfResponsibility;

public class MainDispensingChain {

	DispensingChain One;
	DispensingChain Two;
	DispensingChain Three;
	
	public MainDispensingChain() {
		this.One = new DispenseFiftyPounds();
		this.Two = new DispenseTwentyPounds();
		this.Three = new DispenseTenPounds();
		
		One.setNextChain(Two);
		Two.setNextChain(Three);

	}
}
