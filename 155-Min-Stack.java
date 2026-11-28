import java.util.Stack;

class Node {
    int val;
    int min;

    public Node(int v, int m) {
        val = v;
        min = m;
    }
}

class MinStack {
    Stack<Node> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new Node(val, val));
            return;
        }

        int minTop = stack.peek().min;

        if (val < minTop) {
            stack.push(new Node(val, val));
        } else {
            stack.push(new Node(val, minTop));
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        stack.pop();
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.peek().val;
    }

    public int getMin() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.peek().min;
    }
}