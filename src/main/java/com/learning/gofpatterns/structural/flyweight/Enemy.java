package com.learning.gofpatterns.structural.flyweight;

public class Enemy {
    private String name;
    private EnemyType type;
    private float positionX;
    private float positionY;
    private int power;

    public Enemy(String name, EnemyType type, float positionX, float positionY, int power) {
        this.name = name;
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                ", power=" + power +
                '}';
    }
}
