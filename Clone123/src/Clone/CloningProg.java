package Clone;

public class CloningProg {
	public static void main(String[] args) throws CloneNotSupportedException  {
		Adress ad1=new Adress(112,"pune");		
				Emp E1=new Emp(1,"AAA", ad1);
				Emp E2= (Emp) E1.clone();
				System.out.println(E1.Adr.city);
				E2.Adr.city="mumbai";
				System.out.println(E1.Adr.city);
				System.out.println(E1.hashCode()==E2.hashCode());
				
		
	}

}
class Emp implements Cloneable
{
	int empId;
	String empName;
	Adress Adr;
	
	
	
	
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Adress adr1 = new Adress(Adr.city);
		Emp e=new Emp(empId, empName, Adr);
		return e;
	}







	public Emp(int empId, String empName, Adress adr) {
		super();
		this.empId = empId;
		this.empName = empName;
		Adr = adr;
		
	}
	
	
}
class Adress implements Cloneable{
	int pin;
	String city;
	public Adress(int i, String city) {
		super();
		this.pin = pin;
		this.city = city;
		
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
