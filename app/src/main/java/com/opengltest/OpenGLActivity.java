package com.opengltest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.opengltest.views.CustomGLSurfaceView;

public class OpenGLActivity extends AppCompatActivity {

    private CustomGLSurfaceView glSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_gl);
        findViews();
    }

    private void findViews() {
        glSurfaceView = (CustomGLSurfaceView) findViewById(R.id.gl_view);
    }
}
