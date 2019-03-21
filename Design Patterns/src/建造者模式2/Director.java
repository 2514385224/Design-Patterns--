package 建造者模式2;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class Director {
	private Builder builder;
	public Director(Builder builder) {
		// TODO Auto-generated constructor stub
		this.builder=builder;
	}
	public Student constur()
	{
	builder.builderOne();
	builder.builderShree();
	
	return builder.getResult();
	}
	
}
