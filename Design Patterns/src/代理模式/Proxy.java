package 代理模式;
/**
 * 
 * 提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能。
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
	        System.out.println("访问真实主题之前的预处理。");
	    }
	    public void postRequest()
	    {
	        System.out.println("访问真实主题之后的后续处理。");
	    }
}
