package 适配器模式;
/**
 *  
 *  目标（Target）接口：当前系统业务所期待的接口，它可以是抽象类或接口。
	
	适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口。
	
	适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口
	，让客户按目标接口的格式访问适配者
 * 
 * @author 2514385224
 *
 */


//目标接口
interface Target
{
  public void request();
}

//适配者接口
class Adaptee
{
  public void specificRequest()
  {       
      System.out.println("适配者中的业务代码被调用！");
  }
}

//类适配器类
class ClassAdapter extends Adaptee implements Target
{
  public void request()
  {
      specificRequest();
  }
}


//客户端代码
public class ClassAdapterTest
{
  public static void main(String[] args)
  {
      System.out.println("类适配器模式测试：");
      Target target = new ClassAdapter();
      target.request();
  }
}