package newdimension.content;

import mindustry.world.*;
import mindustry.world.blocks.storage.*;
import mindustry.type.*;
import mindustry.content.*;

public class NDCoreBlocks implements ContentList{
    public static Block NDcore;

    @Override
    public void load(){
        NDcore = new CoreBlock("ND-core"){{
            requirements(Category.effect, buildVisibility.editorOnly, ItemStack.with(
                NDItems.steel, 1000,
                NDItems.aluminium, 200
            ));
            alwaysUnlocked = true;
            isFirstTier = true;
            unitType = UnitTypes.alpha;
            health = 2000;
            itemCapacity = 10000;
            size = 3;
            unitCapModifier = 12;
        }};
    }
}