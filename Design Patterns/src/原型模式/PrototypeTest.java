package ԭ��ģʽ;
/**
 * ԭ��ģʽ
 * 	 ԭ��ģʽ�Ŀ�¡��Ϊǳ��¡�����¡��Java �е� Object ���ṩ��ǳ��¡�� clone() ����
 * ������ԭ����ֻҪʵ�� Cloneable �ӿھͿ�ʵ�ֶ����ǳ��¡������� Cloneable �ӿھ��ǳ���ԭ���ࡣ
 * @author 2514385224
 *
 */
class Realizetype implements Cloneable
{
    Realizetype()
    {
        System.out.println("����ԭ�ʹ����ɹ���");
    }
    public Object clone() throws CloneNotSupportedException
    {
        System.out.println("����ԭ�͸��Ƴɹ���");
        return (Realizetype)super.clone();
    }
}
//ԭ��ģʽ�Ĳ�����
public class PrototypeTest
{
    public static void main(String[] args)throws CloneNotSupportedException
    {
        Realizetype obj1=new Realizetype();
        Realizetype obj2=(Realizetype)obj1.clone();
        System.out.println("obj1==obj2?"+(obj1==obj2));
    }
}