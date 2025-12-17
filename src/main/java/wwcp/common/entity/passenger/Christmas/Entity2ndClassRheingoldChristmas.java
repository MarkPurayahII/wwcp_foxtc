package wwcp.common.entity.passenger.Christmas;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.core.util.TraincraftUtil;
import wwcp.client.render.rollingstock.passengerStock.Christmas.ChristmasSalon2;
import wwcp.common.core.handler.Transport;

public class Entity2ndClassRheingoldChristmas extends AbstractPassengerCar {

    public Entity2ndClassRheingoldChristmas(World world) {
        super(world);
        InsertTexture(0, "Christmas 1st class carriage");
    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 0.2f, 0f, -0.25f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 5.8F;
    }

    @Override
    public String transportCountry() {
        return Transport.RheingoldSalon2Christmas().country;
    }

    @Override
    public String transportYear() {
        return Transport.RheingoldSalon2Christmas().year;
    }

    public String getInventoryName() {
        return Transport.RheingoldSalon2Christmas().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.RheingoldSalon2Christmas().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        Entity2ndClassRheingoldChristmas.class, new ChristmasSalon2(),
                        "ChristmasSalon",
                        new float[]{-0.1f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "yellow":
                                texturePath = "textures/passengerstock/ChristmasStock/ChristmasSalon2";
                                break;
                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
