package newdimension.world.blocks;

import java.util.*;
import mindustry.world.blocks.defense.*;
import newdimension.components.*;

public class NDWall extends Wall{
    
    public ArrayList<ComponentBase<NDWallBuild>> components = new ArrayList<>();
    public boolean sharingHealth = false;

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

