package newdimension.content;

import arc.struct.*;
import mindustry.game.Objectives.*;
import static mindustry.content.Blocks.*;
import static mindustry.content.Items.*;
import static mindustry.game.Objectives.Produce;
import static mindustry.game.Objectives.Research;
import static mindustry.content.SectorPresets.*;
import static mindustry.content.SectorPresets.craters;
import static mindustry.content.TechTree.*;
import static newdimension.content.NDItems.*;
import static newdimension.content.NDLiquids.*;
import static newdimension.content.NDCrafterBlocks.*;
import static newdimension.content.NDDefenseBlocks.*;
import static newdimension.content.NDPowerBlocks.*;
import static newdimension.content.NDPlanets.*;
import static newdimension.content.NDCoreBlocks.*;

public class NDTechTree implements ContentList{
    @Override
    public void load(){
        {
            NDPlanets.ND.techTree = nodeRoot("ND", NDcore, () -> {
                node(ironWall, () -> {
                    node(ironWallLarge, () -> {});
                    node(steelWall, () -> {
                        node(steelWallLarge, () -> {});
                        node(goldWall, () -> {
                            node(goldWallLarge, () -> {});
                        });
                        node(tungstenWall, () -> {
                            node(tungstenWall, () -> {});
                        });
                    });
                });

                nodeProduce(NDItems.iron, () -> {
                    nodeProduce(NDItems.steel, () -> {
                        nodeProduce(NDItems.tungstenSteel, () -> {});
                    });
                    nodeProduce(NDItems.aluminium, () -> {});
                });

                nodeProduce(NDLiquids.lava, () -> {
                    nodeProduce(NDLiquids.nuclearWastewater, () -> {
                        nodeProduce(NDLiquids.superFrozenLiquid, () -> {});
                    });
                });

                node(steelFactory, () -> {
                    node(tungstenSteelFactory, () -> {
                        node(electricCubeFactory, () -> {
                            node(hypernuclearCondensatesFactory, () -> {});
                        });
                    });
                });
            });
        }
    };
}
