package newdimension.content;

import mindustry.world.*;
import mindustry.world.blocks.production.*;
import mindustry.content.Items;
import mindustry.type.*;

public class NDCrafterBlocks implements ContentList{
    
    public static Block steelFactory,
    electricCubeFactory,
    hypernuclearCondensatesFactory;

    @Override
    public void load(){
        steelFactory = new GenericCrafter("steel-factory"){{
            requirements(Category.crafting, ItemStack.with(NDItems.iron, 30));
            size = 2;
            health = 1200;
            craftTime = 60f;
            hasItems = true;
            hasPower = true;
            itemCapacity = 20;
            consumeItem(NDItems.iron, 1);
            consumePower(2f);
            outputItem = new ItemStack(NDItems.steel, 1);
        }};

        electricCubeFactory = new GenericCrafter("electric-cube-factory"){{
            requirements(Category.crafting, ItemStack.with(NDItems.steel, 30));
            size = 2;
            health = 1600;
            craftTime = 120f;
            hasItems = true;
            hasPower = true;
            itemCapacity = 20;
            consumePower(6.5f);
            outputItem = new ItemStack(NDItems.electricCube, 2);
        }};

        hypernuclearCondensatesFactory = new GenericCrafter("hypernuclear-condensates-factory"){{
            requirements(Category.crafting, ItemStack.with(NDItems.steel, 20, NDItems.iron, 30));
            size = 3;
            health = 2000;
            craftTime = 120f;
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
    }
}