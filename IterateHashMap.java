import java.util.*;
public class IterateHashMap {
    public static void main(String[] args) {
        HashMap <Integer,String> n = new HashMap <Integer,String>();
        n.put(0, "vinod");
        n.put(0, "vinoda");
        n.put(1, "vedant");
        n.put(2, "suraj");
        n.put(3, "ritesh");
        
        //keyset and for each
        for(Integer i : n.keySet())
        {
            System.out.println(i +n.get(i));
        }
        
        
        //Entryset and for each
        for( Map.Entry<Integer,String> i : n.entrySet())
        {
            System.out.println(i);
        }
        
        
        //Iterator and entryset
        Iterator <Map.Entry<Integer, String>> itr1 = n.entrySet().iterator();
        while(itr1.hasNext())
        {
            Map.Entry<Integer ,String> i = itr1.next();
            
            System.out.println(Calendar.getInstance().getTimeInMillis()+"  "+ i);
        }
       
    }
    
}
