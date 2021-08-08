package com.learning.gofpatterns.creational.builder.extra.treebuilder;

import java.util.Objects;

public class TreeBuilder {
    private final Node el;
    private final TreeBuilder parent;

    // Recursive Tree Builder examples

    private TreeBuilder(Node el, TreeBuilder parent) {
        this.el = el;
        this.parent = parent;
    }

    static TreeBuilder init() {
        return new TreeBuilder(new Node(), null);
    }

    static TreeBuilder init(TreeBuilder parent) {
        return new TreeBuilder(new Node(), parent);
    }

    public TreeBuilder setName(String name) {
        this.el.setName(name);
        return this;
    }

    public TreeBuilder addChild() {
        TreeBuilder builder = TreeBuilder.init(this);
        this.el.getChildren().add(builder.el);
        return builder;
    }

    public TreeBuilder end() {
        if (el.getChildren().isEmpty()) {
            el.setChildren(null);
        }
        return Objects.requireNonNullElse(this.parent, this);
    }

    public Node build() {
        if (this.parent == null) {
            return this.el;
        } else {
            return this.parent.build();
        }
    }
}
