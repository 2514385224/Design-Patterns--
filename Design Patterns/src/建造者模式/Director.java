package ������ģʽ;

/**
 * ָ���ߣ����ý������еķ�����ɸ��Ӷ���Ĵ�����
 * @author 2514385224
 *
 */
public class Director {
	private Builder builder;
    public Director(Builder builder)
    {
        this.builder=builder;
    }
    //��Ʒ��������װ����
    public Product construct()
    {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
