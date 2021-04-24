package SteckDequeQueue;

public class OneLinkedStack
{
    OneLinkedListForStack newStack;

    OneLinkedStack()
    {
        newStack = new OneLinkedListForStack();
    }

    public void push(int newElement)
    {
        newStack.add(newElement);
    }

    public Object_int pop()
    {
        return newStack.delete();
    }

    public boolean isEmpty()
    {
        return newStack.isEmpty();
    }

    public void show()
    {
        newStack.show();
    }
}
