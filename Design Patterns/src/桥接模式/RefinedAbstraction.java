package �Ž�ģʽ;

public class RefinedAbstraction extends Abstraction{

	
	
	protected RefinedAbstraction(Implementor imple) {
		super(imple);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		System.out.println("��չ��ɫ�ӿ�");
		imple.OperationImpl();
	}

}
