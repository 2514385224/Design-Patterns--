package ге╫сдёй╫;

public class BridgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementor imple=new ConcreteImplementorA();
		
		RefinedAbstraction refinedAbstraction=new RefinedAbstraction(imple);
		
		refinedAbstraction.Operation();
	}

}
