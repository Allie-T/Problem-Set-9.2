
/**
 * Write a description of class Binary_Search here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Binary_Search{
    public static void main(String []args){
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(myArray,1,9,3));
        
        
    }
    public static int binarySearch(int[] nums, int start, int end, int key){
        if(start>end) return -1;
        int avg = (start+end)/2;
        
        if(nums[avg] == key){
            return nums[avg];
        }else if(nums[avg] > key){
            return binarySearch(nums, start,avg-1, key); 
        }else{
            return binarySearch(nums, avg+1, end, key);
        }
    }
}