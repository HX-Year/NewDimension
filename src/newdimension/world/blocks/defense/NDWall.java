package newdimension.world.blocks.defense;

import mindustry.world.blocks.defense.Wall;
import newdimension.world.components.ComponentBase;
import newdimension.world.components.SelfHealing;

import java.util.ArrayList;

public class NDWall extends Wall{
    public ArrayList<ComponentBase<NDWallBuild>> components = new ArrayList<>();
    public static SelfHealing selfHealing = new SelfHealing();

    public NDWall(String name){
        super(name);
        update = true;
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

