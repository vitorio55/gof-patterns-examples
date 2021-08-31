package com.learning.gofpatterns.structural.flyweight;

import com.learning.gofpatterns.BannerPrinter;
import com.learning.gofpatterns.Example;

import java.util.List;

import static com.learning.gofpatterns.structural.flyweight.EnemyTypeName.HUMAN;

public class FlyweightExample implements Example {

    @Override
    public void runExample() {
        BannerPrinter.printFlyweightBanner();

        System.out.println("==> Running Flyweight Example");

        System.out.println("""
            The Flyweight Pattern helps to improve memory usage in some cases. We can use this pattern for example
            when we have entities that have some heavy memory-consuming attributes that tend to not vary a lot.
            
            In this example we have enemies in a game. Each enemy has attributes that don't consume much memory
            (such as name, power and coordinates) and tend to be unique to each enemy instance. However, we also
            have a texture attribute can can consume a lot of memory if we store a copy for each unique enemy.

            Since textures are not unique to each enemy instance, we save a lot of memory if we store them in a cache.
            This way we simply retrieve shared textures and aggregate them to unique attributes when we must know the
            whole state of an enemy.
            """);

        String humanMaleTexture = "<SOME_LARGE_MALE_TEXTURE>";
        String humanFemaleTexture = "<SOME_LARGE_FEMALE_TEXTURE>";

        System.out.println("Here we have 2 textures that will be used by many different enemy instances: ");
        System.out.println("  " + humanMaleTexture);
        System.out.println("  " + humanFemaleTexture);
        System.out.println();

        System.out.println("""
            Now we will create our many enemies using reusable Flyweight objects (EnemyType), which are instantiated from
            our EnemyTypeFactory class.
            """);

        List<Enemy> enemies = List.of(
            new Enemy("James", EnemyTypeFactory.getEnemyType(HUMAN, humanMaleTexture),1.0f, 19f, 10),
            new Enemy("Carl", EnemyTypeFactory.getEnemyType(HUMAN, humanMaleTexture), -14.0f, 87f, 15),
            new Enemy("Steve", EnemyTypeFactory.getEnemyType(HUMAN, humanMaleTexture), -50f, 8f, 100),
            new Enemy("John", EnemyTypeFactory.getEnemyType(HUMAN, humanMaleTexture), -55f, 18f, 125),
            new Enemy("Juan", EnemyTypeFactory.getEnemyType(HUMAN, humanMaleTexture), -45f, -23f, 27),
            new Enemy("Mary", EnemyTypeFactory.getEnemyType(HUMAN, humanFemaleTexture), 10.0f, 190f, 1000),
            new Enemy("Agatha", EnemyTypeFactory.getEnemyType(HUMAN, humanFemaleTexture), 25.0f, -25f, 5),
            new Enemy("Marla", EnemyTypeFactory.getEnemyType(HUMAN, humanFemaleTexture), 0f, 100f, 25),
            new Enemy("Lola", EnemyTypeFactory.getEnemyType(HUMAN, humanFemaleTexture), 11f, -100f, 12),
            new Enemy("Christine", EnemyTypeFactory.getEnemyType(HUMAN, humanFemaleTexture), -29f, -18f, 18)
        );

        System.out.println("Enemies created:");
        enemies.forEach(enemy -> System.out.println(enemy.toString()));

        System.out.println("""
            \nWe can even add some logic to the Flyweight (in this case drawing of enemies) class. It is able to handle
            the execution of actions that require the full state because we pass the remaining needed info through
            parameters in the call.
            """);
        enemies.forEach(Enemy::draw);

        System.out.println("""
            \nFinally, we can verify that our Flyweight Factory (EnemyTypeFactory) has only 2 textures created, even
            though those textures are being used by many enemies. With this approach we could have hundreds of enemies,
            because we would still only need to have saved in our Factory the unique version of the textures.
            """);

        EnemyTypeFactory.printCachedEnemyTypes();
        System.out.println("");
    }
}
