
import java.util.*;

public class n {

    public static void main(String[] args) {

        Integer maxCount = -1;
        Integer maxItem = null;
        int[] array1 = {1, 3, 1, 3, 3,2,2,2,2, 1};
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
        Arrays.sort(array1);//kuch jarurat nahi hain bas aise hi..to practice function
        ;
       
       HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for(int i : array1) {
            if (count.containsKey(i)) {   
                Integer newVal = count.get(i) + 1;
                count.put(i, newVal);
            } else {
                count.put(i, 1);
            }
            if (count.get(i) > maxCount) {
                maxCount = count.get(i);
                maxItem = i;
            }
        }
        System.out.println(maxItem);

    }

}
