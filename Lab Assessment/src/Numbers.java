
public class Numbers {
	private int number, length;
	private static int[] nums;
	
	public Numbers(){
		number = 0;
		length = 0;
		//nums = new int[length];
	}
	public Numbers(int num){
		setNumbers(num);
	}
	public void setNumbers(int num){
		number = num;
	}
	public static boolean isGoofy(int num){
		int div = 0;
		int len= 5;
		int y = 0;
		int[] nums = new int[len];
		for (int i=num; i > 0; i--){
			int c= (num % 10);
			nums[y] = c;
			num /= 10;
			y++;
			System.out.print(num);
		}
		for (int i=0; i < len; i++){
			if (num % nums[i] == 0){
				div += nums[i];
			}
		}
		if ((div%2) == 1){
			return true;
		}
		else{
			return false;
		}
	}
	public int[] getSomeGoofyNumbers (int count){
		int[] goofy = new int[count];
		for (int i=0; i < count*2; i++){
			if (isGoofy(i) == true){
				goofy[i] = i;
			}
		}
		return goofy;
	}
}
