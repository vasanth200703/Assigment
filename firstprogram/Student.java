package firstprogram;

public class Student {
	public void readingbooks() {
		System.out.println("student are readingbooks");
	}

	public void playinggames() {
		System.out.println("student are playinggames");

	}

	public void writingtest() {
		System.out.println("student are writingtest");

	}

	public static void main(String[] args) {
		Student obj = new Student();
		obj.readingbooks();
		obj.playinggames();
		obj.writingtest();

	}

}

