public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    //duyet tung phan tu
    public void traverse() {
        Node<T> tmp = head;
        while (tmp != null) {
            System.out.println(tmp.getData());
            tmp = tmp.getNext();
        }
    }

    //them vao dau danh sach
    public void addFirst(T l) {
        //b1
        Node<T> kk = new Node<>(l, this.head);
        //b2
        this.head = kk;
    }

    public void addLast(T l) {
        if (head == null) {
            addFirst(l);
        } else {
            Node<T> kk = new Node<>(l, null);
            Node<T> current;
            current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(kk);
        }
    }

    //them vao phia sau 1 node nao do
    public void insertAfter(T key, T toInsert) {
        //b2 : tim vi tri cua key
        Node<T> tmp = head;
        while (tmp != null && !tmp.getData().equals(key)) {
            tmp = tmp.getNext();
        }

        if (tmp != null) {
            Node<T> newNode = new Node<>();
            newNode.setData(toInsert);
            newNode.setNext(tmp.getNext());
            tmp.setNext(newNode);
        }
    }

    public boolean remove(T key) {
        if (head == null) {
            return false;
        }
        //xoa neu key o vi tri dau tien
        if (head.getData().equals(key)) {
            this.head = head.getNext();
        }

        //tao bien tam
        Node<T> prev = null;
        Node<T> cur = head;
        while (cur != null && !cur.getData().equals(key)) {
            prev = cur;
            cur = cur.getNext();
        }

        if (cur == null) {
            return false;
        }
        prev.setNext(cur.getNext());
        return true;

    }

}
