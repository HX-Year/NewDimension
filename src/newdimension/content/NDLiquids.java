package newdimension.content;

import arc.graphics.*;
import mindustry.content.StatusEffects;
import mindustry.gen.EffectState;
import mindustry.type.*;

public class NDLiquids implements ContentList{
    public static Liquid nuclearWastewater,//核废水
    lava,//岩浆
    superFrozenLiquid;//超冻液

    /*"explosiveness"爆炸性，石油=1.2f
    "flammability"燃烧性，石油=1.2f
    "temperature"液体温度，矿渣=1f，冷却液=0.25f
    "heatCapacity"比热容，水=0.4f，冷却液=0.9f
    "viscosity"粘度 ，水=0.5f，石油=0.7f
    "effect"状态，液体倒在地上时候,可以给予单位状态，详细看状态接口表
    */

    @Override
    public void load(){
        nuclearWastewater = new Liquid("nuclear-wastewater", Color.valueOf("8ECC47")){{
            heatCapacity = 0.4f;
            viscosity = 0.5f;
        }};

        lava = new Liquid("lava", Color.valueOf("E88665")){{
            temperature = 22f;
            viscosity = 1f;
            //effect = StatusEffects.;
        }};

        superFrozenLiquid = new Liquid("super-fronze-liquid", Color.valueOf("365D99")){{
            temperature = 0.02f;
            heatCapacity = 1.6f;
            viscosity = 0.5f;
            effect = StatusEffects.freezing;
        }};
    }
}