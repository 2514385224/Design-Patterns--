package 建造者模式2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Builder builder=new ConcreteBuilder();
		Director director=new Director(builder);
		Student student= director.constur();
		student.getString();
	}

}
