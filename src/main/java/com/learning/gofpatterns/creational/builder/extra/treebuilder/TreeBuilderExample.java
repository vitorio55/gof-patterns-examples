package com.learning.gofpatterns.creational.builder.extra.treebuilder;

import com.learning.gofpatterns.Example;

public class TreeBuilderExample implements Example {
    @Override
    public void runExample() {
        System.out.println("==> Running Tree Builder Example");

        // This is extra!
        // Not a GoF pattern, but still related to Builders.

        Node nodeTree = TreeBuilder.init()
                .setName("Parent Node")
                .addChild()
                    .setName("Child #1")
                    .addChild()
                        .setName("Child #1A")
                    .end()
                    .addChild()
                        .setName("Child #1B")
                    .end()
                .end()
                .addChild()
                    .setName("Child #2")
                .end()
                .build();

        System.out.println("Tree built.");
    }
}
