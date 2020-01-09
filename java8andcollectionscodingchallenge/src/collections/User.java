package collections;

public class User {
	private int userId;
	private String userName;
	private int age;
	private double salary;
	private Phone phone;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userName, int age, double salary, Phone phone) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.age = age;
		this.salary = salary;
		this.phone = phone;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", age=" + age + ", salary=" + salary + ", phone="
				+ phone + "]";
	}
	

}
