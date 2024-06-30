package Private;


public class Parent {
	private int i=10;
		void m1() {
			System.out.println("Value of i in parent class "+i);
		}
}
class Child extends Parent
{
	void m2()
	{
		System.out.println("Value of i in Child class "+i);
	}
}

