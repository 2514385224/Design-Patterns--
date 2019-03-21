package ³éÏó¹¤³§;

public class AbstractFactory {
	public static void main(String[] args) {
		ClientCode("B");
	}
	
	public static void ClientCode(String name){
        
		foot x= new FactoryForA().get();
    
		
		
		x = new FactoryForB().get();
    
	}
}
