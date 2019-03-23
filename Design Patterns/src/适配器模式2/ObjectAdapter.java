package ÊÊÅäÆ÷Ä£Ê½2;

public class ObjectAdapter implements Target2{

	private adaper adaper;
	
	public ObjectAdapter(adaper adaper) {
		// TODO Auto-generated constructor stub
		this.adaper=adaper;
	}
	@Override
	public void request() {
		// TODO Auto-generated method stub
		adaper.sceptResure();
	}

}
