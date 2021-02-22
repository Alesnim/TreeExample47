package com.company;

public class MyTree {
    Node root;

    public MyTree(Node root) {
        this.root = root;
    }

    public void addChild(Node n) {
        root.addChild(n);
    }

    public void addChild(String name, Node n) {

        if (name == root.getData()) {
            root.addChild(n);
        }
        else {
            root.getChildren().forEach(i -> {

                if (((Node) i).getData() == name) {
                    ((Node) i).addChild(n);
                }
                ;

            });
        }
    }

    public String getChildrens(Node n) {
        return n.getChildren().toString();
    }

    public void rebaseNode(Node parent, Node n) {
        parent.addChildren(n.getChildren());
    }


    public void printTree(){
            root.printTree(root, "\t");
    }

}
