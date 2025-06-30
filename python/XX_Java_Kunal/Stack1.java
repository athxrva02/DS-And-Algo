package python.XX_Java_Kunal;

import java.util.*;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.empty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.peek());
        System.out.println(st.search(3));
    }
}