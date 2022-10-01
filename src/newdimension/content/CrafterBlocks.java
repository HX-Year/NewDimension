package newdimension.content;

import mindustry.world.*;
import mindustry.world.blocks.production.*;
import mindustry.type.*;

public class CrafterBlocks implements ContentList{
    
    public static Block steelFactory,
    electricCubeFactory;

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
            consumes.item(NDItems.iron, 1);
            consumes.power(2f);
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
            consumes.power(6.5f);
            outputItem = new ItemStack(NDItems.electricCube, 2);
        }};
    }
}