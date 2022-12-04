package newdimension.content;

import arc.graphics.*;
import mindustry.content.*;
import mindustry.game.*;
import mindustry.graphics.*;
import mindustry.graphics.g3d.*;
import mindustry.maps.planet.ErekirPlanetGenerator;
import mindustry.type.*;
import mindustry.world.meta.Attribute;
import mindustry.world.meta.Env;
import newdimension.world.gen.NDPlanetGenerator;

public class NDPlanets implements ContentList{

    public static Planet NDsun,
    ND;

    public void load(){
        /*NDsun = new Planet("NDsun", null, 5f){{
            bloom = true;
            accessible = false;
            meshLoader = () -> new SunMesh(
                this, divisions = 4,
                octaves = 5, persistence = 0.3,
                scl = 1.7, pow = 1.2, mag = 1,
                colorScale = 1.1f,
                Color.valueOf("ff7a38"),
                Color.valueOf("ff9638"),
                Color.valueOf("ffc64c"),
                Color.valueOf("ffc64c"),
                Color.valueOf("ffe371"),
                Color.valueOf("f4ee8e")
            );
        }};*/
        ND = new Planet("ND", Planets.sun, 2f, 3){{
            generator = new NDPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 5);
            cloudMeshLoader = () -> new MultiMesh(
                    new HexSkyMesh(this, 2, 0.15f, 0.14f, 5, Color.valueOf("eba768").a(0.75f), 2, 0.42f, 1f, 0.43f),
                    new HexSkyMesh(this, 3, 0.6f, 0.15f, 5, Color.valueOf("eea293").a(0.75f), 2, 0.42f, 1.2f, 0.45f)
            );
            alwaysUnlocked = true;
            landCloudColor = Color.valueOf("ed6542");
            atmosphereColor = Color.valueOf("f07218");
            defaultEnv = Env.scorching | Env.terrestrial;
            startSector = 10;
            atmosphereRadIn = 0.02f;
            atmosphereRadOut = 0.3f;
            tidalLock = true;
            orbitSpacing = 2f;
            totalRadius += 2.6f;
            lightSrcTo = 0.5f;
            lightDstFrom = 0.2f;
            clearSectorOnLose = true;
            defaultCore = NDCoreBlocks.NDcore;
            hiddenItems.addAll(NDItems.ndItems).removeAll(Items.serpuloItems);

            //TODO SHOULD there be lighting?
            updateLighting = false;

            ruleSetter = r -> {
                r.waveTeam = Team.malis;
                r.placeRangeCheck = false; //TODO true or false?
                r.attributes.set(Attribute.heat, 0.8f);
                r.showSpawns = true;
                r.fog = true;
                r.staticFog = true;
                r.lighting = false;
                r.coreDestroyClear = true;
                r.onlyDepositCore = true; //TODO not sure
            };

            unlockedOnLand.add(NDCoreBlocks.NDcore);
        }};
    }
}