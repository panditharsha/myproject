package abstractclass;

public class Concrete extends abstractclass{
	
	
	
	public static void main(String[] args) {
		Concrete c = new Concrete();
		c.test();
		c.test1();
		c.test2();
		c.testConcrete();
	}
	

	@Override
	public void test() {
		System.out.println("this is complete method");
		
	}

	
	public void testConcrete ()
	{
		System.out.println("hello world");
	}

}
