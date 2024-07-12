package day0327.exam;

public class Sawon {
	private String no;
	private String name;
	private String dept;
	private String jop;
	private int sal;
	
	public Sawon() {}

	public Sawon(String no, String name, String dept, String jop, int sal) {
		this.no = no;
		this.name = name;
		this.dept = dept;
		this.jop = jop;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return no + ": " +dept +" " + name +" " + jop;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJop() {
		return jop;
	}

	public void setJop(String jop) {
		this.jop = jop;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
}
