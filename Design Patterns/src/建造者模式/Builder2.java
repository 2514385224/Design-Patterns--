package 建造者模式;
/**
 * 建造者（Builder）模式的定义：
 * 	指将一个复杂对象的构造与它的表示分离，
 * 	使同样的构建过程可以创建不同的表示，这样的设计模式被称为建造者模式。
 * 	它是将一个复杂的对象分解为多个简单的对象，然后一步一步构建而成。
 * 	它将变与不变相分离，即产品的组成部分是不变的，但每一部分是可以灵活选择的。

	
	该模式的主要优点如下：
	各个具体的建造者相互独立，有利于系统的扩展。
	客户端不必知道产品内部组成的细节，便于控制细节风险。
	
	其缺点如下：
	产品的组成部分必须相同，这限制了其使用范围。
	如果产品的内部变化复杂，该模式会增加很多的建造者类。
 * 
 * 1. 模式的结构
		建造者（Builder）模式的主要角色如下。
		产品角色（Product）：它是包含多个组成部件的复杂对象，由具体建造者来创建其各个滅部件。
		抽象建造者（Builder）：它是一个包含创建产品各个子部件的抽象方法的接口，通常还包含一个返回复杂产品的方法 getResult()。
		具体建造者(Concrete Builder）：实现 Builder 接口，完成复杂产品的各个部件的具体创建方法。
		指挥者（Director）：它调用建造者对象中的部件构造与装配方法完成复杂对象的创建，在指挥者中不涉及具体产品的信息。
 * 
 * @author 2514385224
 *
 */
public class Builder2 {

	static class Student{
        String name = null ;
        int number = -1 ;
        String sex = null ;
        int age = -1 ;
        String school = null ;

    static class StudentBuilder{
    	String name = null ;
        int number = -1 ;
        String sex = null ;
        int age = -1 ;
        String school = null ;
    
    public StudentBuilder setName(String name) {
                this.name = name;
                return  this ;
        }

    public StudentBuilder setNumber(int number) {
                this.number = number;
                return  this ;
        }

     public StudentBuilder setSex(String sex) {
                this.sex = sex;
                return  this ;
        }

     public StudentBuilder setAge(int age) {
                this.age = age;
                return  this ;
        }

     public StudentBuilder setSchool(String school) {
                this.school = school;
                return  this ;
        }
     public Student build() {
                return new Student(this);
     	}
     
    }

        public Student(StudentBuilder builder){
            this.age = builder.age;
            this.name = builder.name;
            this.number = builder.number;
            this.school = builder.school ;
            this.sex = builder.sex ;
        }
    }

    public static void main( String[] args ){
        Student a = new Student.StudentBuilder().setAge(13).setName("LiHua").build();
        Student b = new Student.StudentBuilder().setSchool("sc").setSex("Male").setName("ZhangSan").build();
    }
}
