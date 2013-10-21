package com.example.android.bitmapfun.util;

public interface ImageSet {
	public int getFirst();
	public int size();
	public BitmapData getBitmapData(int position, int desiredWidth, int desiredHeight);
}
