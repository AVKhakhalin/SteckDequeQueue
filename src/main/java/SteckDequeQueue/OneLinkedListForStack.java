package SteckDequeQueue;

public class OneLinkedListForStack
{
    Object_int startElement;

    public OneLinkedListForStack()
    {
        startElement = null;
    }

    public void add(int newElement)
    {
        Object_int curElement = new Object_int(newElement);
        curElement.setLink(startElement);
        startElement = curElement;
    }

    public void show()
    {
        Object_int showElement = startElement;
        System.out.print("Содержимое стека: [");
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

    public boolean isEmpty()
    {
        return (startElement == null);
    }

    public Object_int delete()
    {
        if (startElement != null)
        {
            Object_int showElement = startElement;
            startElement = startElement.getLink();
            return showElement;
        }
        else
        {
            return null;
        }
    }
}
