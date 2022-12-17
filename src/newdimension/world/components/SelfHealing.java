package newdimension.world.components;

import newdimension.world.blocks.defense.NDWall;

public class SelfHealing extends ComponentBase<NDWall.NDWallBuild> {
    @Override
    public void onUpdate(NDWall.NDWallBuild nd){
       float thisH = nd.health;
       float maxH = nd.maxHealth;
       if(thisH > 0 && thisH <= maxH * 0.4){
           nd.health += 1;
       }
    }
}
