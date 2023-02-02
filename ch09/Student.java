package ch09;

public class Student {
	//멤버변수
	String name;
	String num;//학번
	String major;//전공
	int year;//학년
	public Student() {
	}
	
//	public Student(String name, String num, String major, int year) {
//		this.name = name;
//		this.num = num;
//		this.major = major;
//		this.year = year;
//	}

	//상속관계의 클래스들에서는 생성자보다는 메소드를 활용하는 편이다.
	public void input(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}

}
