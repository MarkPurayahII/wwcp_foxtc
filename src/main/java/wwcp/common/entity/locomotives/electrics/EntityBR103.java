package wwcp.common.entity.locomotives.electrics;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.sounds.SoundRecord;
import wwcp.client.render.rollingstock.locomotives.electrics.BR103;
import wwcp.common.core.handler.Transport;
import wwcp.common.entity.passenger.EntityEurofima1stClass;

public class EntityBR103 extends ElectricTrain {

    public EntityBR103(World world) {
        super(world);    
        InsertTexture(0, "BR103");

    }
    
    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 7.8f, 0.2f, -0.15f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 0.95F;
    }

    @Override
    public String transportCountry() {
        return Transport.BR103().country;
    }

    @Override
    public String transportYear() {
        return Transport.BR103().year;
    }

    public String getInventoryName() {
        return Transport.BR103().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.BR103().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityBR103.class, new BR103(),
                        "BR103",
                        new float[]{-4f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "yellow":
                                texturePath = "textures/locomotive/Electric/BR103/BR103Lufthansa";
                                break;
                            case "orange":
                                texturePath = "textures/locomotive/Electric/BR103/BR103Base";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Electric/BR103/FullRed";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Electric/BR103/FullRed1";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }

    @Override
    public SoundRecord getSoundRecord() {
        return null;
    }
}
