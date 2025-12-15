package wwcp.common.core.handler;

import train.common.Traincraft;
import train.common.library.register.TrainRecord;
import wwcp.common.entity.locomotives.diesels.EntitySD90MACH;
import wwcp.common.entity.locomotives.diesels.EntityWWCPShopShunter;
import wwcp.common.entity.locomotives.electrics.EntityBR103;
import wwcp.common.entity.passenger.EntityEurofima1stClass;
import wwcp.common.library.WWCPItems;
import wwcp.common.wwcp;

public class AddonPackRollingStockEntityHandler
{
    private Object Instance()
    {
        return wwcp.instance;
    }

    public AddonPackRollingStockEntityHandler()
    {
        /* Sample

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerBlue.item,
                                new TrainRecord("Passenger Blue", EntityPassengerBlue.class, ItemIDs.minecartPassengerBlue.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Blue", "Red", "Green", "White", "Black", "Cyan", "Orange", "Grey", "LightGrey", "LightBlue"},
                                        18),
                                Instance() // don't touch this line
                        );
         */

        // Put Calls to RegisterRollingStockEntity below this.
        /**
         * DIESEL TRAINS
         */
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.WWCPShopShunter.item,
                        new TrainRecord(WWCPItems.WWCPShopShunter.name(), EntityWWCPShopShunter.class, WWCPItems.WWCPShopShunter.item,
                                "Freight Locomotive", 1,
                                new String[] {"Red", "Blue"}, 18, 0, .95, 164,
                                4120, 60, 160,
                                0.65, -1.5, 10000),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.SD90MACH.item,
                        new TrainRecord(WWCPItems.SD90MACH.name(), EntitySD90MACH.class, WWCPItems.SD90MACH.item,
                                "Freight Locomotive", 1,
                                new String[] {"Yellow", "Orange", "Red"}, 5, 0, .95, 164,
                                4120, 60, 160,
                                0.65, 7, 10000),
                        Instance()
                );

        /**
         * ELECTRIC LOCOMOTIVES
         */

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.BR103.item,
                        new TrainRecord(WWCPItems.BR103.name(), EntityBR103.class, WWCPItems.BR103.item,
                                Transport.BR103().additionalText2, Transport.BR103().weightinKGs,
                                new String[] {"Yellow", "Orange", "Red", "Blue"}, 5, 0, 0.95, (int)Transport.BR103().topSpeed,
                                (int)Transport.BR103().metric_horsepower, 40, 0,
                                0.95, 8, 0),
                        Instance()
                );

        /**
         * Passenger Stock
         */

        Traincraft.traincraftRegistry
            .RegisterRollingStockEntity(WWCPItems.Eurofima1stClassOpen.item,
                    new TrainRecord(WWCPItems.Eurofima1stClassOpen.name(), EntityEurofima1stClass.class, WWCPItems.Eurofima1stClassOpen.item,
                            Transport.EurofimaOpen1().additionalText2, Transport.EurofimaOpen1().weightinKGs,
                            new String[] {"Yellow", "Orange"}, 5, 0, 0, 0,
                            0, 0, 0,
                            0, 0, 0),
                    Instance()
            );
    }
}
