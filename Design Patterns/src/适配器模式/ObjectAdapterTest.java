package ������ģʽ;

//������������
class ObjectAdapter implements Target
{
  private Adaptee adaptee;
  public ObjectAdapter(Adaptee adaptee)
  {
      this.adaptee=adaptee;
  }
  public void request()
  {
      adaptee.specificRequest();
  }
}
//�ͻ��˴���
public class ObjectAdapterTest
{
  public static void main(String[] args)
  {
      System.out.println("����������ģʽ���ԣ�");

      Adaptee adaptee = new Adaptee();
      
      Target target = new ObjectAdapter(adaptee);
      
      target.request();
  }
}