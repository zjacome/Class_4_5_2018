
public class Even_Odd_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0;
		int odd=0;
		int[] nums= {1,2,3,4,5,6,7,8,9};
		
		for(int y=0; y<nums.length; y++) {
			
			if(nums[y]%2==0) {
				even++;
			}
			else if(nums[y]%2==1) {
				odd++;
			}
		
		
		}
		System.out.println("There are "+even+" even numbers in the array");
		System.out.println("There are "+odd+ " odd numbers in the array");
	}

}
