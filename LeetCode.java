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
            int[] res = twoSum(nums,target);
            System.out.print("["+res[0]+","+res[1]+"]");
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
