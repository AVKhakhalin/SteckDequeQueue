package SteckDequeQueue;

public class OneLinkedQueue
{
    private OneLinkedListForQueue queue = new OneLinkedListForQueue();

    public boolean OneLinkedQueue()
    {
        return queue.isEmpty();
    }

    public boolean isEmpty()
    {
        return queue.isEmpty();
    }

    public void insert(int newNumber)
    {
        queue.insert(newNumber);
    }

    public Object_int pop()
    {
        return queue.pop();
    }

    public void show()
    {
        queue.show();
    }
}
