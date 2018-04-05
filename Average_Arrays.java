import java.util.Scanner;
public class Average_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("How many numbers would you like to enter?");
		
		int []nums=new int[sc.nextInt()];
		int sum=0;
		double avg=0;
		
		for(int x=0; x<nums.length; x++) {
			
			System.out.println("Enter number");
		nums[x]=	sc.nextInt();
		
		sum=((sum+nums[x]));
		avg=sum/nums.length;
		
		
		}
		
		System.out.println("The average of the array is "+ avg);
			
		
	}

}
