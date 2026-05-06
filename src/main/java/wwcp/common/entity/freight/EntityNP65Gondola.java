package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import wwcp.client.render.rollingstock.freight.NP65Gondola;
import wwcp.common.core.handler.Transport;

public class EntityNP65Gondola extends AbstractStandardFreightCar {

    public EntityNP65Gondola(World world) {
        super(world);
    }

    @Override
    public CargoManager setupCargoManager()
    {
        return null;
    }


    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "NP Gondola Empty");
        InsertTexture(1, "NP Gondola Pea Gravel");
        InsertTexture(2, "NP Gondola Oak Logs");
        InsertTexture(3, "NP Gondola Birch Logs");
        InsertTexture(4, "NP Gondola Spruce Logs");
        InsertTexture(5, "NP Gondola Jungle Logs");
        InsertTexture(6, "NP Gondola Acacia Logs");
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 4.5F;
    }

    @Override
    public String transportCountry() {
        return Transport.NP65Gondola().country;
    }

    @Override
    public String transportYear() {
        return Transport.NP65Gondola().year;
    }

    public String getInventoryName() {
        return Transport.NP65Gondola().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.NP65Gondola().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityNP65Gondola.class, new NP65Gondola(),
                        "NP65Gondola",
                        new float[]{-0.0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/freightskins/NP65Gondola/NP_65_Gondola";
                                break;
                            case "red":
                                texturePath = "textures/freightskins/NP65Gondola/NP_65_Gondola_PG";
                                break;
                            case "green":
                                texturePath = "textures/freightskins/NP65Gondola/NP_65_Gondola_Oak_Logs";
                                break;
                            case "brown":
                                texturePath = "textures/freightskins/NP65Gondola/NP_65_Gondola_Birch_Logs";
                                break;
                            case "blue":
                                texturePath = "textures/freightskins/NP65Gondola/NP_65_Gondola_Spruce_Logs";
                                break;
                            case "purple":
                                texturePath = "textures/freightskins/NP65Gondola/NP_65_Gondola_Jungle_Logs";
                                break;
                            case "cyan":
                                texturePath = "textures/freightskins/NP65Gondola/NP_65_Gondola_Acacia_Logs";
                                break;

                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
