import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String>list = new LinkedList<>();

        list.add("Red");
        list.add("Black");
        list.add("Blue");
        list.add("Orange");
        list.add("Yellow");
        System.out.println("List : "+list) ;

        // @ iterate through all elements
//        for(String li : list){
//            System.out.print(li+" ");
//        }

        //@ start form specific index
        Iterator p = list.listIterator(1);
        //# list from second position
//        while(p.hasNext()){
//            System.out.print(p.next()+" ");
//        }


        // @ reverse order
//        Collections.reverse(list); // or using stack
//        for(String li : list){
//            System.out.print(li+" ");
//        }

        // @ insert at specific position
//        list.add(2,"Pravin");
//        System.out.println(list);

        // @ insert first and last position
//        list.addFirst("Pravin");
//        list.addLast("Nalawade");
//        System.out.println(list);


        // @ get first and last element
//        String first = list.getFirst() ;
//        String last = list.getLast() ;
//        System.out.println(first + " "+last);


//        for(int i=0;i<list.size();i++){
//            System.out.println(i + " : "+list.get(i));
//        }

        // @ remove specific position
//        list.remove(1);
//        System.out.println(list);

        // @ swap
//        Collections.swap(list,1,2) ;
//        System.out.println(list);

        // @ join two list
//        List<String>list2 = new LinkedList<>();
//        list2.add("Pravin") ;
//        list2.add("Nalawade") ;
//
//        List<String>list3 = new LinkedList<>();
//        list3.addAll(list) ;
//        list3.addAll(list2) ;
//        System.out.println(list3) ;
//

        // @ copy one list to another
//        List<String>list2 = new LinkedList<>(list);
//        System.out.println(list2);

        // @ remove and return the first element
        LinkedList<String>ll = new LinkedList<>();
        ll.add("Pravin");
        ll.add("nalawade");
        ll.add("tuljapur");
        ll.add("maharashtra");

//        System.out.println(ll.pop());

        // @ retrieve but not remove,the first , last
//        System.out.println(ll.peekFirst());
//        System.out.println(ll.peekLast());

        //@ present or not
//        System.out.println(list.contains("Red"));

        //@ convert ll to arraylist
//        List<String> list4 = new ArrayList<>(list) ;

        //@ compare two linked list
        LinkedList<String> c1= new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        LinkedList<String> c2= new LinkedList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Orange");

        //comparison output in linked list
        LinkedList<String> c3 = new LinkedList<String>();
        for (String e : c1)
            c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3);

        //@ replace element
        list.set(1,"Pravin");

    }
}