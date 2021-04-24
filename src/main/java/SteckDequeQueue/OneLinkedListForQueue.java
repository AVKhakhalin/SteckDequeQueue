package SteckDequeQueue;

public class OneLinkedListForQueue
{
    public Object_int startElement;
    public Object_int last;

    public OneLinkedListForQueue()
    {
        startElement = null;
        last = null;
    }

    public boolean isEmpty()
    {
        return (startElement == null);
    }

    public void insert(int newNumber)
    {
        Object_int newLink = new Object_int(newNumber);
        if (this.isEmpty())
        {
            startElement = newLink;
        }
        else
        {
            last.setLink(newLink);
        }
        last = newLink;
    }

    public Object_int pop()
    {
        Object_int temp = startElement;
        if (startElement.getLink() == null)
        {
            last = null;
        }
        startElement = startElement.getLink();
        return temp;
    }

    public void show()
    {
        Object_int showElement = startElement;
        System.out.print("Содержимое очереди: [");
        while(showElement != null)
        {
            System.out.print(showElement.getNumber_int());
            showElement = showElement.getLink();
            if (showElement != null)
            {
                System.out.print(", ");
            }
            else
            {
                System.out.println("]");
            }
        }
    }
}
