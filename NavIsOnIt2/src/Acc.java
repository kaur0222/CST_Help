
public class Acc {
private String name;
private double bal;
 
// making a consrtuctor

public Acc( String name, double bal) {
	this.name = name;
	// using if to check if bal is less than 0.0 then keep initial value i.e 0.0
   
	if(bal>0.0) {
		this.bal =bal;	
	}
	
}
	 

// method to set name
 public void setName( String name) {
	 this.name = name;
 }
 // method to get name
 public String getName() {
	return name; 
 }
 //method to get balance
 public double getBal() {
	 return bal;
 }
}

