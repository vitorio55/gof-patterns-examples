package com.learning.gofpatterns.creational.builder.extra.treebuilder;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private List<Node> children;

    public Node() {
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public void printNode(int indentation) {
        StringBuilder spaces = new StringBuilder();

        for (int i=0; i < indentation; i++) {
            spaces.append("  | ");
        }

        System.out.println(spaces + this.name);

        if (children == null) return;

        children.forEach(node -> {
            node.printNode(indentation + 1);
        });
    }
}
