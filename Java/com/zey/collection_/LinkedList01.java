package com.zey.collection_;

/**
 * LinkedList01
 * 简单的双向链表
 */
public class LinkedList01 {

    public static void main(String[] args) {

        Node jake = new Node("jake");
        Node tom = new Node("tom");
        Node zey = new Node("zey");

        // 连接三个节点 形成双向链表
        jake.next = tom;
        tom.next = zey;

        zey.pre = tom;
        tom.pre = jake;

        // 让first 引用指向jake 形成双向链表的头节点
        Node first = jake;
        // 让last 引用指向zey 形成双向链表的尾节点
        Node last = zey;

        // 添加新的数据
        Node addNode = new Node("addNode");
        jake.next = addNode;
        tom.pre = addNode;
        addNode.next = tom;
        addNode.pre = jake;

        // 从头到尾遍历
        while (true) {
            if (first == null) {
                break;
            }
            // 输出first
            System.out.println(first);
            // 让first节点指向下一个节点
            first = first.next;
        }
    }
}

// 定义一个Node 类 表示双向链表的一个节点
class Node {
    // 存放真正的数据
    public Object item;
    // 指向下一个节点
    public Node next;
    // 指向上一个节点
    public Node pre;

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Node name = " + this.item;
    }

}