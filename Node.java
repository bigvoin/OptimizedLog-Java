import java.util.*;

public class Node<E>
{
    private E data;
    private Node<E> next;
    private Date date;
    private int counter = 1;
    
    /**
     * Constructor of the class Node, creating a single node with data and pointer to next element
     * @param data the data, that is stored in this node
     * @param next a pointer to the next node in the list
     */
    public Node(E data , Node<E> next)
    {
        this.data = data;
        this.next = next;
        date = Calendar.getInstance().getTime();
    }

    /**
     * Get method for Counter
     * @return counter
     */
    public int getCounter()
    {
        return counter;
    }

    /**
     * set Method for date
     * @param d set the param with the date of the node
     */
    public void setDate(Date d)
    {
        date = d;
    }

    /**
     * set method for the counter, incrementing it by 1
     */
    public void incrementCounter()
    {
        counter +=1;
    }
    

    /**
     * get method for data
     * @return the data
     */
    public E getData()
    {
        return data;
    }

    /**
     * set method for data
     * @param data set it with the daa of the node
     */
    public void setData(E data)
    {
        this.data = data;
    }

    /**
     * A get method for the next node
     * @return the next node in the list
     */
    public Node<E> getNext()
    {
        return next;
    }

    /**
     * A set method for the next node
     * @param next set the param with the next node
     */
    public void setNext(Node<E> next)
    {
        this.next = next;
    }

    /**
     * a get Method for Date
     * @return the date of the node
     */
    public Date getDate()
    {
        return date;
    }
}