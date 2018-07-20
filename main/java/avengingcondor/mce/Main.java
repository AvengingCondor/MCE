package avengingcondor.mce;

import avengingcondor.mce.init.SmeltingInit;
import avengingcondor.mce.proxy.CommonProxy;
import avengingcondor.mce.tabs.BasicTab;
import avengingcondor.mce.tabs.ToolTab;
import avengingcondor.mce.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
	
	public static final CreativeTabs BASETAB = new BasicTab("mcetabbasic");
	public static final CreativeTabs TOOLTAB = new ToolTab("mcetabtool");
	
    @Instance
    public static Main instance;
    
    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {}
    
    @EventHandler
    public void init(FMLInitializationEvent event) 
    {
    	SmeltingInit.init();
    } 
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {}
}
