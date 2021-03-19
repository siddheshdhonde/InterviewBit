//https://www.interviewbit.com/problems/max-non-negative-subarray/

public class Solution {
    public int[] maxset(int[] A) {
        int l = A.length; 
        int sum = 0, i = 0; 
        int max = -1; 
        while (i < l) { 
            while (i < l && A[i] < 0) { 
                i++; 
                continue; 
            } 
            while (i < l && 0 <= A[i]) { 
                sum += A[i++]; 
                max = Math.max(max, sum); 
            } 
            sum = 0; 
        } 
        int B[] = new int[max];
        return B; 
    }
    }

