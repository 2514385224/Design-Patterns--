package ����ģʽ;
/**
 * ���ڲ�����һ��ʵ����������ȫ������Ϊprivate�����з������ڸ�ʵ���ϸĶ�
 * ���ڴ�����Ҫע�����ʵ����ֻ��ִ��һ�Σ����Բ�������ַ�����ʵ�֣�
 * ��Synchronized�ؼ��֣����������ڲ���Ȼ�����ʵ�֡�
 * 
 * @author 2514385224
 *
 */
public class Singleton {
	 private Singleton(){}

     private static class SingletonBuild{
	       private static Singleton value = new Singleton();
     }

	 public Singleton getInstance(){
	 	return  SingletonBuild.value ;
	 }
}
