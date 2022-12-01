package newdimension.content;

import mindustry.world.blocks.environment.OreBlock;

public class NDOreBlocks implements ContentList{

    public static OreBlock oreIron,
    oreGold,
    oreAluminium;


    /*该矿石是否默认生成在地图中
    public boolean oreDefault = false;
        矿石生成参数
    public float oreScale = 24f, oreThreshold = 0.828f;
                  规模           矿石阈值
    */

    @Override
    public void load(){
        oreIron = new OreBlock("ore-iron", NDItems.iron){{
            oreDefault = true;
            oreThreshold = 0.838f;
            oreScale = 24.39528f;
        }};

        oreGold = new OreBlock("ore-gold", NDItems.gold){{
            oreDefault = true;
            oreThreshold = 0.879f;
            oreScale = 25.67389f;
        }};

        oreAluminium = new OreBlock("ore-aluminium", NDItems.aluminium){{
            oreDefault = true;
            oreThreshold = 0.843f;
            oreScale = 24.56281f;
        }};
    }
}