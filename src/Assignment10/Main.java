package Assignment10;

public class Main
{
    public static void main(String[] args) {
        SList root = new SList(0);
        SList current = root;

        for(int i=2;i<10; i++)
        {
            current.next=new SList(i);
            current=current.next;
        }

        SList nextRoot = root.SListIterator(root);
        current=root;

        while (root.SListIterator(current)!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }
}
