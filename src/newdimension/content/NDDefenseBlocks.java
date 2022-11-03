package newdimension.content;

import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import newdimension.world.blocks.*;

public class NDDefenseBlocks implements ContentList{

    public static Block tungstenSteelWall,
    tungstenSteelWallLarge,
    ironWall,
    ironWallLarge,
    goldWall,
    goldWallLarge,
    steelWall,
    steelWallLarge,
    aluminiumWall,
    aluminiumWallLarge;

    @Override
    public void load(){
        tungstenSteelWall = new Wall("tungsten-steel-wall"){{
            requirements(Category.defense, ItemStack.with(NDItems.tungstenSteel, 10));
            health = 1600;
            size = 1;
        }};

        tungstenSteelWallLarge = new Wall("tungsten-steel-wall-large"){{
            requirements(Category.defense, ItemStack.with(NDItems.tungstenSteel, 40));
            health = 4800;
            size = 2;
        }};

        ironWall = new Wall("iron-wall"){{
            requirements(Category.defense, ItemStack.with(NDItems.iron, 10));
            health = 960;
            size = 1;
        }};

        ironWallLarge = new Wall("iron-wall-large"){{
            requirements(Category.defense, ItemStack.with(NDItems.iron, 40));
            health = 2000;
            size = 2;
        }};

        goldWall = new Wall("gold-wall"){{
            requirements(Category.defense, ItemStack.with(NDItems.gold, 10));
            health = 1100;
            size = 1;
        }};

        goldWallLarge = new Wall("gold-wall-large"){{
            requirements(Category.defense, ItemStack.with(NDItems.gold, 40));
            health = 2800;
            size = 2;
        }};

        steelWall = new Wall("steel-wall"){{
            requirements(Category.defense, ItemStack.with(NDItems.steel, 10));
            health = 1200;
            size = 1;
        }};

        steelWallLarge = new Wall("steel-wall-large"){{
            requirements(Category.defense, ItemStack.with(NDItems.steel, 40));
            health = 3400;
            size = 2;
        }};

        aluminiumWall = new Wall("aluminium-wall"){{
            requirements(Category.defense, ItemStack.with(NDItems.aluminium, 10));
            health = 1000;
            size = 1;
        }};

        aluminiumWallLarge = new NDWall("aluminium-wall-large"){{
            requirements(Category.defense, ItemStack.with(NDItems.aluminium, 40));
            health = 2500;
            size = 2;
            sharingHealth = true;
        }};
    }
}