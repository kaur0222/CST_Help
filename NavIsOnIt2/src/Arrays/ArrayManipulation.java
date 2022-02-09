package Arrays;

import java.util.ArrayList;

public class ArrayManipulation {
public static void main(String[] args) {
	ArrayList<String>item=new ArrayList<String>();
	item.add("pink");
	item.add(0,"yellow");
//	for(String e :item)
//		System.out.printf("%s ",e);
	item.add("green");
	item.add(2,"red");
	item.remove(0);
	item.remove("pink");
	for(String e :item)
		System.out.printf("%s ",e);
	boolean b=item.contains("pink");
	System.out.println(b);
	System.out.println(item.size());
}
}
