package com.learning.gofpatterns;

import com.learning.gofpatterns.behavioral.chain_of_responsibility.basic.ChainOfResponsibilityBasicExample;
import com.learning.gofpatterns.behavioral.chain_of_responsibility.functional_interface.ChainOfResponsibilityFunctionalInterfaceExample;
import com.learning.gofpatterns.behavioral.command.CommandExample;
import com.learning.gofpatterns.behavioral.interator.IteratorExample;
import com.learning.gofpatterns.behavioral.mediator.MediatorExample;
import com.learning.gofpatterns.behavioral.memento.MementoExample;
import com.learning.gofpatterns.behavioral.observer.ObserverExample;
import com.learning.gofpatterns.behavioral.state.StateExample;
import com.learning.gofpatterns.behavioral.strategy.StrategyExample;
import com.learning.gofpatterns.behavioral.template_method.TemplateMethodExample;
import com.learning.gofpatterns.behavioral.visitor.VisitorExample;
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

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Example> examples = new ArrayList<>();

        addCreationalPatternsExamples(examples);
        addStructuralPatternsExamples(examples);
        addBehavioralPatternsExamples(examples);

        examples.forEach(Example::runExample);
    }

    private static void addCreationalPatternsExamples(List<Example> examples) {
        addBuilderExamples(examples);
        addBuilderExtraExamples(examples);
        addPrototypeExamples(examples);

        examples.addAll(List.of(
            new FactoryMethodExample(),
            new AbstractFactoryExample(),
            new SingletonExample()
        ));
    }

    private static void addStructuralPatternsExamples(List<Example> examples) {
        addAdapterExamples(examples);
        addBridgeExamples(examples);

        examples.addAll(List.of(
            new CompositeExample(),
            new DecoratorExample(),
            new FacadeExample(),
            new FlyweightExample(),
            new ProxyExample()
        ));
    }

    private static void addBehavioralPatternsExamples(List<Example> examples) {
        addChainOfResponsibilityExamples(examples);

        examples.addAll(List.of(
            new CommandExample(),
            new IteratorExample(),
            new MediatorExample(),
            new MementoExample(),
            new ObserverExample(),
            new StateExample(),
            new StrategyExample(),
            new TemplateMethodExample(),
            new VisitorExample()
        ));
    }

    // -------------- Patterns with multiple examples --------------

    private static void addBuilderExamples(List<Example> examples) {
        examples.addAll(List.of(
            new FirstBuilderExample(),
            new SecondBuilderExample()
        ));
    }

    private static void addBuilderExtraExamples(List<Example> examples) {
        // Non-GoF Patterns
        examples.addAll(List.of(
            new JoshuaBlochBuilderExample(),
            new TreeBuilderExample()
        ));
    }

    private static void addPrototypeExamples(List<Example> examples) {
        examples.addAll(List.of(
            new PrototypeCustomInterfaceExample(),
            new PrototypeDeepCopyAbstractClassExample(),
            new PrototypeDeepCopyInterfaceExample()
        ));
    }

    private static void addAdapterExamples(List<Example> examples) {
        examples.addAll(List.of(
            new AdapterInheritanceExample(),
            new AdapterInheritanceAndInterfaceExample(),
            new AdapterInterfaceExample()
        ));
    }

    private static void addBridgeExamples(List<Example> examples) {
        examples.addAll(List.of(
            new BridgeFunctionalInterfaceExample(),
            new BridgeInterfaceExample()
        ));
    }

    private static void addChainOfResponsibilityExamples(List<Example> examples) {
        examples.addAll(List.of(
            new ChainOfResponsibilityFunctionalInterfaceExample(),
            new ChainOfResponsibilityBasicExample()
        ));
    }
}
