package 桥接模式2;
/**
 * 可以将抽象化部分与实现化部分分开，取消二者的继承关系，改用组合关系。
	1. 模式的结构
	桥接（Bridge）模式包含以下主要角色。
	抽象化（Abstraction）角色：定义抽象类，并包含一个对实现化对象的引用。
	扩展抽象化（Refined    Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
	实现化（Implementor）角色：定义实现化角色的接口，供扩展抽象化角色调用。
	具体实现化（Concrete Implementor）角色：给出实现化角色接口的具体实现。
 * 
 * @author 2514385224
 *
 */
public class StudnetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new ChinaStudent();
		
		AbstractStudent abstractStudent=new EnglishStudent(student);
		
		abstractStudent.englishStudnet();
	}

}
