import java.util.ArrayList;

public class MinStack {

    private int index;
    private ArrayList<Integer> arrayList;

    /** initialize your data structure here. */
    public MinStack() {
        this.index = 0;
        this.arrayList =  new ArrayList();
    }

    public void push(int x) {
        arrayList.add(index,x);
        index++;
    }

    public void pop() {
        if(index > 0){
            index--;
        }
    }

    public int top() {
        return arrayList.get(index - 1);
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < index; i++) {
            if(arrayList.get(i) < min){
                min = arrayList.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}
