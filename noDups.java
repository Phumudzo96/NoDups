import java.util.Arrays;

public class noDups {

    public static int[] removeDuplicates(int[] A) {
        if (A.length < 2)
            return A;

        int j = 0;                        // creating variables
        int i = 1;

        while (i < A.length) {            // we'll be checking if elements are not same
            if (A[i] == A[j]) {
                i++;
            } else {
                j++;
                A[j] = A[i];
                i++;
            }
        }

        int[] B = Arrays.copyOf(A, j + 1);   // This is where we'll be removing duplicates
    
        for( int i1: B)
        {
            System.out.println("   " + i1);
        }
        return B;
    }

    public static void main(String[] args) { 
    	// this is the array we'll be working on
        int[] arr = { 20, 100, 10, 80, 70, 1, 0, -1, 2, 10, 15, 300, 7, 6, 2, 18, 19, 21, 9, 0 };
        
        // printing the original array with the duplicates
        System.out.println(arr);
        
        // sorting the elements into being in order
        Arrays.sort(arr);
        
        // removing the duplicates in the array
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
}
