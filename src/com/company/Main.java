package com.company;

public class Main {

    public static void main(String[] args) {
        MyTree tree = new MyTree(new Node("one"));
        tree.printTree();
		System.out.println("++++++++");
        tree.addChild(new Node("two"));
        tree.addChild("two", new Node("three"));
        tree.addChild("one", new Node("four"));
        tree.addChild("four", new Node("five"));
        tree.addChild("two", new Node("six"));
        tree.printTree();
    }
}
