import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Pink");
        list.add("Blue");
        list.add("Black");

//            list.add(1,"Black") ;
        System.out.println("list : " + list);
//            System.out.println(list.get(1));
//            list.set(1,"Pravin") ;
//            System.out.println(list);

//            list.remove(3);
//            System.out.println(list);

//            System.out.println(list.contains("Blue"));


//           Collections.sort(list) ;
//            System.out.println(list);

        /*
         *  @Copy one list to another.
         *
         * -> both list contain same size and data type.
         *
         * Collections.copy(where_to_Copy , which_list_copy);
         *
         * Collections.nCopies(size, default_value_contain_Same_DetaTypeAs_declare) ;
         *
         *
         * */
//            List<String>list2 = new ArrayList<>(Collections.nCopies(list.size(),"5"));
//            System.out.println("list2 : "+list2);
//            Collections.copy(list2,list);
//            System.out.println(list2);
                    // OR
//        List<String>list2 = new ArrayList<>(list) ;
//        System.out.println(list2);



        // @ shuffle elements in an array list.
//        Collections.shuffle(list);
//            System.out.println(list);

//            Collections.reverse(list);
//            System.out.println(list);

//            List<String>sub_List = list.subList(0,list.size());
//            System.out.println(sub_List);

//        Collections.swap(list,2,3) ;
//        System.out.println(list);


        // @ join two array lists.

//        List<String> list2 = new ArrayList<>();
//        list2.add("Pravin") ;
//        list2.add("Nalawade") ;
//
//        list.addAll(list2);
//        System.out.println(list);


//        list.clear();
//        System.out.println(list);

//        if(list.isEmpty()){
//            System.out.println("Empty");
//        }else{
//            System.out.println("Not Empty");
//        }

        List<Integer>beforeTrim = new ArrayList<>(10);
        beforeTrim.add(2);
        beforeTrim.add(5);
        beforeTrim.add(10);
        ((ArrayList<Integer>) beforeTrim).trimToSize() ;



    }

}