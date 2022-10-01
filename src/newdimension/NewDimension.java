package newdimension;

import arc.util.*;
import mindustry.mod.Mod;
import newdimension.content.*;

public class NewDimension extends Mod{
    public static String ModName = "new-dimension";
    public static final ContentList[] modContents = new ContentList[]{
        new NDItems(),
        new NDLiquids(),
        new DefenseBlocks(),
        new CrafterBlocks(),
        new NDOreBlocks()
    };
    public NewDimension(){
        Log.info("Loaded NewDimension constructor.");
        /*Events.on(ClientLoadEvent.class, e -> {
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("frog");
                dialog.cont.add("behold").row();
                dialog.cont.image(Core.atlas.find("new-dimension-frog")).pad(20f).row();
                dialog.cont.button("I see", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });*/
    }

    @Override
    public void loadContent(){
        Log.info("Loading some newdimension content.");
        for (ContentList ndlist : NewDimension.modContents){
            ndlist.load();
        };
    }
}
