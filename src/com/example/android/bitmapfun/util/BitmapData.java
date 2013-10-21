package com.example.android.bitmapfun.util;

import android.graphics.drawable.Drawable;

public class BitmapData {
	private final Object data;
	private final int desiredWidth;
	private final int desiredHeight;
	private final String memKey;
	private final String diskKey;
	private OnDrawable onDrawable;
	public interface OnDrawable{
		public Drawable onPreSetDrawable(BitmapData data, Drawable drawable);
		public void onAfterSetDrawable(BitmapData data);
	}
	public static BitmapData obtain(Object data, int desiredWidth, int desiredHeight){
		return new BitmapData(data, 
				""+data, 
				data+""+desiredWidth+","+desiredHeight, 
				desiredWidth, 
				desiredHeight);
	}
	protected BitmapData(Object data, String diskKey, 
			String memKey, int desiredWidth, int desiredHeight){
		this.data = data;
		this.desiredWidth =desiredWidth;
		this.desiredHeight = desiredHeight;
		this.memKey = memKey;
		this.diskKey = diskKey;
	}
	public Object getData(){
		return data;
	}
	public String getDiskKey(){
		return data.toString();
	}
	public String getMemKey(){
		return memKey;
	}
	public int getDesiredWidth(){
		return desiredWidth;
	}
	public int getDesiredHeight(){
		return desiredHeight;
	}
	public void setOnDrawable(OnDrawable onDrawable){
		this.onDrawable = onDrawable;
	}
	public OnDrawable getOnDrawable(){
		return this.onDrawable;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("data: ")
		.append(data)
		.append(", memKey: ")
		.append(memKey)
		.append(", desiredWidth: ")
		.append(desiredWidth)
		.append(", desiredHeight: ")
		.append(desiredHeight);
		return sb.toString();
	}
}
