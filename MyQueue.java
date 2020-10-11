//Week 3 Stacks and Queues

import java.util.Stack;

//1. Queue using two stacks: Write a MyQueue class that simulates a queue and supports all operations using two stacks. 
class MyQueue<T> {
  Stack<T> stackOne;
  Stack<T> stackTwo;

  public MyQueue(){
    this.stackOne = new Stack<T>();
    this.stackTwo = new Stack<T>();
  }

  public void add (T thing){
    if (stackOne.empty()){
      while(!stackTwo.empty()){
        stackOne.push(stackTwo.pop());
      }
    }
    this.stackOne.push(thing);
  }


  public T poll (T thing) {
    if (this.stackTwo.empty()) {
      while (stackOne.empty() == false) {
        stackTwo.push(stackOne.pop());
      }
    }
    return stackTwo.pop();
  }

  public T peek (T thing) {
    if (this.stackTwo.empty()) {
      while (stackOne.empty() == false) {
        stackTwo.push(stackOne.pop());
      }
    }
    return stackTwo.peek();
  }

  public boolean isEmpty() {
    if(stackOne.empty && stackTwo.empty){
      return true;
    }else{
      return false;
    }
  }
}