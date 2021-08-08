package com.learning.gofpatterns;

import com.learning.gofpatterns.creational.abstract_factory.AbstractFactoryExample;
import com.learning.gofpatterns.creational.builder.extra.bloch.JoshuaBlochBuilderExample;
import com.learning.gofpatterns.creational.builder.extra.treebuilder.TreeBuilderExample;
import com.learning.gofpatterns.creational.builder.first.FirstBuilderExample;
import com.learning.gofpatterns.creational.builder.second.SecondBuilderExample;
import com.learning.gofpatterns.creational.factory_method.FactoryMethodExample;
import com.learning.gofpatterns.creational.prototype.multilevelcopy.PrototypeMultilevelCopyExample;
import com.learning.gofpatterns.creational.prototype.using_abstractclass.PrototypeUsingAbstractClassExample;
import com.learning.gofpatterns.creational.prototype.using_interface.PrototypeUsingInterfaceExample;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Example> examples = List.of(
                // Creational Patterns
                // ---------------------------------------------------------------------------
                new FactoryMethodExample(),
                new AbstractFactoryExample(),

                // There are two GoF Builder Pattern examples here, they are slightly different
                new FirstBuilderExample(), // This builds a mutable Structure object
                new SecondBuilderExample(), // This builds an immutable House object

                // Extra builder example (which is not a GoF Pattern)
                new JoshuaBlochBuilderExample(),

                // Extra tree builder example (which is not a GoF Pattern)
                new TreeBuilderExample(),

                // Prototype patter examples
                new PrototypeUsingAbstractClassExample(),
                new PrototypeUsingInterfaceExample(),
                new PrototypeMultilevelCopyExample()
        );
        examples.forEach(Example::runExample);
    }
}
