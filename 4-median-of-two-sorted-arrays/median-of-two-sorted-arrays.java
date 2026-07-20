class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        //Scanner sc = new Scanner(System.in);
        
        int m[] = new int [num1.length + num2.length];
        int  i = 0,j = 0, k = 0;
        while(i < num1.length && j < num2.length){
            if (num1[i] < num2[j]){
                m[k] = num1[i];
                i++;
                k++;
            }
            else if (num2[j] <= num1[i]){
                m[k] = num2[j];
                j++;
                k++;
            }
        }
        while(j < num2.length){
            m[k] = num2[j];
            j++;
            k++;
        }
        while(i < num1.length){
            m[k] = num1[i];
            i++;
            k++;
        }
        int tl = m.length;
        if (tl % 2 == 1){
            return (double) m[tl / 2];

        }else {
            double mid1 = (double) m[tl / 2 - 1];
            double mid2 = (double) m[tl / 2];
            return (mid1 + mid2) / 2.0;
        }

        
    }
  
}