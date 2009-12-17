package com.carlmagnuson.routing.search;

import java.util.*;

public class DefaultInitHashMap<K,V> extends HashMap<K,V> {

	private static final long serialVersionUID = 1L;

	private V def;
	
	public DefaultInitHashMap(V def){
		super();
		this.def = def;
	}
	
	@SuppressWarnings("unchecked")
	public V get(Object o){
		if(super.get(o)==null){
			super.put((K)o, def);
		}
		return super.get(o);
	}
	
}
