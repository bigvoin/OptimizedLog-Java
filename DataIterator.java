import java.util.*;

public class DataIterator<E> implements Iterator<E>
{
    private Node<E> element;

    /**
     * Constructor for the class DataIterator which set the current node with the first element of the given OptimizedLog
     * @param log an instance of OptimizedLog class
     */
    public DataIterator(OptimizedLog<E> log)
    {
        element = log.getFirstElement();
    }

    /**
     * Method tha returns true if the node is not null
     */
    @Override
    public boolean hasNext() {
        return (element != null);
    }

    /**
     * returns the value of the next node
     */
    @Override
    public E next() {
        E output = element.getData();
        element = element.getNext();

        return output;
    }
}