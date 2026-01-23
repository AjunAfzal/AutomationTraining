package hierarchicalinheritance;

public class Son extends Father{
	public void sing()
	{
		System.out.println("Son is a Good Singer");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s=new Son();
		s.skills();
		s.sing();
	}

}
