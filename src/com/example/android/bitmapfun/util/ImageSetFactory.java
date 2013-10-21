package com.example.android.bitmapfun.util;

import java.util.HashMap;
import java.util.Map;

public class ImageSetFactory {
	private static Map<String, ImageSet> sImageSetMap=new HashMap<String, ImageSet>();
	public static ImageSet getImageSet(String name){
		return sImageSetMap.get(name);
	}
	public static void addImageSet(ImageSet set, String name){
		sImageSetMap.put(name, set);
	}

}
