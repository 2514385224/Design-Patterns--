package ������ģʽ;

/**
 * 
  * 	 �������ߣ�����������Ʒ�����Ӳ����ĳ��󷽷�
 * @author 2514385224
 *
 */
public abstract class Builder {
	//������Ʒ����
    protected Product product=new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    //���ز�Ʒ����
    public Product getResult()
    {
        return product;
    }
}
