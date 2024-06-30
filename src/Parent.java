
public class Parent {
	int i=10;
	void method()
	{
		System.out.println("value of i "+i);
	}
}
class Child extends Parent
{
	void method_2()
	{
		System.out.println("value of i "+i);
	}
}
