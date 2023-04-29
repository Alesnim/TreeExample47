package com.company;

public class Main {

    public static void main(String[] args) {
    /*    MyTree tree = new MyTree(new Node("one"));
        tree.printTree();
		System.out.println("+++++++++++++++++++++++++");
        tree.addChild(new Node("two"));
        tree.addChild("two", new Node("three"));
        tree.addChild("one", new Node("four"));
        tree.addChild("four", new Node("five"));
        tree.addChild("two", new Node("six"));
        tree.printTree();*/

        /*TreeSet set = new TreeSet<String>();
        set.add("one");
        set.add("two");
        System.out.println(set);

        TreeMap treeMap = new TreeMap<Integer, String>();
        treeMap.put(1, "Один");*/


        BinaryTree treeBinary = BinaryTree.createRandomIntegerTree(10);
        System.out.println(treeBinary.depthFirstSearch(4));
        BinaryTree.drawTree(treeBinary);

    }
}
