package wwcp.common.library;

import cpw.mods.fml.common.registry.GameRegistry;
import wwcp.common.items.ItemAddonPackRollingStock;

public class AddonPackItems
{
    /**
     * Setup all items
     */
    public AddonPackItems()
    {
        loadRollingStockItems();
        registerItems();
    }

    private void loadRollingStockItems()
    {
        for (WWCPItems item : WWCPItems.values())
        {
            item.item = new ItemAddonPackRollingStock(item.iconName, item.TypeOfRollingStock, item.tabName);
        }
    }

    private void registerItems() {
        for (WWCPItems item : WWCPItems.values()) {
            if (item.item != null) {
                item.item.setUnlocalizedName(Info.modID + ":" + item.ItemName);
                GameRegistry.registerItem(item.item, item.ItemName);
            }
        }
    }
}
