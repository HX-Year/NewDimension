package newdimension.world.components;

import mindustry.gen.*;
import newdimension.world.blocks.*;
import newdimension.world.components.ComponentBase;

public class SharingHealth extends ComponentBase<NDWall.NDWallBuild> {
    
    @Override
    public void onUpdate(NDWall.NDWallBuild nd){
        for(Building other : nd.proximity){
            if(other.block != nd.block)
                continue;
            float thisH = nd.health;
            float otherH = other.health;
            if(thisH > otherH && otherH > 1 && otherH < other.maxHealth){
                other.health += 1;
                nd.health -= 1;
            }
        }
    }
}
