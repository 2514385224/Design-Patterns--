package �Ž�ģʽ2;
/**
 * ���Խ����󻯲�����ʵ�ֻ����ַֿ���ȡ�����ߵļ̳й�ϵ��������Ϲ�ϵ��
	1. ģʽ�Ľṹ
	�Žӣ�Bridge��ģʽ����������Ҫ��ɫ��
	���󻯣�Abstraction����ɫ����������࣬������һ����ʵ�ֻ���������á�
	��չ���󻯣�Refined    Abstraction����ɫ���ǳ��󻯽�ɫ�����࣬ʵ�ָ����е�ҵ�񷽷�����ͨ����Ϲ�ϵ����ʵ�ֻ���ɫ�е�ҵ�񷽷���
	ʵ�ֻ���Implementor����ɫ������ʵ�ֻ���ɫ�Ľӿڣ�����չ���󻯽�ɫ���á�
	����ʵ�ֻ���Concrete Implementor����ɫ������ʵ�ֻ���ɫ�ӿڵľ���ʵ�֡�
 * 
 * @author 2514385224
 *
 */
public class StudnetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new ChinaStudent();
		
		AbstractStudent abstractStudent=new EnglishStudent(student);
		
		abstractStudent.englishStudnet();
	}

}
