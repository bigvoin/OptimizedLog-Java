import java.util.*;

public class OptimizedLog<E> implements Collection<E>
{
    private Node<E> firstElement;
    private Node<E> lastElement;
    private int size;

    /**
     * Method that adds elements at the end of the previous one just like LinkedList
     * @param item element of any kind added at the end
     */
    public boolean add(E item)
    {
        if (item == null) { throw new NullPointerException("The firstElement argument is null."); }
        if (!isEmpty()) {
            Node<E> prev = lastElement;
            lastElement = new Node<E>(item, null);
                prev.setNext(lastElement);
                this.check(lastElement);
                size++;
                return true;
            
        }
                       
        else {
            lastElement = new Node<E>(item, null);
            firstElement = lastElement;
            size++;
            return true;
        }

        
    
    }
        /**
         * Method that checks for entries entered multiple times comparing the given
         * item to all the previous
         * @param node and item that needs to be checked
         */
        public void check(Node<E> node)
        {
            Node<E> current = firstElement;
            while(current.getNext() != null)
            {
                if(current.getData() == node.getData())
                node.incrementCounter();
                current = current.getNext();
                
            }
            
        }

        /**
         * Method that is returning
         * @return the first Element
         */
        public Node<E> getFirstElement()
        {
            return firstElement;
        }

        /**
         * Method that allowing for-each 
         * @return a DataIterator
         */
        @Override
        public Iterator<E> iterator() {
            return new DataIterator<>(this);
        }

        /**
         * method returning element
         * @return the last element of the list
         */
        public Node<E> getlastElementElement()
        {
            return lastElement;
        }

        /**
         * method that return value
         * @return the size of the list
         */
        public int size()
        {
            return size;
        }

        /**
         * Method that returns true of false
         * @return if the size of the list is 0
         */
        public boolean isEmpty()
        {
            return size == 0;
        }

        /**
         * Method which enable to convert an item into a String
         * @return the string of the current value
         */
        @Override
        public String toString() {
            String string1;
            String string2;
            String string3 = "";
        if(firstElement!=null)
        {
            Node<E> current = firstElement;
           
            while(current != null)
            {
                if(current.getCounter()>1)
                {
                    string2 = "[" + current.getDate() + " - "
                    +current.getDate() +"]" + "[" +
                    current.getCounter() + " Times]: "+ current.getData();
                    System.out.println(string2);
                    current = current.getNext();
                }
                else{
                string1 ="[" + current.getDate()+ "]: " + current.getData();
                System.out.println(string1);
                current = current.getNext();
                }
                         
            }
        }
        return string3;}
              
        /**
         * Method that is not used in this exercise
         */
        @Override
        public void clear() {
            throw new UnsupportedOperationException("Unable to clear");
            
        }

        /**
         * Method that is not used in this exercise
         */
        @Override
        public boolean retainAll(Collection<?> c) {
            throw new UnsupportedOperationException("Unable to retainAll");
        }

        /**
         * Method that is not used in this exercise
         */
        @Override
        public boolean remove(Object o) {
            throw new UnsupportedOperationException("Unable to remove");
        }

        /**
         * Method that is not used in this exercise
         */
        @Override
        public boolean removeAll(Collection<?> c) {
            throw new UnsupportedOperationException("Unable to remove all");
        }

        /**
         * Method that is not used in this exercise
         */
        @Override
        public boolean addAll(Collection<? extends E> c) {
            throw new UnsupportedOperationException("Unable to add all");
        }

        /**
         * Method that is not used in this exercise
         */
        @Override
        public boolean containsAll(Collection<?> c) {
            throw new UnsupportedOperationException("Unable to contains All");
        }

        /**
         * Method that is not used in this exercise
         */
        @Override
        public <T> T[] toArray(T[] a) {
            throw new UnsupportedOperationException("Unable to use toArray");
        }

        /**
         * Method that is not used in this exercise
         */
        @Override
        public Object[] toArray() {
            throw new UnsupportedOperationException("Unable to use toArray");
        }

        /**
         * Method that is not used in this exercise
         */
        @Override
        public boolean contains(Object o) {
            throw new UnsupportedOperationException("Unable to contains");
        }
}