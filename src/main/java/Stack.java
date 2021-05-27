import java.util.EmptyStackException;

public class Stack<E>
{
    private int size;
    private Node<E> root;

    static class Node<E>
    {
        E data;
        Node<E> next;
        public Node(E data) { this.data = data; }
    }

    /**
     * Stack implementation with linked-list.
     */
    public Stack() 
    {
        this.size = 0;
        this.root = null;
    }

    /**
     * Inserts an element to the top of the stack.
     * @param e The element to be pushed to the stack.
     */
    public void push(E e)
    {
        Node<E> newNode = new Node<>(e);
        if (root == null)
        {
            root = newNode;
            size++;
        }
        else 
        {
            Node<E> tmp = root;
            root = newNode;
            newNode.next = tmp;
            size++;
        }
    }

    /**
     * 
     * @return The element at the top of the stack.
     */
    public E pop()
    {
        if (root == null)
            throw new EmptyStackException();
        Node<E> toPop = root;
        root = toPop.next;
        size--;
        return toPop.data;
    }

    /**
     * 
     * @return The element at the top of the stack. 
     */
    public E peek()
    {
        if ( root == null)
            throw new EmptyStackException();
        return root.data;
    }

    /**
     * 
     * @return True if the stack is empty. Else false.
     */
    public boolean isEmpty()
    {
        return root == null;
    }

    /**
     * 
     * @param e The element to look for.
     * @return True if the element is in the stack. Else false.
     */
    public boolean contains(E e)
    {
        Node<E> current = root;
        while(current != null)
        {
            if (current.data == e) 
                return true;
            current = current.next;
        }
        return false;
    }

    /**
     * 
     * @return The size of the stack.
     */
    public int size()
    {
        return size;
    }

    /**
     * 
     * @param e The element to look for.
     * @return The distance to the element in the stack. -1 if the element is not in the stack.
     */
    public int search(E e)
    {
        int distance = 1;
        Node<E> current = root;
        while(current != null)
        {
            if (current.data == e) 
                return distance;
            current = current.next;
            distance++;
        }
        return -1;
    }
}
