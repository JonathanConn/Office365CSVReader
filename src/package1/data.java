package package1;

public class data{
	String name, date;
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
	public void setDate(String n) {
		date = n;
	}
	public String getDate() {
		return date;
	}
	
	public void setData(String n, String d) {
		setName(n);
		setDate(d);
	}
	
	public String toString() {
		return getName() +"\t"+ getDate();
	}
	
}
