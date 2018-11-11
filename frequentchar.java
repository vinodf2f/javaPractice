
import java.util.*;

public class frequentchar {

    public static void main(String[] args) {

        Integer maxCount = -1;
         Character maxItem = null;
         String s = "vinodvovnoo";
        char[] array1 = s.toCharArray();
          Arrays.sort(array1);
          array1.toString();
         
        
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for(char i : array1) {
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
