import java.util.*;
public class citsa {
    
    public static void main(String args[])
    {
        int p1=0,p2=0;
       int[] A = {1, 3, 4, 6, 7, 9};
       int[] B = {1, 2, 5, 6, 8, 9};
       ArrayList<Integer> R = new ArrayList();
       
       while(p1<A.length && p2<B.length)
       {
           if(A[p1]==B[p2])
           {
               R.add(A[p1]);
               p1++;
               p2++;
           }
           else if(A[p1]>B[p2])
               p2++;
           else
               p1++;
       }
       
       Integer[] a = new Integer[R.size()];
       R.toArray(a);
       for(int i: a)
       {System.out.println(i);}
    }
    
}
