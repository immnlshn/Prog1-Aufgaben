public class Stack {
    private final int maxSize;
    private Object[] stack;

    public Stack(int maxSize){
        this.maxSize = maxSize;
        this.stack = new Object[maxSize];
    }
    public void push(Object o){
        Object tmp = this.stack[this.maxSize-1];
        for (int i = 0; i < maxSize-1; i++) {
            stack[i] = stack[i+1];
        }
        stack[maxSize-1] = o;
    }
    public Object pop(){
        if(this.isEmpty()){
            return null;
        }
        Object o = stack[maxSize-1];
        stack[maxSize-1] = null;
        Object tmp;
        for (int i = maxSize-1; i > 0; i--) {
            tmp = stack[i-1];
            stack[i-1] = null;
            stack[i] = tmp;
        }
        return o;
    }
    public boolean isEmpty(){
        for (int i = 0; i < maxSize; i++) {
            if(stack[i] != null){
                return false;
            }
        }
        return true;
    }

}
