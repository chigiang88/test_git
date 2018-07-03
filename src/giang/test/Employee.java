package giang.test;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Employee {
	private String firstName;
	private String LastName;
	private Integer age;
	private String phone;
	private String email;
	private Date dateOfBirth;
	
	private static Map<String, Employee> mapEmployee = new HashMap<>();
	
	public Employee(String firstName, String lastName, Integer age, String phone, String email, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}
	
	public static Map<String, Employee> getMapEmployee() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		if (mapEmployee.size() == 0) {
			// khoi tao map
			
			Employee e1 = new Employee("Ngo", "Chi Giang" , 30, "0978431677", "giangnc1@fsoft.com.vn", sdf.parse("15/08/1988"));
			Employee e2 = new Employee("Ngo", "Thi Mai" , 45, "0978431677", "mai@fsoft.com.vn", sdf.parse("15/08/1988"));
			Employee e3 = new Employee("Nguyen", "Quang Minh" , 37, "0978431677", "minh@fsoft.com.vn", sdf.parse("15/08/1988"));
			Employee e4 = new Employee("Nguyen", "Tuan Minh" , 3, "0978431677", "minhnguyen@fsoft.com.vn", sdf.parse("15/08/1988"));
			Employee e5 = new Employee("Ngo", "Chi Tung" , 17, "0978431677", "tung@fsoft.com.vn", sdf.parse("15/08/1988"));
			Employee e6 = new Employee("Nguyen", "Thanh Cong" , 30, "0978431677", "cong@fsoft.com.vn", sdf.parse("15/08/1988"));
			Employee e7 = new Employee("Ngo", "Minh Duc" , 15, "0978431677", "duc@fsoft.com.vn", sdf.parse("15/08/1988"));
			Employee e8 = new Employee("Le", "Xuan Hai" , 30, "0978431677", "hai@fsoft.com.vn", sdf.parse("15/08/1988"));
			Employee e9 = new Employee("Ngo", "Cong Hai" , 30, "0978431677", "hainc@fsoft.com.vn", sdf.parse("15/08/1988"));
			Employee e10 = new Employee("Nguyen", "Viet Tung" , 30, "0978431677", "tungnv@fsoft.com.vn", sdf.parse("15/08/1988"));
			
			mapEmployee.put("1", e1);
			mapEmployee.put("2", e2);
			mapEmployee.put("3", e3);
			mapEmployee.put("4", e4);
			mapEmployee.put("5", e5);
			mapEmployee.put("6", e6);
			mapEmployee.put("7", e7);
			mapEmployee.put("8", e8);
			mapEmployee.put("9", e9);
			mapEmployee.put("10", e10);
		}
		return mapEmployee;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", LastName=" + LastName + ", age=" + age + ", phone=" + phone
				+ ", email=" + email + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	public static Comparator<Employee> EmailComparator = new Comparator<Employee>() {

		public int compare(Employee fruit1, Employee fruit2) {

			String fruitName1 = fruit1.getEmail();
			String fruitName2 = fruit2.getEmail();

			// ascending order
			return fruitName1.compareToIgnoreCase(fruitName2);

			// descending order
			// return fruitName2.compareTo(fruitName1);
		}

	};

	
}
