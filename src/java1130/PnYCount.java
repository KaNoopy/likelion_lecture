package java1130;


import java.util.Stack;

public class PnYCount {
    boolean solution(String s) {
        boolean answer = true;
        s.toUpperCase();
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) =='P' ) {
                stack.push(i);
            } else if (s.charAt(i) =='Y') {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return answer = true;
        }
        return answer =false;
    }

    public static void main(String[] args) {
        String s ="pPoooyY";
        PnYCount py = new PnYCount();
        System.out.println(py.solution(s));
    }

}
