package newdimension.world.components;

import mindustry.gen.Building;
import newdimension.world.blocks.power.NDPowerNode;

public class SharingPowerHealth extends ComponentBase<NDPowerNode.NDPowerNodeBuild>{
    @Override
    public void onUpdate(NDPowerNode.NDPowerNodeBuild nd){
        for(Building other : nd.proximity){
            if(other.block != nd.block){
                continue;
            }
            float thisH = nd.health;
            float maxH = nd.maxHealth;
            float otherH = other.health;
            float gH = 0;
            if(thisH > 0 && otherH < thisH && otherH > 0){
                other.health += 1;
                nd.health += 1;
                gH += 1;
                if(gH >= maxH * 3){
                    continue;
                }
            }
        }
    }
}
