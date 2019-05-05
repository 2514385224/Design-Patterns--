package װ��ģʽ2;

import java.awt.Component;

/**
 *            
               װ��ģʽ��Ҫ�������½�ɫ��
	���󹹼���Component����ɫ������һ������ӿ��Թ淶׼�����ո������εĶ���
	���幹����Concrete    Component����ɫ��ʵ�ֳ��󹹼���ͨ��װ�ν�ɫΪ�����һЩְ��
	����װ�Σ�Decorator����ɫ���̳г��󹹼������������幹����ʵ��������ͨ����������չ���幹���Ĺ��ܡ�
	����װ�Σ�ConcreteDecorator����ɫ��ʵ�ֳ���װ�ε���ط������������幹��������Ӹ��ӵ����Ρ�
	
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

//���󹹼���ɫ
interface Component2
{
	void openComponent();	
}


class crurrComponent implements Component2{

	public crurrComponent() {
		// TODO Auto-generated constructor stub
		System.out.println("�������幹����ɫ");
	}
	@Override
	public void openComponent() {
		// TODO Auto-generated method stub
		System.out.println("���þ��幹����ɫ�ķ���operation()");
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
	   System.out.println("Ϊ���幹����ɫ���Ӷ���Ĺ���addedFunction()");           
    }
}


