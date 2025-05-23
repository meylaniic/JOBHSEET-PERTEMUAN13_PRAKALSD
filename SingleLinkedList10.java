

public class SingleLinkedList10 {
    NodeMahasiswa10 head;
    NodeMahasiswa10 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa10 tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilinformasi();
                tmp = tmp.next;
            }
            System.out.println(" ");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(Mahasiswa10 input) {
        NodeMahasiswa10 ndInput = new NodeMahasiswa10(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa10 input) {
        NodeMahasiswa10 ndInput = new NodeMahasiswa10(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa10 input) {
        NodeMahasiswa10 ndInput = new NodeMahasiswa10(input, null);
        NodeMahasiswa10 temp = head;
        do { 
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa10 input) {
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa10 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa10(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
