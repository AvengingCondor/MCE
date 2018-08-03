package avengingcondor.mce.util.handlers;

import net.minecraft.util.IStringSerializable;

public class T5BlockEnumHandler 
{
	public static enum EnumType implements IStringSerializable
	{
		sednum(0, "sednum"),
		colovite(1, "colovite"),
		platinum(2, "platinum"),
		kronite(3, "kronite"),
		breycalt(4, "breycalt"),
		makrine(5, "makrine"),
		fotite(6, "fotite"),
		promethium(7, "promethium");
		
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
