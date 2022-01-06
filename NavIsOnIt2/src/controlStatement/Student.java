package controlStatement;


public class Student {
private String name;
private double avg;
 
  public Student(String name, double avg) {
	 this.name=name;
	 if(avg>0.0 & avg<100) {
		 this.avg=avg;
	 }
	 
}
  
  public void setName(String name) {
	 this.name = name;
}
  
  public String getName() {
		return name;
	}
	
  public void setAvg(double avg) {
	  if(avg>0.0 & avg<100) {
			 this.avg=avg;
		 }
}
  public double getAvg() {
	  return avg;
  }
  
  public String letterGrade() {
	String lg ="";
	
	if(avg>=90) 
		lg="A";
	
		else if(avg>=80)	
		lg="B";
	
		else if(avg>=70)
			lg="C";
	
		else if(avg>=60)
	       lg="D";
	
		else
			lg="F";
	
	return lg;
  }

}
