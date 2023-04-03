package oop;

interface ifs3
{
	static void msg()
	{
		System.out.println("Static Method in Interface");
	}
}





public class StaticMethodInterface implements ifs3 {
	public static void main(String[] args) {
		ifs3.msg();
	}

}
