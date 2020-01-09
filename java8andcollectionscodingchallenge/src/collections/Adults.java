package collections;

public class Adults {
private String adultName;
private int adultAge;
private double adultSalary;
public Adults() {
	super();
	// TODO Auto-generated constructor stub
}

public Adults(String adultName, int adultAge, double adultSalary) {
	super();
	this.adultName = adultName;
	this.adultAge = adultAge;
	this.adultSalary = adultSalary;
}

public String getAdultName() {
	return adultName;
}
public void setAdultName(String adultName) {
	this.adultName = adultName;
}
public int getAdultAge() {
	return adultAge;
}
public void setAdultAge(int adultAge) {
	this.adultAge = adultAge;
}
public double getAdultSalary() {
	return adultSalary;
}
public void setAdultSalary(double adultSalary) {
	this.adultSalary = adultSalary;
}

@Override
public String toString() {
	return "Adults [adultName=" + adultName + ", adultAge=" + adultAge + ", adultSalary=" + adultSalary + "]";
}


}
