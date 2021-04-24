package SteckDequeQueue;

public class Object_int
{
    int number_int;
    Object_int link;

    public Object_int(int _number_int)
    {
        this.number_int = _number_int;
    }

    public int getNumber_int()
    {
        return number_int;
    }

    public Object_int getLink()
    {
        return link;
    }

    public void setLink(Object_int link)
    {
        this.link = link;
    }

    public void display()
    {
        System.out.println(number_int);
    }
}
