package newdimension.content;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.power.Battery;
import mindustry.world.blocks.power.PowerNode;
import newdimension.world.blocks.power.NDPowerNode;

import static mindustry.type.ItemStack.with;

public class NDPowerBlocks implements ContentList{

    public static Block batteryStack,//电池堆
    batteryStackLarge,//大型电池堆
    powerHealNode,//电力恢复节点
    powerGridNode,//电网节点
    healNode;//恢复节点

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

        powerGridNode = new PowerNode("power-grid-node"){{
            requirements(Category.power, ItemStack.with(
                Items.titanium, 5,
                Items.lead, 10,
                Items.silicon, 3
            ));
            size = 2;
            maxNodes = 15;
            laserRange = 15f;
        }};

        healNode = new NDPowerNode("heal-node"){{
            requirements(Category.power, ItemStack.with(
                Items.silicon, 6,
                NDItems.nanoAlloy, 12,
                NDItems.steel, 8
            ));
            consumesPower = true;
            consumePower(1.5f);
            size = 2;
            maxNodes = 8;
            laserRange = 12f;
            components.add(sharingPowerHealth);
        }};
    }
}