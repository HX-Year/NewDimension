package newdimension.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class NDItems implements ContentList{
    public static Item iron,//铁
    tungstenSteel,//钨钢
    radioactiveSubstances,//放射物
    hypernuclearCondensates,//超核凝聚物
    gold,//黄金
    steel,//钢
    iterativeModule,//迭代模块
    stone,//石头
    electricCube;//电立方

    /*"explosiveness"爆炸性
    "flammability"燃烧性，在燃烧发电机中这个与发电量成正比例
    "radioactivity"辐射性，在辐射发电机中这个与发电量成正比例
    "charge"电？也许是物品爆炸放电吧，原版就合金有
    "hardness"挖掘等级
    "cost"用作建筑材料是消耗时间倍率 时间公式：各个材料需求数量乘此倍率后相加再除以60就是所需时间
    */

    @Override
    public void load(){
        iron = new Item("iron", Color.valueOf("D8DADF")){{
            hardness = 2;
            cost = 1.3f;
        }};

        tungstenSteel = new Item("tungsten-steel", Color.valueOf("666A72")){{
            charge = 0.2f;
            cost = 1.5f;
        }};

        radioactiveSubstances = new Item("radioactive-substances", Color.valueOf("999C77")){{
            radioactivity = 1f;
        }};

        hypernuclearCondensates = new Item("hypernuclear-condensates", Color.valueOf("E88774")){{
            explosiveness = 2f;
            radioactivity = 5f;
        }};

        gold = new Item("gold", Color.valueOf("E88665")){{
            hardness = 3;
            cost = 1.6f;
        }};

        steel = new Item("steel", Color.valueOf("E84649")){{
            cost = 1.45f;
        }};

        iterativeModule = new Item("iterative-module", Color.valueOf("E88345")){{
            cost = 1.5f;
        }};

        stone = new Item("stone", Color.valueOf("E85665")){{
            hardness = 0;
            cost = 1.12f;
        }};

        electricCube = new Item("electric-cube", Color.valueOf("E75665")){{
            charge = 1f;
        }};
    }
}
