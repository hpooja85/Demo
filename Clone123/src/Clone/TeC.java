package Clone;

public class TeC {
	public static void main(String[] args) throws CloneNotSupportedException  {
		Cat c1=new Cat(50);
		Dog D1=new Dog(c1, "bombay");
		Dog D2=(Dog)D1.clone();
		System.out.println(D1.name);
		System.out.println(D1.c1.j);
	D1.c1.j=78;
	D2.name="delhi";
	
	System.out.println(D2.name);
	System.out.println(c1.j);
	
	
}
}
class Cat implements Cloneable{
	int j;

	public Cat(int j) {
		super();
		this.j = j;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
	
class Dog implements Cloneable{
	Cat c1;
	String name;
	public Dog(Cat c1, String name) {
		super();
		this.c1 = c1;
		this.name =name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Cat C2=new Cat(c1.j);
		Dog D12=new Dog(C2,name);
		return D12;
		
		
	}
	
	
	
	
	
}