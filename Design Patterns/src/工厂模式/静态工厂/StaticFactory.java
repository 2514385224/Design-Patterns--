package ����ģʽ.��̬����;

public class StaticFactory {
private StaticFactory(){}
    
    public static food getA(){  return new A(); }
    public static food getB(){  return new B(); }
    public static food getC(){  return new C(); }
}
