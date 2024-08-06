package pratice;

public class Encap {
	private String name;

public String getname() {
	return name;
}
public void setname(String name) {
	this.name=name;
}

	public static void main(String[] args) {
		Encap obj = new Encap();
		obj.setname("Sandeep");
		System.out.println(obj.getname());
		

	}

}
