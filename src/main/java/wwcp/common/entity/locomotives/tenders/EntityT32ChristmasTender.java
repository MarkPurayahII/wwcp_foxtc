package wwcp.common.entity.locomotives.tenders;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.Tender;
import wwcp.client.render.rollingstock.tenders.ChristmasTenderT32;
import wwcp.common.core.handler.Transport;
import wwcp.common.core.handler.WWCPEntityHandler;

public class EntityT32ChristmasTender extends Tender {

    public EntityT32ChristmasTender(World world) {
        super(world, FluidRegistry.WATER, 0, 100000, LiquidManager.WATER_FILTER);
        InsertTexture(0, "T32 Christmas Tender");
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 2F;
    }

    @Override
    public String transportCountry() {
        return Transport.EurofimaOpen1().country;
    }

    @Override
    public String transportYear() {
        return Transport.EurofimaOpen1().year;
    }

    public String getInventoryName() {
        return Transport.EurofimaOpen1().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.EurofimaOpen1().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityT32ChristmasTender.class, new ChristmasTenderT32(),
                        "ChristmasTenderT32",
                        new float[]{-0.50f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "yellow":
                                texturePath = "textures/passengerstock/ChristmasStock/ChristmasT32";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
