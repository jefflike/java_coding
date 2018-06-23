package com.jeff_code;
/*
* 实现一个简单的单向链表，链表的主要连接方式是节点，每个节点都记录数据与后一个节点的信息，完成简单的增删改查功能。
* */

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class MyLink{
    private Node head;

    public void add(Object o){
        if(head == null){
            // 存入的时候不知道下一个是谁
            head = new Node(o, null);
        }else {
            Node node = new Node(o, null);


            // 找到当前链表的倒数第二个node将next指向自己
            Node last = head;
            while (last.next != null ){
                last = last.next;// 迭代的方式
            }
            last.next = node;
        }
    }

    public int size(){
        if(head == null){
            return 0;
        }else {
            Node last = head;
//            int count = 0;
            int count = 0;// head是1
            while (last.next != null ){
                last = last.next;
                count++;
            }
            return count;
        }
    }

    public Object[] all(){
        if(head == null){
            return null;
        }
        Object[] arr = new Object[size()];
        Node last = head;
        for(int i=0; i<arr.length; i++){
            arr[i] = last.data;// arr要得到的是data，不需要next的细节等，所以不需要存Node类型
            last = last.next;
        }
        return arr;
    }

    public void remove(Object target){
        if(head == null){
            return ;
        }
        //(1)先找到它
        if(head.data.equals(target)){//正好是第一个
            head = head.next;
        }else{
            Node pre = head;//第二个节点的前一个就是head
            Node node = pre.next;//第二个
            while(true){
                if(node==null){//当前节点是否存在
                    break;
                }
                //当前节点是否是要被删除的结点，如果是，删除node
                if(node.data.equals(target)){//node就是要删除的结点
                    //(2)把它前面的结点的next指向它的下一个结点
                    pre.next = node.next;
                    node = null;//被删除结点应该变成null  被删除快速变成垃圾
                    break;
                }
                //当前节点不是要被删除的结点，继续找
                pre = node;//当前节点的前一个就变成了当前节点
                node = node.next;//我的下一个称为当前节点
            }
        }

    }

}

class Node{
    Object data;
    Node next;
    Node(Object data, Node next){
        this.data = data;
        this.next = next;
    };
}


