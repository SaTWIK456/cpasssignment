public class Employee {
	String empId="";
	String empName="";
	double salary=0;
	Employee(double salary,String empId,String empName){
		this.salary=salary;
		this.empId=empId;
		this.empName=empName;

	}
	Employee(Employee e){
		this.empId=e.empId;
		this.empName=e.empName;
		this.salary=e.salary;
		
	}
	void Calculation(Employee e) {
		double pf=(0.15*(salary));
		double allowances=(0.5*salary);
		double basic=salary-pf-allowances;
		System.out.println("The salary of "+empName+" ->" +salary);
		System.out.println("pf = "+empName+" -> "+pf);
		System.out.println(empName+"allowances are -> "+ allowances);
		System.out.println(empName+"has recieved salary of-> "+basic);
		
	}

}