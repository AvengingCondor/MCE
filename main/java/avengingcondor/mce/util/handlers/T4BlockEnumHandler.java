package avengingcondor.mce.util.handlers;

import net.minecraft.util.IStringSerializable;

public class T4BlockEnumHandler 
{
	public static enum EnumType implements IStringSerializable
	{
		gildrium(0, "gildrium"),
		dendrite(1, "dendrite"),
		beryx(2, "beryx"),
		orichalcum(3, "orichalcum"),
		aerite(4, "aerite"),
		palladium(5, "palladium"),
		alvium(6, "alvium"),
		whitegold(7, "whitegold");
		
		private static final EnumType[] META_LOOKUP = new EnumType[values().length];
		private final int meta;
		private final String name, unlocalizedName;
		
		private EnumType(int meta, String name)
		{
			this(meta, name, name);
		}
		
		private EnumType(int meta, String name, String unlocalizedName)
		{
			this.meta = meta;
			this.name= name;
			this.unlocalizedName = unlocalizedName;
		}
		
		@Override
		public String getName() 
		{
			return this.name;
		}
		
		public int getMeta()
		{
			return this.meta;
		}
		
		public String getUnlocalizedName()
		{
			return this.unlocalizedName;
		}
		
		@Override
		public String toString()
		{
			return this.name;
		}
		
		public static EnumType byMetadata(int meta)
		{
			return META_LOOKUP[meta];
		}
		
		static
		{
			for(EnumType enumtype : values())
			{
				META_LOOKUP[enumtype.getMeta()] = enumtype;
			}
		}
	}
}
