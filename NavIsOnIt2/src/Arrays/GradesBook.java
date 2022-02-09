package Arrays;

public class GradesBook {
	private String courseName;
	private int[][]grades;

    public GradesBook(String cname, int[][] grades) {
    	this.courseName=cname;
    	this.grades=grades;
    }
    
    public void setCourse(String course) {
    	this.courseName=course;
    }

    public String getCourse() {
    	return courseName;
    }

    public void processGrades() {
    	outputGrades();
      	System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",getMin(),getMax());
    	
    	barChart();
    	
    }
    
    public int getMin() {
    	int lowgrade= grades[0][0];
    	for(int[] studentgrade:grades) {
    		for(int grade:studentgrade) {
    			if(grade<lowgrade)
    				lowgrade=grade;
    		}
    	}	
    	return lowgrade;
    }
    
    
    
    public int getMax() {
    	int highgrade=grades[0][0];
    for(int[]studentgrade:grades) {
    	for(int grade:studentgrade) {
    		if(grade>highgrade)
    		highgrade=grade;
    	}
    }
    	return highgrade;
    }
    
    public double getAverage(int[]setofGrades) {
    	int total =0;
    	for(int grade:setofGrades)
    		total = total+grade;
    	return (double)total/setofGrades.length;
    }
    
    public void barChart() {
    	System.out.println("Overall grade distribution");
    	
    	int[] frequency= new int[11];
    	for(int[] studentGrades : grades) {
    		for(int grade: studentGrades)
    			frequency[grade/10]=frequency[grade/10]+1;
    	}
    		
    	for(int x =0; x<frequency.length;x++) {
    		if(x==10) {
    			System.out.printf("%5d: ",100);
    		}
    		else {
    			System.out.printf("%02d-%02d",x*10,x*10+9);
    		}
    		
    		for(int s=0;s<frequency[x];s++) 
    			System.out.print("*");
    		System.out.println();
    	
    	}
    }
    
    
    public void outputGrades() {
    	System.out.printf("The grades are: %n%n");
    	System.out.print("              ");
    	//for(int x=0;x<grades[0].length;x++) 
    	for(int x=0;x<grades[1].length;x++) 
    		System.out.printf("Test %d ",x+1);
    		System.out.println(" Average");
    		
    		for(int student=0;student<grades.length;student++) {
    			System.out.printf("Student %2d",student+1);
    			for(int test:grades[student])
    				System.out.printf("%8d",test);
    			
    			double avg=getAverage(grades[student]);
    			System.out.printf("%9.2f%n",avg);
    		}
    	
    }
    
}
