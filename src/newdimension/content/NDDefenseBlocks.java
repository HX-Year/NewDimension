package newdimension.content;

import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import newdimension.world.blocks.defense.NDWall;

public class NDDefenseBlocks implements ContentList{

    public static Block tungstenSteelWall,
    tungstenSteelWallLarge,
    nanoAlloyWall,//纳米合金墙
    nanoAlloyWallLarge;//大型纳米合金墙

    @Override
    public void load(){
        tungstenSteelWall = new Wall("tungsten-steel-wall"){{
            requirements(Category.defense, ItemStack.with(NDItems.tungstenSteel, 10));
            health = 1600;
            size = 1;
        }};

        tungstenSteelWallLarge = new Wall("tungsten-steel-wall-large"){{
            requirements(Category.defense, ItemStack.with(NDItems.tungstenSteel, 40));
            health = 3200;
            size = 2;
        }};

        nanoAlloyWall = new NDWall("nano-alloy-wall"){{
            requirements(Category.defense, ItemStack.with(NDItems.nanoAlloy, 10));
            health = 1350;
            size = 1;
            components.add(selfHealing);
        }};

        nanoAlloyWallLarge = new NDWall("nano-alloy-wall-large"){{
            requirements(Category.defense, ItemStack.with(NDItems.nanoAlloy, 40));
            health = 3000;
            size = 2;
            components.add(selfHealing);
        }};
    }
}