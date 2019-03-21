package 建造者模式2;

public class ConcreteBuilder extends Builder{

	@Override
	public void builderOne() {
		// TODO Auto-generated method stub
		student.setOne("one");
	}

	@Override
	public void builderTwo() {
		// TODO Auto-generated method stub
		student.setTwo("two");
	}

	@Override
	public void builderShree() {
		// TODO Auto-generated method stub
		student.setShree("shree");
	}

}
