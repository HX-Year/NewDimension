package newdimension.content;

import arc.scene.style.BaseDrawable;
import mindustry.content.*;
import mindustry.entities.pattern.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.type.*;

public class NDTurrets implements ContentList{
    
    public static Block ndturret,//毁残
    ndturret1;//超导电磁炮

    @Override
    public void load(){
        ndturret = new ItemTurret("ndturret"){{
            requirements(Category.turret, ItemStack.with(
                Items.lead, 500,
                NDItems.tungstenSteel, 2000,
                NDItems.aluminium, 1000,
                NDItems.steel, 1200
            ));
            ammo(
                NDItems.tungstenSteel, new BasicBulletType(4f, 200){{
                    width = 7f;
                    height = 9f;
                    lifetime = 10f;
                    ammoMultiplier = 2;
                }}
            );
            size = 4;
            hasPower = true;
            consumePower(5f);
            shoot = new ShootAlternate(3.5f);
            shootY = 3f;
            reload = 20f;
            range = 220;
            shootCone = 60f;
            ammoUseEffect = Fx.casing1;
            health = 3000;
            inaccuracy = 2f;
            rotateSpeed = 10f;
            coolant = consumeCoolant(0.1f);
            limitRange();
        }};

        ndturret1 = new ItemTurret("ndturret1"){{
            requirements(Category.turret, ItemStack.with(
                Items.lead, 1000,
                Items.silicon, 1600,
                NDItems.tungstenSteel, 2200,
                NDItems.aluminium, 850
            ));
            ammo(
                NDItems.tungstenSteel, new BasicBulletType(10f, 10000f){{
                    width = 8f;
                    height = 10f;
                    lifetime = 1800f;
                    ammoMultiplier = 2f;
                }}
            );
            size = 6;
            hasPower = true;
            consumePower(12f);
            consumeLiquid(NDLiquids.superFrozenLiquid, 100f);
            shoot = new ShootAlternate(3.5f);
            shootY = 3f;
            reload = 20f;
            range = 500;
            shootCone = 60f;
            ammoUseEffect = Fx.casing1;
            health = 4200;
            inaccuracy = 2f;
            rotateSpeed = 10f;
            coolant = consumeCoolant(0.1f);
            limitRange();
        }};
    }
}