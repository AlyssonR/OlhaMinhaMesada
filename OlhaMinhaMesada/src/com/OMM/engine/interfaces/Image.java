package com.OMM.engine.interfaces;

import com.OMM.engine.interfaces.Graphics.ImageFormat;

public interface Image {
    public int getWidth();
    public int getHeight();
    public ImageFormat getFormat();
    public void dispose();
}
