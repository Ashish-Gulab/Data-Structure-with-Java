// To store the pair of key and value, Hash Map is used
// It does not contain duplicate key(Unique Key). So if the duplicate key occur the it will update it .
// The order does not matter

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Hashmap
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map=new HashMap<>();

        // Insertion 
        map.put("China",150);
        map.put("India",130);
        map.put("America",30);

        System.out.println(map);

        // Updation
        map.put("India",155);
        System.out.println(map);

        // Search
        if(map.containsKey("India"))
        {
            System.out.println("India is present in the Key");
        }
        else
        {
            System.out.println("India is not present in the Key");
        }

        if(map.containsKey("UK"))
        {
            System.out.println("UK is present in the Key");
        }
        else
        {
            System.out.println("UK is not present in the Key");
        }

        // Getting value
        System.out.println(map.get("India"));

        // Iteration of map using entrySet(preferred)
        for(Map.Entry<String,Integer> e:map.entrySet())
        {
            System.out.print(e.getKey()+" ");
            System.out.println(e.getValue());
        }

        System.out.println();

        // Iteration Of Map using keySet
        Set<String> keys=map.keySet();
        for(String key:keys)
        {
            System.out.println(key+" "+map.get(key));
        }
    }
}