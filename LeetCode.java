package Matrix;
public class LeetCode {
    
        public static int[] twoSum(int nums[], int target) {
            int numbers[] = new int[2];
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    int temp=nums[i]+nums[j];
                    if(temp==target){
                        numbers[0] = i;
                        numbers[1] = j;
                        return numbers;
                        
                        
                    }
                }
            }
            return numbers;
        }
        public static void main(String args[]){
            int nums[] = {3,2,4};
            int target = 6;
            //int[] res = twoSum(nums,target);
            //System.out.print("["+res[0]+","+res[1]+"]");
            int y = -121;
            boolean res1 = isPalindrome(y);
            System.out.print(res1);
        }
        public static boolean isPalindrome(int x) {
            int real = x;
            int reversed=0;
            if(x>=0){
            while(x!=0){
                int digit = x % 10;
                reversed = reversed * 10 + digit;
                x /= 10;
            }
            if(reversed==real){
                return true;
            }
            }
           return false; 
        

        }
    // public static void twoSum(int nums[], int target) {
        
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             int temp=nums[i]+nums[j];
    //             if(temp==target){
    //                 System.out.print("["+i+","+j+"]");
                    
    //             }
    //         }
    //     }
    // }
    // public static void main(String args[]){
    //     int nums[] = {3,2,4};
    //     int target = 6;
    //     twoSum(nums,target);
    // }
}
