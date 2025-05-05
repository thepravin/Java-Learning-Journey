import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExercise {
    public  static void main(String []args){
        TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();
        // Put elements to the map
        tree_map.put(1, "Red");
        tree_map.put(2, "Green");
        tree_map.put(3, "Black");
        tree_map.put(4, "White");
        tree_map.put(5, "Blue");

        System.out.println(tree_map);

//        for (Map.Entry<Integer,String>entry : tree_map.entrySet()){
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//        }

        // @ sort keys in a Tree Map by using a comparator.
        TreeMap<Integer,String>tree_map1 = new TreeMap<>(new sort_key()) ;
        tree_map1.put(1,"Apple") ;
        tree_map1.put(2 , "Ball") ;
        tree_map1.put(6 , "Orange") ;
        tree_map1.put(3 , "Black") ;
        System.out.println(tree_map1);

    }
}

class sort_key implements Comparator<Integer> {
    @Override
    public int compare(Integer a,Integer b){
        return b-a ;
    }
}