import java.nio.file.NotDirectoryException;

public class LinkedListTest {
    // 头节点
    Node header = null;

    // 向链表中添加元素的方法；
    public void add(Object obj){
        if (header == null) {
            // 说明还没有节点
            header = new Node(obj, null);
        } else {
            // 说明头节点不是空节点 不是空 头节点已经有了
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(obj, null);

        }
    }

    /**
     * 专门查找末尾节点的方法
     * @return Node
     */
    private Node findLast(Node node) {
        if (node.next == null) {
            return node;
        } else {
            return findLast(node.next);
        }
    }

    // 向链表中删除某个元素的方法：
    public void remove(Object obj){

    }
    // 修改链表中某个元素的方法
    public void modify(Object obj){

    }

    // 查找链表中某个元素的方法
    public int find(Object obj){
        return 1;
    }


    public static void main(String[] args) {

        // Ten numbers insert into Linkedlist 1~10
        // This method insert numbers from the last node to the first node
/*        Node node0 = new Node(0);
        for (int i = 1; i < 10; i++) {
            Node node1 = new Node(i, node0);
            node0 = node1;
        }
        printNode(node0);*/

/*        Node node0 = new Node(0);
        for (int i = 1; i < 10; i++) {
            Node node1 = new Node(i, );


        }*/



    }

    public static void printNode(Node node){
        while (node != null) {
            System.out.println(node.getData() + " ");
            node = node.getNext();
        }
    }
}

class Node {
     Object obj;
     Node next;

    public Node() {
    }

    public Node(Object obj) {
        this.obj = obj;
        this.next = null;
    }

    public Node(Object obj, Node next) {
        this.obj = obj;
        this.next = next;
    }

    public Object getData() {
        return obj;
    }

    public Node getNext() {
        return next;
    }
}