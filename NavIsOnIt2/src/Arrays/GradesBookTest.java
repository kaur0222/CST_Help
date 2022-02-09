package Arrays;

public class GradesBookTest {
	public static void main(String[]args) {
		int[][]test= {{87,96,70},
				{68,87,90},
				{94,100,90},
				{100,81,80},
				{83,65,85},
				{78,87,65},
				{85,75,83},
				{91,94,100},
				{76,72,84},
				{87,93,73}
		};
		GradesBook gb = new GradesBook("Intro to Computer Programming",test);
		System.out.printf("Welcome to the grade book for %n%s%n%n",gb.getCourse());
		gb.processGrades();
	}

}