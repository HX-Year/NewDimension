package newdimension.world.blocks.power;

import mindustry.world.blocks.power.PowerNode;
import newdimension.world.components.ComponentBase;
import newdimension.world.components.SharingPowerHealth;

import java.util.ArrayList;

public class NDPowerNode extends PowerNode {
    public ArrayList<ComponentBase<NDPowerNode.NDPowerNodeBuild>> components = new ArrayList<>();
    public static SharingPowerHealth sharingPowerHealth = new SharingPowerHealth();

    public NDPowerNode(String name) {
        super(name);
        update = true;
    }

    public class NDPowerNodeBuild extends PowerNodeBuild {
        @Override
        public void updateTile() {
            for (ComponentBase<NDPowerNode.NDPowerNodeBuild> component : components) {
                component.onUpdate(this);
            }
        }
    }
}