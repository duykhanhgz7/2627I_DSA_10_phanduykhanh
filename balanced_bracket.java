import java.util.Stack;

public class balanced_bracket {

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // Dấu ngoặc mở
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            // Dấu ngoặc đóng
            else if (c == ')' || c == ']' || c == '}') {

                // Không có dấu mở tương ứng
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Kiểm tra cặp ngoặc
                if (c == ')' && top != '(') {
                    return false;
                }

                if (c == ']' && top != '[') {
                    return false;
                }

                if (c == '}' && top != '{') {
                    return false;
                }
            }
        }

        // Stack phải rỗng
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s1 = "{[()]}";
        String s2 = "{[(])}";
        String s3 = "((()))";

        System.out.println(isBalanced(s1)); // true
        System.out.println(isBalanced(s2)); // false
        System.out.println(isBalanced(s3)); // true
    }
}