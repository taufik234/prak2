public class Kegiatan2 {
    public class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public class LinkedList {
        Node head;

        void add(int data) {
            Node newNode = new Node(data);

            // Jika LinkedList kosong atau data yang ditambahkan lebih kecil dari head,
            // maka node baru akan menjadi head
            if (head == null || data < head.data) {
                newNode.next = head;
                head = newNode;
                return;
            }

            // Jika data yang ditambahkan lebih besar dari head, maka cari posisi yang tepat
            // untuk node baru

            Node current = head;
            while (current.next != null && current.next.data < data) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }

        void delete(int data) {
            Node current = head;
            Node prev = null;

            // Jika data yang akan dihapus adalah head
            if (current != null && current.data == data) {
                head = current.next;
                return;
            }

            while (current != null && current.data != data) {
                prev = current;
                current = current.next;
            }

            if (current == null) {
                return;
            }

            prev.next = current.next;
        }

        void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Kegiatan2 kegiatan2 = new Kegiatan2();
        LinkedList linkedList = kegiatan2.new LinkedList();
        linkedList.add(8);
        linkedList.add(7);
        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(6);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.printList();
        // data belum di urutkan
        // 8 7 1 4 6 2 3
        // data sudah di urutkan
        // 1 2 3 4 6 7 8
        // hapus 4
        linkedList.delete(4);
        // sesudah dihapus
        linkedList.printList();
    }

}
