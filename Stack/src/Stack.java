public class Stack {

    private final int maxSize;
    private Object[] stack;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new Object[maxSize];
    }

    public void push(Object o) {
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] == null) {
                stack[i] = o;
                return;
            }
        }
    }

    public Object pop() {
        for (int i = maxSize - 1; i >= 0; i--) {
            if (stack[i] != null) {
                Object tmp = stack[i];
                stack[i] = null;
                return tmp;
            }
        }
        return null;
    }


    public boolean isEmpty() {
        for (int i = 0; i < maxSize; i++) {
            if (stack[i] != null) {
                return false;
            }
        }
        return true;
    }

}
