

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();

        st.push(5);
        st.push(8);
        st.push(14);
        st.push(2);

        System.out.println("Stack : "+st);

        System.out.println("Peek : "+ st.peek());
        System.out.println("Size : "+st.size());
        System.out.println("Pop : "+st.pop());
        System.out.println("Size : "+st.size());
        System.out.println("Stack : "+st);
        System.out.println("Empty : "+st.empty());
        System.out.println("Search idx : "+st.search(14));
    }
}
