package newdimension.world.gen;

import arc.graphics.Color;
import arc.math.geom.Vec3;
import mindustry.maps.generators.PlanetGenerator;

public class NDPlanetGenerator extends PlanetGenerator {
    public float ncl;

    @Override
    public float getHeight(Vec3 position){
        return 0;
    }

    @Override
    public Color getColor(Vec3 position){
        return null;
    }
}
