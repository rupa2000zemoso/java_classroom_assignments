package Assignment10;

public class SList
{
    int data;
    SList next;
    SList(int data)
    {
        this.data=data;
    }

    SList prev;
    public SList SListIterator(SList prev)
    {
        if(prev==null)
            return null;
        return prev.next;
    }
}
