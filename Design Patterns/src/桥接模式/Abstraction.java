package �Ž�ģʽ;
/**
 * ���󻯽�ɫ
 * @author 2514385224
 *
 */
abstract class Abstraction {
	protected Implementor imple;
	
	protected Abstraction(Implementor imple)
    {
      this.imple=imple;
    }
	
	public abstract void Operation(); 
}
