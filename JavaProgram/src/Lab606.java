import javax.swing.*;

public class Lab606 {

	public static void main(String[] args) {
		int[] nums = {25,78,41,22,36,85,37};
		int inputIndexArray=Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
		boolean checkIndexFound=checkIndex(inputIndexArray,nums);
		while(!checkIndexFound) {
			inputIndexArray=Integer.parseInt(JOptionPane.showInputDialog("Input index of array , again:"));
			checkIndexFound=checkIndex(inputIndexArray,nums);
		}
		
		int current =currentData(inputIndexArray,nums);
		int previous=prevData(inputIndexArray,nums);
		int next= nextData(inputIndexArray,nums);
		JOptionPane.showMessageDialog(null, "Current data,nums["+inputIndexArray+"] is "+current
									+((previous==-1)? "\nNo previous Data":"\nPrevious data,nums["+(inputIndexArray-1)+"] is "+previous)
									+((next==-1)?"\nNo Next Data":"\nNext data,nums["+(inputIndexArray+1)+"] is "+next));
									
	}
	private static int prevData(int inputIndexArray, int[] nums) {
		return (inputIndexArray==0)?-1:nums[inputIndexArray-1];
	}
	private static int nextData(int inputIndexArray, int[] nums) {
		return (inputIndexArray==nums.length-1)?-1:nums[inputIndexArray+1];
		
	}
	private static int currentData(int inputIndexArray, int[] nums) {
		return nums[inputIndexArray];
		
	}
	private static boolean checkIndex(int inputIndexArray,int[] nums) {
		return (inputIndexArray >= 0 && inputIndexArray < nums.length )?	true:false;
	}
	

}
