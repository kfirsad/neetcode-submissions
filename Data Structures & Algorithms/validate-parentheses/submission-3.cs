public class Solution {
    public bool IsValid(string s) {
        Stack<char> parent = new Stack<char>();

        foreach (char c in s) {
            if (c == '(' || c == '{' || c == '[') {
                parent.Push(c);
            } else {

                if (parent.Count == 0) {
                    return false;
                }

                char head = parent.Pop();
                switch (c) {
                    case ')':
                        if (head != '(')
                            return false;
                        break;

                    case '}':
                        if (head != '{')
                            return false;
                        break;

                    case ']':
                        if (head != '[')
                            return false;
                        break;
                }
            }
        }
        return parent.Count == 0;
    }
}
