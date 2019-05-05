package 装饰模式2;

import java.awt.Component;

/**
 *            
               装饰模式主要包含以下角色。
	抽象构件（Component）角色：定义一个抽象接口以规范准备接收附加责任的对象。
	具体构件（Concrete    Component）角色：实现抽象构件，通过装饰角色为其添加一些职责。
	抽象装饰（Decorator）角色：继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
	具体装饰（ConcreteDecorator）角色：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。
	
 * 
 * 
 * @author 2514385224
 *
 */

public class DecoratorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component2 component2=new crurrComponent();
		
		component2.openComponent();
				
		Component2 component3=new ConcreteDecorator(component2);
		
		component3.openComponent();
	}
}

//抽象构件角色
interface Component2
{
	void openComponent();	
}


class crurrComponent implements Component2{

	public crurrComponent() {
		// TODO Auto-generated constructor stub
		System.out.println("创建具体构建角色");
	}
	@Override
	public void openComponent() {
		// TODO Auto-generated method stub
		System.out.println("调用具体构件角色的方法operation()");
	}
}

class Decorator2 implements Component2{
	private Component2 component2;
	public Decorator2(Component2 component2) {
		// TODO Auto-generated constructor stub
		this.component2=component2;
	}
	@Override
	public void openComponent() {
		// TODO Auto-generated method stub
		component2.openComponent();
	}
}


class ConcreteDecorator extends Decorator2{

	public ConcreteDecorator(Component2 component2) {
		super(component2);
		// TODO Auto-generated constructor stub
	}
	
	public void operation() {
		super.openComponent();
		addedFunction();
	}
	
	public void addedFunction()
	{
	   System.out.println("为具体构件角色增加额外的功能addedFunction()");           
    }
}


