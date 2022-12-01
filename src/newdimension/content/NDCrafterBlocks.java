package newdimension.content;

import mindustry.world.*;
import mindustry.world.blocks.production.*;
import mindustry.content.Items;
import mindustry.type.*;

public class NDCrafterBlocks implements ContentList{
    
    public static Block steelFactory,//钢厂
    electricCubeBaler,//电立方打包机
    superNuclearMachine,//超核机
    tungstenSteelSmelter;//钨钢冶炼厂

    @Override
    public void load(){
        steelFactory = new GenericCrafter("steel-factory"){{
            requirements(Category.crafting, ItemStack.with(NDItems.iron, 30));
            size = 2;
            health = 800;
            craftTime = 50f;
            hasItems = true;
            hasPower = true;
            itemCapacity = 20;
            consumeItem(NDItems.iron, 1);
            consumePower(2f);
            outputItem = new ItemStack(NDItems.steel, 1);
        }};

        electricCubeBaler = new GenericCrafter("electric-cube-baler"){{
            requirements(Category.crafting, ItemStack.with(NDItems.steel, 30));
            size = 2;
            health = 1000;
            craftTime = 80f;
            hasItems = true;
            hasPower = true;
            itemCapacity = 20;
            consumePower(6.5f);
            outputItem = new ItemStack(NDItems.electricCube, 2);
        }};

        superNuclearMachine = new GenericCrafter("super-nuclear-machine"){{
            requirements(Category.crafting, ItemStack.with(
                NDItems.steel, 20,
                NDItems.iron, 30
            ));
            size = 3;
            health = 1500;
            craftTime = 85f;
            hasItems = true;
            hasPower = true;
            itemCapacity = 20;
            consumeItems(
                new ItemStack(Items.surgeAlloy, 1),
                new ItemStack(Items.thorium, 2)
            );
            consumePower(7f);
            outputItem = new ItemStack(NDItems.hypernuclearCondensates, 2);
        }};

        tungstenSteelSmelter = new GenericCrafter("tungsten-steel-smelter"){{
            requirements(Category.crafting, ItemStack.with(
                NDItems.steel, 20,
                Items.silicon, 10
            ));
            size = 3;
            health = 1500;
            craftTime = 75f;
            hasItems = true;
            hasPower = true;
            itemCapacity = 20;
            consumeItems(
                new ItemStack(NDItems.steel, 1),
                new ItemStack(Items.tungsten, 1)
            );
            consumePower(6f);
            outputItem = new ItemStack(NDItems.tungstenSteel, 2);
        }};
    }
}