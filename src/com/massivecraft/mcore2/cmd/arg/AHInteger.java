package com.massivecraft.mcore2.cmd.arg;

public class AHInteger extends AHPrimitive<Integer>
{	
	@Override
	protected String getPrimitiveName()
	{
		return "integer";
	}

	@Override
	protected Integer unsafeConvert(String str) throws Exception
	{
		return Integer.parseInt(str);
	}	
}