package 建造者模式2;

import 建造者模式.Product;
import 抽象工厂.produce;
/**
 * 抽象建造者
 * @author 2514385224
 *
 */
public abstract class Builder {
	protected Student student=new Student();
	
	public abstract void builderOne();

	public abstract void builderTwo();
	
	public abstract void builderShree();
	 public Student getResult()
	    {
	        return student;
	    }
}
