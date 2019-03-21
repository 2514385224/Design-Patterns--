package 工厂模式.静态工厂;

public class StaticFactory {
private StaticFactory(){}
    
    public static food getA(){  return new A(); }
    public static food getB(){  return new B(); }
    public static food getC(){  return new C(); }
}
