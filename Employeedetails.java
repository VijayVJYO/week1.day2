package selenium;

public class Employeedetails {
public  String printEmployeeName(String empName, int empID) {
	return empName;	
}
public String getEmployeeAddress(String empAddress) {
	return empAddress;
}
public double printEmployeeSalary(double empsalary) {
	return empsalary ;
}
public long printMobileNo(long empNo) {
	return empNo;
}
public static void main(String[] args) {
	Employeedetails ed = new Employeedetails();
	
	String Name = ed.printEmployeeName("vj", 3699);
	System.out.println(Name);
	String address =ed.getEmployeeAddress("Chengalpattu");
	System.out.println(address);
	double salary =ed.printEmployeeSalary(30000);
	System.out.println(salary);
	long mobNo =ed.printMobileNo(000000000);
	System.out.println(mobNo);
}
}
