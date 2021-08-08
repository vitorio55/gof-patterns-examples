package com.learning.gofpatterns.creational.prototype.multilevelcopy;

public class ConcretePrototype implements Prototype {
    AnEntity entity;

    public ConcretePrototype() {
    }

    private ConcretePrototype(ConcretePrototype copyFrom) {
        this.entity = (AnEntity) copyFrom.entity.clone();
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this);
    }

    public void setEntity(AnEntity entity) {
        this.entity = entity;
    }

    public AnEntity getEntity() {
        return entity;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "entity=" + entity +
                '}';
    }
}
