package 桥接模式;

public class RefinedAbstraction extends Abstraction{

	
	
	protected RefinedAbstraction(Implementor imple) {
		super(imple);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		System.out.println("扩展角色接口");
		imple.OperationImpl();
	}

}
