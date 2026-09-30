import java.util.Stack;

public class queue_using_two_stacks {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public queue_using_two_stacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Thêm phần tử vào queue
    public void enqueue(int value) {
        stack1.push(value);
    }

    // Lấy phần tử đầu queue
    public int dequeue() {

        // Nếu stack2 rỗng,
        // chuyển tất cả từ stack1 sang stack2
        if (stack2.isEmpty()) {

            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // Nếu cả hai stack đều rỗng
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return stack2.pop();
    }

    // In phần tử đầu queue
    public int peek() {

        if (stack2.isEmpty()) {

            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return stack2.peek();
    }

    // In queue
    public void print() {

        // Đảm bảo stack2 chứa phần tử theo thứ tự Queue
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        System.out.println(stack2);
    }

    public static void main(String[] args) {

        queue_using_two_stacks queue = new queue_using_two_stacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.print();

        System.out.println("Dequeue: " + queue.dequeue());

        queue.print();

        System.out.println("Dequeue: " + queue.dequeue());

        queue.print();

        queue.enqueue(40);

        queue.print();
    }
}