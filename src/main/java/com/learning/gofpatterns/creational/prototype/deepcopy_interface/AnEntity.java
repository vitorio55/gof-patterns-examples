package com.learning.gofpatterns.creational.prototype.deepcopy_interface;

public class AnEntity implements Prototype {
    int number;
    AnotherEntity anotherEntity;

    public AnEntity(int number, AnotherEntity anotherEntity) {
        this.number = number;
        this.anotherEntity = anotherEntity;
    }

    private AnEntity(AnEntity copyFrom) {
        this.number = copyFrom.number;
        this.anotherEntity = (AnotherEntity) copyFrom.anotherEntity.clone();
    }

    @Override
    public Prototype clone() {
        return new AnEntity(this);
    }

    public AnotherEntity getAnotherEntity() {
        return anotherEntity;
    }

    @Override
    public String toString() {
        return "AnEntity{" +
                "number=" + number +
                ", anotherEntity=" + anotherEntity +
                '}';
    }
}
