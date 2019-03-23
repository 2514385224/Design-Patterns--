package 代理模式;
/**
 * 实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象
 * @author 2514385224
 *
 */
public class RealSubject implements Subject{

	@Override
	public void Request() {
		// TODO Auto-generated method stub
		System.out.println("真实主题");
	}

}
