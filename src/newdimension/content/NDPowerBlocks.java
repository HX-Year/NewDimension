package newdimension.content;

import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.power.*;

import mindustry.content.*;

public class NDPowerBlocks implements ContentList{

    public static Block batteryStack,//电池堆
    batteryStackLarge;//大型电池堆

    @Override
    public void load(){
        batteryStack = new Battery("battery-stack"){{
            requirements(Category.power, ItemStack.with(
                NDItems.steel, 10,
                NDItems.tungstenSteel, 15,
                Items.silicon, 15
            ));
            size = 3;
            consumePowerBuffered(200000f);
            baseExplosiveness = 18f;
        }};

        batteryStackLarge = new Battery("battery-Stack-large"){{
            requirements(Category.power, ItemStack.with(
                NDItems.tungstenSteel, 30,
                NDItems.iterativeModule, 1,
                Items.silicon, 40
            ));
            size = 4;
            consumePowerBuffered(2400000f);
            baseExplosiveness = 50f;
        }};
    }
}