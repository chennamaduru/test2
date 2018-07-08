package com.app1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

public class Test {

	public static void main(String[] args)
	{
		Margin mg=new Margin();
		mg.setMrgId(100);
		mg.setMrgCode("ABCD");
		Margin mg1=new Margin();
		mg1.setMrgId(200);
		mg1.setMrgCode("EFGH");
		Margin mg2=new Margin();
		mg2.setMrgId(300);
		mg2.setMrgCode("IJKL");
		
		Model mod=new Model();
		mod.setModId(123);
		mod.setModCode("MODECODE");
		mod.setModCost(3.2);
		Map<Integer,Margin> map=new HashMap<Integer,Margin>();
		map.put(1, mg);
		mod.setMg(map);
		
		Model mod1=new Model();
		mod1.setModId(456);
		mod1.setModCode("MODECODE1");
		mod1.setModCost(4.2);
		Map<Integer,Margin> map1=new HashMap<Integer,Margin>();
		map1.put(2, mg1);
		mod1.setMg(map1);
		
		Model mod2=new Model();
		mod2.setModId(789);
		mod2.setModCode("MODECODE2");
		mod2.setModCost(5.2);
		Map<Integer,Margin> map2=new HashMap<Integer,Margin>();
		map2.put(3, mg2);
		mod2.setMg(map2);
		
		Product pro=new Product();
		pro.setProId(88);
		pro.setProName("PHONE");
		List<Model> list=Arrays.asList(mod,mod1,mod2);
		pro.setMod(list);
		try
		{
			ObjectMapper om=new ObjectMapper();
		String json	=om.writeValueAsString(pro);
		System.out.println(json);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
