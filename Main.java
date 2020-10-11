import java.util.Stack;
class Main {
  //3. Reverse Polish Notation: Given an array of strings containing integers and arithmetic operations, write a function that evaluates the value of the expression using Reverse Polish Notation. 

  //    ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  //    ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
  public static int reversePolishNotation(String[] expression){
    Stack<String> stack = new Stack<String>();
    for (String i : expression) {
      if (i == "+") {
        int sum = Integer.valueOf(stack.pop()) + Integer.valueOf(stack.pop());
        stack.push(String.valueOf(sum));
      } else if (i == "-") {
        int difference = Integer.valueOf(stack.pop())*(-1) + Integer.valueOf(stack.pop());
        stack.push(String.valueOf(difference));
      } else if (i == "*"){
        int product = Integer.valueOf(stack.pop())*Integer.valueOf(stack.pop());
        stack.push(String.valueOf(product));
      } else if (i == "/"){
        int quotient =(int) ((1/Float.valueOf(stack.pop()))*(Float.valueOf(stack.pop())));
        stack.push(String.valueOf(quotient));
      } else {
        stack.push(i);
      }
      System.out.println(stack.peek());
    }
    return Integer.valueOf(stack.pop());
  }
  //4. Valid Parentheses: Given a string containing just the characters '(', ')', '{', '}', '[' and ']', write a function that returns a boolean indicating whether or not the input string is valid.

  //    The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
  public static boolean validParenthes(string)

  public static void main(String[] args) {
    String[] input = {"2", "1", "+", "3", "*"};
    System.out.print(reversePolishNotation(input));
  }
}

 