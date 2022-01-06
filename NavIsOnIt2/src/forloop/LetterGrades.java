package forloop;

import java.util.Scanner;

public class LetterGrades {

	public static void main(String[] args) {
		int total=0,gradeCounter=0,aCount=0,bCount=0,cCount=0,dCount=0,fCount=0;
		Scanner input = new Scanner(System.in);
		System.out.printf("%s%n%s%n %s%n %s%n","Enter the integer grades in the range 0-100",
				 "Type the end of the file indicator to terminate input:","On Unix type ctrl d then hit enter",
				"On windows type ctrl z then hit enter");
		while(input.hasNext()){
			int grade= input.nextInt();
			total = total + grade;
			gradeCounter++;
		
			switch (grade/10)
			{
			    case 9:// 90
			    case 10://100
					aCount++;
			    break;
			 
				case 8://80-89
					bCount++;
					break;
					
				case 7://70-79
					cCount++;
					break;
					
				case 6://60-69
					dCount++;
					break;
					
				default:
					++fCount;
					break;
				
			}
		}
		 
		System.out.printf("%n%s%n","Grade Report:");
		
		if (gradeCounter!=0) {
			double avg = (double) total/gradeCounter;
			System.out.printf("Total of the %d grades entered is %d", gradeCounter, total);
			System.out.printf("%nClass average is %.2f%n", avg);
			System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of students who received each grade:",
					"A ", aCount,
					"B ", bCount,
					"C ", cCount,
					"D ", dCount,
					"F ", fCount
					);
		}
		else {
			System.out.println("No grades were entered");
		}
		
	}
}
