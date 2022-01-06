package controlStatement;


public class StudentTest {
 public static void main (String[]args) {
	 Student Stu = new Student("Aman",0);
	 Student Stu2 = new Student("kuli",74.5);
	 System.out.printf("%s letter grade is :%s%n",Stu.getName(),Stu.letterGrade());
	 System.out.printf("%s letter grade is :%s%n",Stu2.getName(),Stu2.letterGrade());
 }
}
