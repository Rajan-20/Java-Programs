package accessmodifier;

public class Demo {
	public int x =2;
	protected int y =3;
	int z=8;
	private int a =6;
	
	public void add() {
		System.out.println(x);
	}
	protected void sub() {
		System.out.println(y);
	}
	private void mul() {
		System.out.println(z);
	}
	void div() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.x);
		System.out.println(demo.y);
		System.out.println(demo.z);
		System.out.println(demo.a);
		demo.add();
		demo.div();
		demo.sub();
		
		
	
	}
	
}
