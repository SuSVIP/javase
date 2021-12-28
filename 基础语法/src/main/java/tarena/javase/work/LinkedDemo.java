package tarena.javase.work;
//展示链表数据结构
public class LinkedDemo {
    public static void main(String[] args){
        Node head=new Node("黑桃10");
        head.next=new Node("黑桃J");
        head.next.next=new Node("黑桃Q");
        head.next.next.next=new Node("黑桃K");
        System.out.println(head);
    }
    static class Node{
        //链表中节点
        Object value;
        Node next;
        public Node(Object obj){
            value=obj;
        }
        public String toString(){
            return next==null?value.toString():value+","+next;
        }
    }
}
