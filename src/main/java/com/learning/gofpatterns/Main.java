package com.learning.gofpatterns;

import com.learning.gofpatterns.creational.abstract_factory.AbstractFactoryExample;
import com.learning.gofpatterns.creational.builder.extra.bloch.JoshuaBlochBuilderExample;
import com.learning.gofpatterns.creational.builder.extra.treebuilder.TreeBuilderExample;
import com.learning.gofpatterns.creational.builder.first.FirstBuilderExample;
import com.learning.gofpatterns.creational.builder.second.SecondBuilderExample;
import com.learning.gofpatterns.creational.factory_method.FactoryMethodExample;
import com.learning.gofpatterns.creational.prototype.deepcopy_interface.PrototypeDeepCopyInterfaceExample;
import com.learning.gofpatterns.creational.prototype.deepcopy_abstractclass.PrototypeDeepCopyAbstractClassExample;
import com.learning.gofpatterns.creational.prototype.custom_interface.PrototypeCustomInterfaceExample;
import com.learning.gofpatterns.creational.singleton.SingletonExample;
import com.learning.gofpatterns.structural.adapter.using_inheritance.AdapterInheritanceExample;
import com.learning.gofpatterns.structural.adapter.using_inheritance_and_interface.AdapterInheritanceAndInterfaceExample;
import com.learning.gofpatterns.structural.adapter.using_interface.AdapterInterfaceExample;
import com.learning.gofpatterns.structural.bridge.using_functional_interface.BridgeFunctionalInterfaceExample;
import com.learning.gofpatterns.structural.bridge.using_interface.BridgeInterfaceExample;
import com.learning.gofpatterns.structural.composite.CompositeExample;
import com.learning.gofpatterns.structural.decorator.DecoratorExample;

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
                new PrototypeCustomInterfaceExample(),
                new PrototypeDeepCopyAbstractClassExample(),
                new PrototypeDeepCopyInterfaceExample(),

                new SingletonExample(),

                // Structural Patterns
                // ---------------------------------------------------------------------------
                new AdapterInheritanceExample(),
                new AdapterInheritanceAndInterfaceExample(),
                new AdapterInterfaceExample(),

                new BridgeFunctionalInterfaceExample(),
                new BridgeInterfaceExample(),

                new CompositeExample(),

                new DecoratorExample()
        );
        examples.forEach(Example::runExample);
    }
}
