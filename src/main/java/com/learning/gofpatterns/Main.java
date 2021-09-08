package com.learning.gofpatterns;

import com.learning.gofpatterns.behavioral.chain_of_responsibility.basic.ChainOfResponsibilityBasicExample;
import com.learning.gofpatterns.behavioral.chain_of_responsibility.functional_interface.ChainOfResponsibilityFunctionalInterfaceExample;
import com.learning.gofpatterns.behavioral.command.CommandExample;
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
import com.learning.gofpatterns.structural.facade.FacadeExample;
import com.learning.gofpatterns.structural.flyweight.FlyweightExample;
import com.learning.gofpatterns.structural.proxy.ProxyExample;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Example> examples = List.of(
                // Creational Patterns
                // ---------------------------------------------------------------------------
                new FactoryMethodExample(),
                new AbstractFactoryExample(),
                // Builder examples
                new FirstBuilderExample(),
                new SecondBuilderExample(),
                // Extra builder examples (non GoF Pattern)
                new JoshuaBlochBuilderExample(),
                new TreeBuilderExample(),
                // Prototype examples
                new PrototypeCustomInterfaceExample(),
                new PrototypeDeepCopyAbstractClassExample(),
                new PrototypeDeepCopyInterfaceExample(),
                // Singleton example
                new SingletonExample(),

                // Structural Patterns
                // ---------------------------------------------------------------------------
                // Adapter examples
                new AdapterInheritanceExample(),
                new AdapterInheritanceAndInterfaceExample(),
                new AdapterInterfaceExample(),
                // Bridge examples
                new BridgeFunctionalInterfaceExample(),
                new BridgeInterfaceExample(),
                // Composite example
                new CompositeExample(),
                // Decorator example
                new DecoratorExample(),
                // Facade example
                new FacadeExample(),
                // Flyweight example
                new FlyweightExample(),
                // Proxy example
                new ProxyExample(),

                // Behavioral Patterns
                // ---------------------------------------------------------------------------
                new ChainOfResponsibilityFunctionalInterfaceExample(),
                new ChainOfResponsibilityBasicExample(),

                new CommandExample()
        );
        examples.forEach(Example::runExample);
    }
}
