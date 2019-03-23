package 适配器模式2;

public class TwoWayAdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		target target=new targetRealize();
		towRealize towRealize=new towRealize(target);
		
		towRealize.getterget();
	}

}
interface target{
	public void getterget();
}

interface adapter{
	public void getAdapter();
}
class targetRealize implements target{
	@Override
	public void getterget() {
		// TODO Auto-generated method stub
		System.out.println("目标代码");
	}
	
}

class adapterRealize implements target{

	@Override
	public void getterget() {
		// TODO Auto-generated method stub
		System.out.println("适配器代码调用");
	}
	
}
class towRealize implements target,adapter{
	private adapter adapter;
	private target target;
	
	
	public towRealize(adapter adapter) {
		// TODO Auto-generated constructor stub
		this.adapter=adapter;
	}
	
	public towRealize(target target) {
		// TODO Auto-generated method stub
		this.target=target;
	}

	@Override
	public void getterget() {
		// TODO Auto-generated method stub
		target.getterget();
	}

	@Override
	public void getAdapter() {
		// TODO Auto-generated method stub
		adapter.getAdapter();
	}
	
}

