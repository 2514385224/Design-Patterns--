package ������ģʽ;
/**
 * 
 * ���彨���ߣ�ʵ���˳������߽ӿ�
 * @author 2514385224
 *
 */
public class ConcreteBuilder extends Builder{

	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.setPartA("A");
		System.out.println("����A");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.setPartB("B");
		System.out.println("����B");
	}

	@Override
	public void buildPartC() {
		// TODO Auto-generated method stub
		product.setPartC("C");
		System.out.println("����C");
	}

}
