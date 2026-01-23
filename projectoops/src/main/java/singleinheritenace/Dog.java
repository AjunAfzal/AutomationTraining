package singleinheritenace;

public class Dog extends Animal{
	
	public void speed()
	{
		System.out.println("40kmph");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog out=new Dog();
		out.running();
		out.speed();
	}

}
