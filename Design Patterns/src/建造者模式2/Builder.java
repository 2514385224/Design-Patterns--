package ������ģʽ2;

import ������ģʽ.Product;
import ���󹤳�.produce;
/**
 * ��������
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
