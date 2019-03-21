package 建造者模式;

/**
 * 产品角色：包含多个组成部件的复杂对象。
 * 
 * @author 2514385224
 *
 */
public class Product {
	    private String partA;
	    public String getPartA() {
			return partA;
		}
		public String getPartB() {
			return partB;
		}
		public String getPartC() {
			return partC;
		}
		private String partB;
	    private String partC;
	    public void setPartA(String partA)
	    {
	        this.partA=partA;
	    }
	    public void setPartB(String partB)
	    {
	        this.partB=partB;
	    }
	    public void setPartC(String partC)
	    {
	        this.partC=partC;
	    }
	    public void show()
	    {
	     
	    	System.out.println(partA+"--"+partB+"--"+partC);
	    	//显示产品的特性
	    }
}
