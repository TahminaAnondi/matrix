package Matrix;
import java.util.Scanner;

public class twoDMatrix {
    
    public static void LargestAndSmallest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int largestFoundAti = 0;
        int largestFoundAtj = 0;
        int smallestFoundAti = 0;
        int smallestFoundAtj = 0;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>largest){
                    largestFoundAti= i;
                    largestFoundAtj = j;
                }
                if(matrix[i][j]<smallest){
                    smallestFoundAti= i;
                    smallestFoundAtj = j;
                }
                
                largest = Math.max(matrix[i][j], largest);
                smallest = Math.min(matrix[i][j], smallest);
            }
        }
        System.out.print("LArgest: "+largest+ "found at ("+ largestFoundAti+", "+ largestFoundAtj+")");
        System.out.print("Smallest: "+smallest+ "found at ("+ smallestFoundAti+", "+ smallestFoundAtj+")");
        
    }
    public static boolean search(int matrix[][],int key){
       
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("found at cell ("+i+", "+j+")");
                    return true;
                }
                
            }
        }
        
        System.out.println("Key not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n=matrix.length, m=matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        search(matrix,5);
        LargestAndSmallest(matrix);

    }
    
}

