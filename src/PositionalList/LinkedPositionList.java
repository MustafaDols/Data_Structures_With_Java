package PositionalList;

public class LinkedPositionList <E> implements PositionalList<E>{
    private int size;
    private static class Node<E> implements Position<E>{
        private E element;
        private Node<E> prev;
        private Node<E> next;
        public Node(E element , Node<E> prev , Node<E> next){
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public E getElement() throws IllegalStateException{
            if(next==null)
                throw new IllegalArgumentException(" Position no longer valid ");
            return element;
        }
        public Node<E> getPrev(){
            return prev;
        }
        public Node<E> getNext(){
            return next;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

    }

    private Node<E> header;
    private Node<E> trailer;
    public LinkedPositionList(){
        header = new Node<>(null,null,null);
        trailer = new Node<>(null,header,null);
        header.next=trailer;
    }

    private Node<E> validate(Position<E> p) {
        if (!(p instanceof Node))
            throw new IllegalArgumentException(" Invalid p ");
        Node<E> node = (Node<E>) p;
        if (node.getNext() == null)
            throw new IllegalArgumentException(" p is no longer in the list ");
        return node;
    }
    public Node<E> position(Node<E> node){
        if(node==header || node==trailer)
            return null;
        return node;
    }

    public int size(){
        return size();
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public Position<E> first(){
        return  position(header.getNext());
    }


    public Position<E> last() {
        return position(trailer.getPrev());
    }

    public Position<E> before(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return position(node.getPrev());
    }


    public Position<E> after(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return position(node.getNext());
    }

    private Position<E> addBetween(E element , Node<E> pred , Node<E> succ){
        Node<E> newest = new Node<>(element , pred, succ);

        pred.setNext(newest);
        succ.setPrev(newest);
        size++;
        return newest;
    }

    public Position<E> addFirst(E e){
        return addBetween(e ,header , header.getNext());
    }

    public Position<E> addLast(E e){
        return addBetween(e ,trailer.getPrev() , trailer);
    }

    public Position<E> addBefore(Position<E> p ,E e) throws IllegalArgumentException{
        Node<E> node = validate(p);
        return addBetween(e ,node.getPrev() , node);
    }

    public Position<E> addAfter(Position<E> p ,E e) throws IllegalArgumentException{
        Node<E> node = validate(p);
        return addBetween(e ,node , node.getNext());
    }

    public E set(Position<E> p ,E element) throws IllegalArgumentException{
        Node<E> node =validate(p);
        E answer = node.getElement();
        node.setElement(element);
        return answer;
    }
    public E remove(Position<E> p) throws IllegalArgumentException{
        Node<E> node = validate(p);
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        E answer = node.getElement();
        node.setElement(null);
        node.setNext(null);
        node.setPrev(null);
        return answer;

    }


}

