package Public_Protected;

public class Parent {
	public int i=10;
	protected int j =20;
		void m1() {
			System.out.println(i+j);
		}
}
class Child extends Parent
{
	void m2()
	{
		System.out.println("Value of i "+i);
		System.out.println("Value of j "+j);
	}
}
