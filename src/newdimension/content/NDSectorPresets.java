package newdimension.content;

import mindustry.type.SectorPreset;

import static newdimension.content.NDPlanets.*;

public class NDSectorPresets implements ContentList{
    public static SectorPreset zhuolu;

    @Override
    public void load(){
        zhuolu = new SectorPreset("zhuolu", ND, 1){{
            alwaysUnlocked = true;
            difficulty = 1;
            addStartingItems = true;
        }};
    }
}