package wwcp.common.entity.locomotives.electrics;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;
import wwcp.client.render.rollingstock.locomotives.electrics.Traxx.TraxxPre;
import wwcp.common.core.handler.Transport;

public class EntityBR145 extends ElectricTrain {

    public EntityBR145(World world) {
        super(world);    
        InsertTexture(0, "BR145");
    }
    
    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 7.65f, 0f, -0.2f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 0.5F;
    }

    @Override
    public String transportCountry() {
        return Transport.BR145().country;
    }

    @Override
    public String transportYear() {
        return Transport.BR145().year;
    }

    public String getInventoryName() {
        return Transport.BR145().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.BR145().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityBR145.class, new TraxxPre(),
                        "BR145",
                        new float[]{-4f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "yellow":
                                texturePath = "textures/locomotive/Electric/TraxxFamily/BR145DB";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }

    @Override
    public SoundRecord getSoundRecord() {
        return EnumSounds.locoElectricBR185;
    }
}
