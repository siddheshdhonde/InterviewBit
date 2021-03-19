//https://www.interviewbit.com/problems/spiral-order-matrix-i/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] spiralOrder(final int[][] A) {
        List <Integer> B = new ArrayList<Integer>();
        int row=A.length;
        int col=A[0].length;
        int t=0;
        int b=row-1;
        int l=0;
        int r=col-1;
        int dir=0;
        int k;
        while(t<=b && l<=r){
            if(dir==0){
                for(k=l;k<=r;k++)B.add(A[t][k]);
                t++;
            }
            else if(dir==1){
                for(k=t;k<=b;k++)B.add(A[k][r]);
                r--;
            }
            else  if(dir==2){
                for(k=r;k>=l;k--)B.add(A[b][k]);
                b--;
            }
            else  if(dir==3){
                for(k=b;k>=t;k--)B.add(A[k][l]);
                l++;
            }
            dir=(dir+1)%4;
        }
        int[] ret = new int[B.size()];
        for (int i=0; i < ret.length; i++)
        {
        ret[i] = B.get(i).intValue();
        }
        return ret;
    }
}



