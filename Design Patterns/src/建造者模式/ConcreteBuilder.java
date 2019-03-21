package 建造者模式;
/**
 * 
 * 具体建造者：实现了抽象建造者接口
 * @author 2514385224
 *
 */
public class ConcreteBuilder extends Builder{

	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.setPartA("A");
		System.out.println("建造A");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.setPartB("B");
		System.out.println("建造B");
	}

	@Override
	public void buildPartC() {
		// TODO Auto-generated method stub
		product.setPartC("C");
		System.out.println("建造C");
	}

}
