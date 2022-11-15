package newdimension.world.blocks;

import java.util.*;
import mindustry.world.blocks.defense.*;
import newdimension.world.components.ComponentBase;

public class NDWall extends Wall{
    
    public ArrayList<ComponentBase<NDWallBuild>> components = new ArrayList<>();
    public boolean sharingHealth;

    public NDWall(String name){
        super(name);
        sharingHealth = false;
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

