package 工厂模式.静态工厂;
/**
 * 
 * 常用的工厂模式是静态工厂，利用static方法，作为一种类似于常见的工具类Utils等辅助效果，一般情况下工厂类不需要实例化。
 * @author 2514385224
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	get("B");	 	
	}
	public static void get(String name){
        food x = null ;
        if ( name.equals("A")) {
            x = StaticFactory.getA();
        }else if ( name.equals("B")){
            x = StaticFactory.getB();
        }else {
            x = StaticFactory.getC();
        }
    }

}
