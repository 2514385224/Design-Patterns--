package ������ģʽ;
/**
 *  
 *  Ŀ�꣨Target���ӿڣ���ǰϵͳҵ�����ڴ��Ľӿڣ��������ǳ������ӿڡ�
	
	�����ߣ�Adaptee���ࣺ���Ǳ����ʺ�������ִ�������е�����ӿڡ�
	
	��������Adapter���ࣺ����һ��ת������ͨ���̳л����������ߵĶ��󣬰������߽ӿ�ת����Ŀ��ӿ�
	���ÿͻ���Ŀ��ӿڵĸ�ʽ����������
 * 
 * @author 2514385224
 *
 */


//Ŀ��ӿ�
interface Target
{
  public void request();
}

//�����߽ӿ�
class Adaptee
{
  public void specificRequest()
  {       
      System.out.println("�������е�ҵ����뱻���ã�");
  }
}

//����������
class ClassAdapter extends Adaptee implements Target
{
  public void request()
  {
      specificRequest();
  }
}


//�ͻ��˴���
public class ClassAdapterTest
{
  public static void main(String[] args)
  {
      System.out.println("��������ģʽ���ԣ�");
      Target target = new ClassAdapter();
      target.request();
  }
}