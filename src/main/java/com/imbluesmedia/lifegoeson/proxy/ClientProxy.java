package com.imbluesmedia.lifegoeson.proxy;

import com.imbluesmedia.lifegoeson.block.LGOBlock;
import com.imbluesmedia.lifegoeson.item.LGOItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Luke on 24/02/2017.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Override
    public void init(FMLInitializationEvent event) {
        LGOItems.registerRenders();
        LGOBlock.registerRenders();

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}
