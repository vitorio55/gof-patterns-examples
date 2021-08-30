package com.learning.gofpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class EnemyTypeFactory {
    static List<EnemyType> cachedEnemyTypes = new ArrayList<>();

    public static EnemyType getEnemyType(EnemyTypeName typeName, String texture) {
        EnemyType desiredEnemyType = cachedEnemyTypes.stream()
            .filter(enemyType -> enemyType.getTypeName().equals(typeName)
                                 && enemyType.getTexture().equals(texture))
            .findAny()
            .orElse(null);

        if (desiredEnemyType != null) {
            return desiredEnemyType;
        }

        EnemyType newType = new EnemyType(typeName, texture);
        cachedEnemyTypes.add(newType);

        return newType;
    }

    public static void printCachedEnemyTypes() {
        cachedEnemyTypes.forEach(type -> System.out.println(type.toString()));
    }
}
