import java.util.Stack;

public class Ass15Q5 {
    public static String reverseString(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            stack.push(s.charAt(i));
        }

        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        String input = "GeeksforGeeks";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }
}
