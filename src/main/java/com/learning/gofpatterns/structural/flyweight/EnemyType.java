package com.learning.gofpatterns.structural.flyweight;

public class EnemyType {

    // This is our Flyweight class

    private EnemyTypeName typeName;
    private String texture;

    public EnemyType(EnemyTypeName typeName, String texture) {
        this.typeName = typeName;
        this.texture = texture;
    }

    public EnemyTypeName getTypeName() {
        return typeName;
    }

    public String getTexture() {
        return texture;
    }

    public void draw(String name, float positionX, float positionY) {
        System.out.printf("Drawing enemy (%s) with (typeName=%s, texture=%s) on coordinates (X=%.2f, Y=%.2f)\n",
            name, this.typeName, this.texture, positionX, positionY);
    }

    @Override
    public String toString() {
        return "EnemyType{" +
                "typeName=" + typeName +
                ", texture='" + texture + '\'' +
                '}';
    }
}
