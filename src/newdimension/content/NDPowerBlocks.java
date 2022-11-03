package newdimension.content;

import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.power.*;

import mindustry.content.*;

public class NDPowerBlocks implements ContentList{

    public static Block batteryStack,//电池堆
    batteryStackLarge,//大型电池堆
    powerHealNode;//电力恢复节点

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

        batteryStackLarge = new Battery("battery-stack-large"){{
            requirements(Category.power, ItemStack.with(
                NDItems.tungstenSteel, 30,
                NDItems.iterativeModule, 1,
                Items.silicon, 40
            ));
            size = 4;
            consumePowerBuffered(2400000f);
            baseExplosiveness = 50f;
        }};
        //待实现电量恢复
        /*powerHealNode = new PowerNode("power-heal-node"){{
            requirements(Category.power, ItemStack.with(
                Items.silicon, 10,
                NDItems.steel, 20
            ));
            laserRange = 6f;
            maxNodes = 10;
        }};*/
    }
}