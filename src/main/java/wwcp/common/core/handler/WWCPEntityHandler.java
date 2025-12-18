package wwcp.common.core.handler;

import train.common.Traincraft;
import train.common.library.register.TrainRecord;
import wwcp.common.entity.locomotives.diesels.*;
import wwcp.common.entity.locomotives.electrics.*;
import wwcp.common.entity.locomotives.steam.EntityChristmasBR01;
import wwcp.common.entity.locomotives.tenders.EntityT32ChristmasTender;
import wwcp.common.entity.passenger.Christmas.*;
import wwcp.common.entity.passenger.Eurofima.*;
import wwcp.common.library.WWCPItems;
import wwcp.common.wwcp;

public class WWCPEntityHandler
{
    private Object Instance()
    {
        return wwcp.instance;
    }

    public WWCPEntityHandler()
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
         * STEAM LOCOMOTIVES
         */

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.ChristmasBR01.item,
                        new TrainRecord(WWCPItems.ChristmasBR01.name(), EntityChristmasBR01.class, WWCPItems.ChristmasBR01.item,
                                Transport.DRBR01WitteChristmas().additionalText2, Transport.DRBR01WitteChristmas().weightinKGs,
                                new String[] {"Yellow"}, 5, 0, 1.1, (int)Transport.DRBR01WitteChristmas().topSpeed,
                                (int)Transport.DRBR01WitteChristmas().metric_horsepower, 40, 200,
                                1.1, 6.2, 50000),
                        Instance()
                );
        /**
         * TENDERS
         */

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.T32TenderChristmas.item,
                        new TrainRecord(WWCPItems.T32TenderChristmas.name(), EntityT32ChristmasTender.class, WWCPItems.T32TenderChristmas.item,
                                Transport.T32TenderChristmas().additionalText2, Transport.T32TenderChristmas().weightinKGs,
                                new String[] {"Yellow"}, 5, 0, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

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
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.F140AC1.item,
                        new TrainRecord(Transport.F140AC1().name, EntityTRAXXF140AC1.class, WWCPItems.F140AC1.item,
                                Transport.F140AC1().additionalText2, Transport.F140AC1().weightinKGs,
                                new String[] {"Yellow"}, 5, 0, 0.95, (int)Transport.F140AC1().topSpeed,
                                (int)Transport.F140AC1().metric_horsepower, 40, 0,
                                0.95, 8, 0),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.BR145.item,
                        new TrainRecord(Transport.BR145().name, EntityBR145.class, WWCPItems.BR145.item,
                                Transport.BR145().additionalText2, Transport.BR145().weightinKGs,
                                new String[] {"Yellow"}, 5, 0, 0.95, (int)Transport.BR145().topSpeed,
                                (int)Transport.BR145().metric_horsepower, 40, 0,
                                0.95, 8, 0),
                        Instance()
                );

        /**
         * Passenger Stock
         */

        Traincraft.traincraftRegistry
            .RegisterRollingStockEntity(WWCPItems.EurofimaOpen1.item,
                    new TrainRecord(Transport.EurofimaOpen1().name, EntityEurofima1stClass.class, WWCPItems.EurofimaOpen1.item,
                            Transport.EurofimaOpen1().additionalText2, Transport.EurofimaOpen1().weightinKGs,
                            new String[] {"Yellow", "Orange"}, 5, 0, 0, 0,
                            0, 0, 0,
                            0, 0, 0),
                    Instance()
            );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.EurofimaCompartment1.item,
                        new TrainRecord(Transport.EurofimaCompartment1().name, EntityEurofima1stClassCompartment.class, WWCPItems.EurofimaCompartment1.item,
                                Transport.EurofimaCompartment1().additionalText2, Transport.EurofimaCompartment1().weightinKGs,
                                new String[] {"Yellow", "Orange", "Red", "Purple", "Black", "Grey", "LightGrey"}, 5, 0, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.EurofimaCompartment1_2.item,
                        new TrainRecord(Transport.EurofimaCompartment1_2().name, EntityEurofima1st2ndClassCompartment.class, WWCPItems.EurofimaCompartment1_2.item,
                                Transport.EurofimaCompartment1_2().additionalText2, Transport.EurofimaCompartment1_2().weightinKGs,
                                new String[] {"Yellow"}, 5, 0, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.EurofimaPanorama.item,
                        new TrainRecord(Transport.EurofimaPanorama().name, EntityEurofimaPanorama.class, WWCPItems.EurofimaPanorama.item,
                                Transport.EurofimaPanorama().additionalText2, Transport.EurofimaPanorama().weightinKGs,
                                new String[] {"Yellow"}, 5, 0, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.RheingoldSalon1Christmas.item,
                        new TrainRecord(Transport.RheingoldSalon1Christmas().name, Entity1stClassRheingoldChristmas.class, WWCPItems.RheingoldSalon1Christmas.item,
                                Transport.RheingoldSalon1Christmas().additionalText2, Transport.RheingoldSalon1Christmas().weightinKGs,
                                new String[] {"Yellow"}, 5, 0, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.RheingoldSalon2Christmas.item,
                        new TrainRecord(WWCPItems.RheingoldSalon2Christmas.name(), Entity2ndClassRheingoldChristmas.class, WWCPItems.RheingoldSalon2Christmas.item,
                                Transport.RheingoldSalon2Christmas().additionalText2, Transport.RheingoldSalon2Christmas().weightinKGs,
                                new String[] {"Yellow"}, 5, 0, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.RheingoldSpeise1Christmas.item,
                        new TrainRecord(WWCPItems.RheingoldSpeise1Christmas.name(), Entity1stClassRheingoldKitchenChristmas.class, WWCPItems.RheingoldSpeise1Christmas.item,
                                Transport.RheingoldKitchen1Christmas().additionalText2, Transport.RheingoldKitchen1Christmas().weightinKGs,
                                new String[] {"Yellow"}, 5, 1, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(WWCPItems.RheingoldSpeise2Christmas.item,
                        new TrainRecord(WWCPItems.RheingoldSpeise2Christmas.name(), Entity2ndClassRheingoldKitchenChristmas.class, WWCPItems.RheingoldSpeise2Christmas.item,
                                Transport.RheingoldKitchen2Christmas().additionalText2, Transport.RheingoldKitchen2Christmas().weightinKGs,
                                new String[] {"Yellow"}, 5, 1, 0, 0,
                                0, 0, 0,
                                0, 0, 0),
                        Instance()
                );


    }
}
