package com.opengltest.views;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

import com.opengltest.CustomGLRenderer;

public class CustomGLSurfaceView extends GLSurfaceView {
    private CustomGLRenderer renderer;

    public CustomGLSurfaceView(Context context) {
        super(context);
    }

    public CustomGLSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2);
        renderer = new CustomGLRenderer();
        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(renderer);
        // Render the view only when there is a change in the drawing data
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
}
