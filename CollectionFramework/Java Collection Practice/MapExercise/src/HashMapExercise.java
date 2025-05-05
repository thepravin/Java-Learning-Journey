import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExercise {
    public static void main(String[] args) {

        HashMap<Integer,String>hash_map = new HashMap<>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

        System.out.println(hash_map);

        // @ travel the map
//        for(Map.Entry x : hash_map.entrySet()){
//            System.out.println(x.getKey() + " : " +x.getValue());
//        }

//        //@ shallow copy
//        HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>();
//        new_hash_map = (HashMap)hash_map.clone();
//        System.out.println("Cloned map: " + new_hash_map);

        if(hash_map.containsKey(3)){
            System.out.println("Value of Red : "+hash_map.get(3));
        }

        // get keyset value from map
        Set keyset = hash_map.keySet();

        // check key set values
        System.out.println("Key set values are: " + keyset);

        Object[] keyset2 = hash_map.keySet().toArray();
        System.out.println(keyset2[3]);
    }
}