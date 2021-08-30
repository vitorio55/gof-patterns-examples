package com.learning.gofpatterns.structural.flyweight;

public class EnemyType {
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

    @Override
    public String toString() {
        return "EnemyType{" +
                "typeName=" + typeName +
                ", texture='" + texture + '\'' +
                '}';
    }
}
