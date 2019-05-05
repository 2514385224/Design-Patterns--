package 桥接模式2;

public class EnglishStudent extends AbstractStudent{

	
	public EnglishStudent(Student student) {
		super(student);
		// TODO Auto-generated constructor stub
	}

	@Override
	void englishStudnet() {
		// TODO Auto-generated method stub
		System.out.println("扩展英文名");
		student.getname();
	}

}
