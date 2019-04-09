package Clone;


public class Clone1 {
	public static void main(String[] args)throws CloneNotSupportedException {
		Department D1=new Department(2,"saaa");
		Employee E1= new Employee(1, "BBB", D1);
		Employee clonedE1= (Employee) E1.clone();
		//System.out.println(clonedE1.getEmpId());
		//System.out.println(E1.getDept().getDeptName());
		//System.out.println(clonedE1.setEmpName("WWWW"));
		clonedE1.setEmpName("pooja");
		clonedE1.getDept().setDeptName("hande");
		System.out.println(clonedE1.getEmpName());
		System.out.println(E1.getEmpName());
		System.out.println(clonedE1.getDept().getDeptName());
		System.out.println(E1.getDept().getDeptName());
		
		
		
		
	}

}
class Employee implements Cloneable{
	private int empId;
	private String empName;
	private Department Dept;
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
	public Department getDept() {
		return Dept;
	}
	public void setDept(Department dept) {
		Dept = dept;
	}
	public Employee(int empId, String empName, Department dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		Dept = dept;
	}
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		Employee clonedE1= (Employee) super.clone();
		//clonedE1.setDept((Department)clonedE1.getDept().clone());
		Department dept1 = clonedE1.getDept();
		Department clonedDepartment= dept1.clone();
		clonedE1.setDept(clonedDepartment);
		return clonedE1;

	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", Dept=" + Dept + "]";
	}
	
	
	
}
class Department implements Cloneable{
	private int deptId;
	private String deptName;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	@Override
	protected  Department clone() throws CloneNotSupportedException {
		
		return (Department)super.clone();
		
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
		
	
	
	
}
