package newdimension.content;

import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;

public class DefenseBlocks implements ContentList{
    public static Block tungstenSteelWall,
    tungstenSteelWallLarge,
    ironWall,
    ironWallLarge,
    goldWall,
    goldWallLarge;

    @Override
    public void load(){
        tungstenSteelWall = new Wall("tungsten-steel-wall"){{
            requirements(Category.defense, ItemStack.with(NDItems.tungstenSteel, 20));
            health = 5000;
            size = 1;
        }};

        tungstenSteelWallLarge = new Wall("tungsten-steel-wall-large"){{
            requirements(Category.defense, ItemStack.with(NDItems.tungstenSteel, 60));
            health = 12000;
            size = 2;
        }};

        ironWall = new Wall("iron-wall"){{
            requirements(Category.defense, ItemStack.with(NDItems.iron, 10));
            health = 2000;
            size = 1;
        }};

        ironWallLarge = new Wall("iron-wall-large"){{
            requirements(Category.defense, ItemStack.with(NDItems.iron, 40));
            health = 6400;
            size = 2;
        }};

        goldWall = new Wall("gold-wall"){{
            requirements(Category.defense, ItemStack.with(NDItems.gold, 25));
            health = 2600;
            size = 1;
        }};

        goldWallLarge = new Wall("gold-wall-large"){{
            requirements(Category.defense, ItemStack.with(NDItems.gold, 60));
            health = 4900;
            size = 2;
        }};
    }
}