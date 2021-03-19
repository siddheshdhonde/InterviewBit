//https://www.interviewbit.com/problems/min-steps-in-infinite-grid/

import java.lang.Math;
public class Solution {
    public int coverPoints(int[] A, int[] B) {
        int steps = 0;
        int dX,dY;
        if(A.length!=B.length){
            return 0;
        }
        else if(A.length==1 && B.length==1){
            return 0;
        }
        else{
        for(int i=0;i<A.length-1;i++)
        {
            dX= Math.abs(A[i+1]-A[i]);
            dY= Math.abs(B[i+1]-B[i]);
            steps=steps+ Math.max(dX,dY);
        }
        return steps;
        }
    }
}

