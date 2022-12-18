package newdimension.content;

import static mindustry.content.Blocks.tungstenWall;
import static mindustry.content.Blocks.tungstenWallLarge;
import static mindustry.content.TechTree.node;
import static mindustry.content.TechTree.nodeProduce;
import static newdimension.content.NDCrafterBlocks.*;
import static newdimension.content.NDDefenseBlocks.nanoAlloyWall;
import static newdimension.content.NDDefenseBlocks.nanoAlloyWallLarge;
import static newdimension.content.NDPowerBlocks.batteryStack;
import static newdimension.content.NDPowerBlocks.batteryStackLarge;
import static newdimension.content.NDTurrets.*;

public class NDTechTree implements ContentList{
    @Override
    public void load(){
        {
            //NDPlanets.ND.techTree = nodeRoot("ND", NDcore, () -> {
            node(tungstenWall, () -> {
                node(tungstenWallLarge, () -> {
                    node(nanoAlloyWall, () -> {
                        node(nanoAlloyWallLarge, () -> {});
                    });
                });
            });

            nodeProduce(NDItems.iron, () -> {
                nodeProduce(NDItems.steel, () -> {
                    nodeProduce(NDItems.tungstenSteel, () -> {
                        nodeProduce(NDItems.radioactiveSubstances, () -> {
                            nodeProduce(NDItems.hypernuclearCondensates, () -> {});
                        });
                        nodeProduce(NDItems.electricCube, () -> {
                            nodeProduce(NDItems.refactoringModule, () -> {});
                        });
                        nodeProduce(NDItems.iterativeModule, () -> {});
                    });
                });
                nodeProduce(NDItems.aluminium, () -> {
                    nodeProduce(NDItems.gold, () -> {});
                });
            });

            nodeProduce(NDLiquids.lava, () -> {
                nodeProduce(NDLiquids.nuclearWastewater, () -> {
                    nodeProduce(NDLiquids.superFrozenLiquid, () -> {});
                });
            });

            node(steelFactory, () -> {
                node(tungstenSteelSmelter, () -> {
                    node(electricCubeBaler, () -> {
                        node(superNuclearMachine, () -> {});
                    });
                });
            });

            node(batteryStack, () -> {
                node(batteryStackLarge, () -> {});
            });

            node(huiCan, () -> {
                node(superconductingElectromagneticGun, () -> {});
                node(frost, () -> {});
            });
        }
    }
}
