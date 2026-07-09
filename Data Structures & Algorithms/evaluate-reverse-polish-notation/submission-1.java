class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String c:tokens){
            switch(c)
            {
            case "+":
            stack.push(stack.pop()+stack.pop());
            break;

            case "*":
            stack.push(stack.pop()*stack.pop());
            break;

            case "-":
            int a = stack.pop();
            int b = stack.pop();
            stack.push(b-a);
            break;

            case "/":
            int i = stack.pop();
            int j = stack.pop();
            stack.push(j/i);
            break;

            default:
            stack.push(Integer.parseInt(c));
            }
        }
    return stack.pop();
    }
}
