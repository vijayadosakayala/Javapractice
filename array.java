
public class Array {
public static void man(String[] args) {
	int numbers[]= {2,-9,6,5,4,12,-25};
	int sum=0;
	Double average;
	for(int number:numbers) {
		sum +=number;
	}
	
	int arrayLength =numbers.length;
	average=((double)sum /(double)arrayLength);
	System.out.println("sum="+sum);
	System.out.println("Average="+average);
}
}
