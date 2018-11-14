import java.util.*;
public class NonRepeating {
    public static void main(String[] args) {
        String s="abaddsbhs";
        int count=-1;
        
        
        //First Non repeating char using linkedHashmap if not then -1 ..ok la la la l ala l al MF..
        
    
    HashMap<Character,Integer> charcount = new LinkedHashMap<Character,Integer>();
    for(char c : s.toCharArray())
    {
        if(charcount.containsKey(c))
        {
            Integer newval = charcount.get(c) + 1;
            charcount.put(c, newval);
        }
        else
            charcount.put(c,1);
        
    }
    
    for(char c : s.toCharArray())
    {
        if(charcount.get(c)==1)
        {
            System.out.println(c);
            count=0;
            
            break;
        }
    }
    if(count==-1)
    System.out.println(count);
    }
    
    
    
}
