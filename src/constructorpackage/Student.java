package constructorpackage;

public class Student {
	
	String strStudentName;
	String strCourses;
	
	/*
	 * public Student() { String strStdName = strStudentName; String strstdCourse =
	 * strCourses;
	 * 
	 * 
	 * }
	 */
	
	
	
	
	public Student(String stdName) {
		strStudentName = stdName;
		System.out.println(strStudentName);
		
	}

	public Student(String studentName, String courses) {
		// TODO Auto-generated constructor stub
		strStudentName = studentName;
		strCourses = courses;
		System.out.println(strStudentName + " " + strCourses );

	}

	
	

}
