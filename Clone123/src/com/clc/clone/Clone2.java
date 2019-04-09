

package com.clc.clone;

//cclone
public class Clone2{
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address ad1 = new Address(11111,"Pune");
		
		Emp originalEmp = new Emp(1,"AAAA",33,"Pune",13882.2,ad1);
		Emp duplicateObject = originalEmp.clone();
		
		
		System.out.println("before modifications");
		System.out.println(originalEmp == duplicateObject); //False  -- address compr-- ref equality
		System.out.println(originalEmp.equals(duplicateObject));//False -- addr com-- ref eq-- object class equals...
		System.out.println(originalEmp.getEmpAge() == duplicateObject.getEmpAge());//true
		System.out.println(originalEmp.getEmpName()== duplicateObject.getEmpName());//true
		System.out.println(originalEmp.getEmpSalary() == duplicateObject.getEmpSalary());//true
		System.out.println(originalEmp.getAddress().equals(duplicateObject.getAddress()));

		System.out.println(originalEmp.getAddress() == duplicateObject.getAddress());
		System.out.println(originalEmp.getAddress().equals(duplicateObject.getAddress()));
		
		System.out.println("after modifications...");
		originalEmp.setEmpName("ABABA");
		System.out.println(originalEmp.getEmpName() == duplicateObject.getEmpName());//false
		System.out.println(originalEmp.getEmpName().equals(duplicateObject.getEmpName()));//false
		//System.out.println(duplicateObject.getEmpName());
		System.out.println(originalEmp.getEmpName());
		System.out.println(duplicateObject.getEmpName());
		System.out.println("hjgjh");
		
		
		
	}

}
class Emp implements Cloneable {
	
	
	
	
	private int empId;
	private String empName;
	private int empAge;
	private double empSalary;
	private Address address;
	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	protected Emp clone() throws CloneNotSupportedException {
		return (Emp) super.clone();
//		Emp clonnedEmp = (Emp)super.clone(); //Emp -- Duster
//																		//Address -- Marker
//		
//		Address adr = clonnedEmp.getAddress();
//		Address clonnedAddress = adr.clone();
//		
//		clonnedEmp.setAddress(clonnedAddress);
//		
//		return clonnedEmp;
	}

	
	public Emp(int empId, String empName, int empAge, String empAddress,
			double empSalary,Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
		this.address=address;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empAge="
				+ empAge + ", empSalary=" + empSalary + ", address=" + address
				+ "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	
	
	
}


class Address implements Cloneable{
	private int pincode;
	private String city;
	
	
//	@Override
//	protected Address clone() throws CloneNotSupportedException {
//		return (Address)super.clone();
//	}

	public Address(int pincode, String city) {
		super();
		this.pincode = pincode;
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + "]";
	}
	
	
/**	
* marker interfaces -- no metods inside an interface..provides special behivours to the runtime 
* objects..of type marker interfaces..
* 
* can we write marker interfaces ..yes..but marker interfaces that we write and java provided has differnement meanings..
* 
* after java 1.5 marker interfaces concept has been deprecatted.. replaced by annotations now..
* https://howtodoinjava.com/java/cloning/a-guide-to-object-cloning-in-java/
* 
* 
* 
*/
	
}