package 建造者模式2;

public class Student {
	private String one;
	private String two;
	private String shree;
	public String getOne() {
		return one;
	}
	public void setOne(String one) {
		this.one = one;
	}
	public String getTwo() {
		return two;
	}
	public void setTwo(String two) {
		this.two = two;
	}
	public String getShree() {
		return shree;
	}
	public void setShree(String shree) {
		this.shree = shree;
	}
	public void getString()
	{
		System.out.println(one+"=="+two+"=="+shree);
	}
}
