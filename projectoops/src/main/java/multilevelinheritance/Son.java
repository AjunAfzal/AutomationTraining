package multilevelinheritance;

public class Son extends Father{
	public void build()
	{
		System.out.println("Son is of a lean build and of 10 years of age");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son out=new Son();
		out.age();
		out.health();
		out.build();
	}
}