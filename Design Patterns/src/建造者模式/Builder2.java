package ������ģʽ;
/**
 * �����ߣ�Builder��ģʽ�Ķ��壺
 * 	ָ��һ�����Ӷ���Ĺ��������ı�ʾ���룬
 * 	ʹͬ���Ĺ������̿��Դ�����ͬ�ı�ʾ�����������ģʽ����Ϊ������ģʽ��
 * 	���ǽ�һ�����ӵĶ���ֽ�Ϊ����򵥵Ķ���Ȼ��һ��һ���������ɡ�
 * 	�������벻������룬����Ʒ����ɲ����ǲ���ģ���ÿһ�����ǿ������ѡ��ġ�

	
	��ģʽ����Ҫ�ŵ����£�
	��������Ľ������໥������������ϵͳ����չ��
	�ͻ��˲���֪����Ʒ�ڲ���ɵ�ϸ�ڣ����ڿ���ϸ�ڷ��ա�
	
	��ȱ�����£�
	��Ʒ����ɲ��ֱ�����ͬ������������ʹ�÷�Χ��
	�����Ʒ���ڲ��仯���ӣ���ģʽ�����Ӻܶ�Ľ������ࡣ
 * 
 * 1. ģʽ�Ľṹ
		�����ߣ�Builder��ģʽ����Ҫ��ɫ���¡�
		��Ʒ��ɫ��Product�������ǰ��������ɲ����ĸ��Ӷ����ɾ��彨����������������粿����
		�������ߣ�Builder��������һ������������Ʒ�����Ӳ����ĳ��󷽷��Ľӿڣ�ͨ��������һ�����ظ��Ӳ�Ʒ�ķ��� getResult()��
		���彨����(Concrete Builder����ʵ�� Builder �ӿڣ���ɸ��Ӳ�Ʒ�ĸ��������ľ��崴��������
		ָ���ߣ�Director���������ý����߶����еĲ���������װ�䷽����ɸ��Ӷ���Ĵ�������ָ�����в��漰�����Ʒ����Ϣ��
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
