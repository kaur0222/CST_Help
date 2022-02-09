package Arrays;

public class arrays {

	public static void main(String[]args) {
		int [][] array1= { {1,2,3} , {1,4,8} };
		int [][] array2= { {1,2},{3},{2,5,6} };
		System.out.println("Values in array1 by row are");
			outputArray(array1);
			System.out.printf("%nValues in array2 by row are%n");	
			outputArray(array2);
	}
	public static void outputArray(int[][] array) {
		for(int i=0;i<array.length;i++) {
			
			for(int x=0;x<array[i].length;x++) {
				System.out.printf("%d ",array[i][x]);
			}
			System.out.println();
		}
	}
}















////declare an array & initialize it
//int[] d = new int[10]; 
//
//for(int i=0;i<d.length;i++) {
//	System.out.printf("Index and Value %5d%8d%n",i,d[i]);
//}


//int[] x= {10,20,40,50,13,45,40,33,22,36};
//System.out.printf("%s%10s%n","Index","Value");
//for(int i=0;i<x.length;i++){
//    System.out.printf("%4d%8d%n",i,x[i]);
//}


//final int ARRAY_LENGTH =11;
//int[] a = new int[ARRAY_LENGTH];
//System.out.printf("%s%10s%n","Index","Value");
//for(int i =0; i<ARRAY_LENGTH;i++) {
//	a[i]=3*i;
//	System.out.printf("%5d%5d%n",i,a[i]);
//}


//
//int[]array= {0,0,0,0,0,0,1,2,4,2,1};
//
//for(int i = 0; i<array.length;i++) {
//	if(i==10)
//		System.out.printf("%5d: ",100);
//	else
//		System.out.printf("%02d-%02d ",i*10,i*10+9);
//		
//	for(int stars=0;stars<array[i];stars++) {
//		System.out.print("*");
//	}
//	System.out.println();
//}



//int[]array= {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
//
//// Array of frequency
//int[]frequency = new int[6];
//
//for(int i=0;i<array.length;i++) {
//	try {
//	++frequency[array[i]];
//		//frequency[array[i]]=frequency[array[i]]+1;
//	}
//	catch(ArrayIndexOutOfBoundsException e){
//		System.out.println(e);
//		System.out.printf("  responses[%d] =  %d%n%n",i,array[i]);
//	}
//}
//System.out.printf("%s%10s%n","Rating", "Frequency");
//for(int rating=1;rating<frequency.length;rating++) {
//	System.out.printf("%6d%10d%n",rating,frequency[rating]);
//}
//

/*   int[] grades= {1,2,3,4,5,6,7,8,9,10};          
int total =0;                                      
for(int x: grades)                                 
	total=total+x;                                 
System.out.printf("Total of Array elements: %d");  

 */  


////=================================================================/////


//
//int[] array= {1,2,3,4,5};
//
//System.out.printf("Effects of pasing reference to entire array: %n"
//		+"The original values are: %n");
//
//for(int x :array)
//	System.out.printf("  %d",x);
//
//modifyArray(array);
//System.out.printf("%n%nModified array values are %n");
//for(int x :array)
//	System.out.printf("  %d",x);
//
//System.out.printf("%n%nEffects of passing element value %n"
//		+"array[3] value before modifyElement: %d%n",array[3]);
//
//modifyElement(array[3]);
//System.out.printf("Value after modifyelement: %d",array[3]);
//
//
//}
//
//
//public static void modifyArray(int[] array2) {
//for(int x =0;x<array2.length;x++) {
//	array2[x]=array2[x]*2;
//}
//	
//
//}
//public static void modifyElement(int element) {
//element =element*3;
//System.out.printf("Value of modified element %d%n",element);
//}




