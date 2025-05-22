public class Double_Linked_List {
    Node head;
    int size;

    public Double_Linked_List() {
        head = null;
        size = 0;
    }

    public void add_head(int key) {
        Node temp = new Node(key);

        if (head == null) {
            head = temp;
            temp.next = null;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }

        temp.prev = null;
        size += 1;
    }

    public void add_tail(int key) {
        Node tail = new Node(key);

        if (head == null) {
            head = tail;
            tail.prev = null;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = tail;
            tail.prev = temp;
        }

        tail.next = null;
        size += 1;
    }

    public boolean remove(int key) {
        Node current = head;

        while (current != null) {
            if (current.key == key) {
                break;
            }
            current = current.next;
        }

        if (current == null) {
            return false;
        } else if (current == head) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            current.prev.next = current.next;
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }

        current.prev = null;
        current.next = null;
        size -= 1;
        return true;
    }

    public void print_list() {
        Node current = head;
        while (current != null) {
            System.out.print(current.key + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int get_size() {
        return size;
    }

    public void insert_at_pos(int key, int pos) {
        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            add_head(key);
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        Node new_node = new Node(key);
        new_node.next = temp.next;
        new_node.prev = temp;

        if (temp.next != null) {
            temp.next.prev = new_node;
        }

        temp.next = new_node;
        size++;
    }

    public void delete_first() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        head = head.next;

        if (head != null) {
            head.prev = null;
        }

        temp.next = null;
        size--;
    }

    public void delete_last() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        if (temp.next == null) {
            head = null;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.prev.next = null;
            temp.prev = null;
        }

        size--;
    }

    public void delete_at_pos(int pos) {
        if (pos < 1 || pos > size) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            delete_first();
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }

        temp.next = null;
        temp.prev = null;

        size--;
    }

    public void update_data(int key, int pos) {
        if (pos < 1 || pos > size) {
            System.out.println("Invalid position");
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }

        temp.key = key;
    }

    public void reverse_list() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.key + " <-- ");
            temp = temp.prev;
        }

        System.out.println("null");
    }

}