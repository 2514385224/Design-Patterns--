package ����ģʽ.��̬����;
/**
 * 
 * ���õĹ���ģʽ�Ǿ�̬����������static��������Ϊһ�������ڳ����Ĺ�����Utils�ȸ���Ч����һ������¹����಻��Ҫʵ������
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
