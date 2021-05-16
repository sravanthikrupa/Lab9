package Lab9.casestudy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class EmployeeRepository {
	public static void main(String[] args) {
		EmployeeRepository obj = new EmployeeRepository();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		Department d = new Department(1, "XYZ", 200);
		Employee e = new Employee(100, "Tejashwini", "Nagolu", "tejas@gmail.com", "7764879873", LocalDate.parse("2021-04-01", format), "System Associate", 40000, 200, d);
		Employee e1 = new Employee(101, "Mike",
				"Alex", "mikealex@gmail.com", "9010234576", LocalDate.parse("2021-03-10", format), "Project Associate", 30000, 200, d);
		List<Employee> empList = new ArrayList<>();
		empList.add(e);
		empList.add(e1);
		
		
		obj.findSumOfSalary(empList);
		obj.findMonthsAndYears(empList);

	}
public void findSumOfSalary(List<Employee> e) {
		
		IEmployeeService es = (List<Employee> empList)->{
			double sum = 0.0;
			for(Employee e1 : empList) {
				sum+=e1.getSalary();
			}
			System.out.println("Sum of all employee salary is:"+sum);
		};
		
		es.findEmployee(e);
		
	}
	public void findMonthsAndYears(List<Employee> e) {
		IEmployeeService es = (List<Employee> empList)->{
			System.out.println("Employee Name             Duaration of Service");
			for(Employee e1:empList) {
				Period diff = Period.between(e1.getHireDate(), LocalDate.now());
				System.out.println(e1.getFirstName()+" "+e1.getLastName()+"              "+"Months: "+diff.getMonths()+" "+"Days: "+diff.getDays());
			}
		};
		es.findEmployee(e);
	}
	
}
