package ����ģʽ;
/**
 * 
 * �ṩ������ʵ������ͬ�Ľӿڣ����ڲ����ж���ʵ��������ã������Է��ʡ����ƻ���չ��ʵ����Ĺ��ܡ�
 * @author 2514385224
 *
 */

public class Proxy {
	 private RealSubject realSubject;
	  
	 	public void Request()
	    {
	        if (realSubject==null)
	        {
	            realSubject=new RealSubject();
	        }
	        preRequest();
	        realSubject.Request();
	        postRequest();
	    }
	    public void preRequest()
	    {
	        System.out.println("������ʵ����֮ǰ��Ԥ����");
	    }
	    public void postRequest()
	    {
	        System.out.println("������ʵ����֮��ĺ�������");
	    }
}
