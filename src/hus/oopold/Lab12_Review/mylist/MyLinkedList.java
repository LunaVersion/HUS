package hus.oopold.Lab12_Review.mylist;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        /* TODO */
    }

    /**
     * Lấy kích thước của list.
     * @return
     */
    @Override
    public int size() {
        /* TODO */
        return size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        /* TODO */
        int num = 0;
        while(head.getNext() != null && num <= index){
            head = head.getNext();
            num++;
        }
        return head.getPayload();
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        int num = 0;
        while (head.getNext() != null){
            head = head.getNext();
            num++;
            if(num == index - 1){
                head.setNext(head.getNext().getNext());
            }
        }
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     * @param payload
     */
    @Override
    public void append(Object payload) {
        /* TODO */
        while (head.getNext() != null){
            head = head.getNext();
            if(head.getNext() == null){
                size ++;
                head.setNext((MyLinkedListNode) payload);
            }
        }
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        /* TODO */
        int num = 0;
        while(head.getNext() != null){
            num ++;
            head = head.getNext();
            if(num == index - 1){
                size++;
                head.setNext((MyLinkedListNode) payload);
                ((MyLinkedListNode) payload).setNext(head.getNext().getNext());
            }
        }
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     * @return
     */
    @Override
    public MyIterator iterator() {
        /* TODO */
        return new MyLinkedListIterator(head);
    }

    /**
     * Lấy node ở vị trí index.
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        /* TODO */
        int num = 0;
        while(head.getNext() != null && num <= index){
            head = head.getNext();
            num++;
        }
        return head;
    }
}
