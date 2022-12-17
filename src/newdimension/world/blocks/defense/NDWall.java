package newdimension.world.blocks.defense;

import java.util.*;
import mindustry.world.blocks.defense.*;
import newdimension.world.components.ComponentBase;
import newdimension.world.components.SelfHealing;

public class NDWall extends Wall{
    public ArrayList<ComponentBase<NDWallBuild>> components = new ArrayList<>();
    public static SelfHealing selfHealing = new SelfHealing();

    public NDWall(String name){
        super(name);
    }

    public class NDWallBuild extends WallBuild{
        @Override
        public void updateTile(){
            for(ComponentBase<NDWallBuild> component : components){
                component.onUpdate(this);
            }
        }
    }
}

