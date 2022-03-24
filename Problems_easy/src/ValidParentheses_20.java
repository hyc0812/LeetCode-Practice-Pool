import java.util.HashMap;
import java.util.Stack;


public class ValidParentheses_20 {
    // Hash table that takes care of the mappings;
    private static final HashMap<Character, Character> hashMap = new HashMap<>();
    // Initialize hash map with mappings. This simply make the code easier to read.
    static {
        hashMap.put(')', '(');
        hashMap.put('}', '{');
        hashMap.put(']', '[');
    }

    private static boolean isValid(String s) {
        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // If the current character is a closing bracket
            if (hashMap.containsKey(c)) {
                // Get the top element of the stack. If the stack is empty, set a dummy value of "#"
                char topElement = stack.empty() ? '#' : stack.pop();
                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != hashMap.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }
    return stack.isEmpty();
    }



    public static void main(String[] args) {
        String str1 = "]({})";
        System.out.println(isValid(str1));

    }
}
