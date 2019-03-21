package 建造者模式;
/**
 * 客户类
 * @author 2514385224
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Builder builder=new ConcreteBuilder();
	        Director director=new Director(builder);
	        Product product=director.construct();
	        product.show();
	}

}
