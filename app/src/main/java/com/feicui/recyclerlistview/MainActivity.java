package com.feicui.recyclerlistview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

public class MainActivity extends ActionBarActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: 2222221");
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: 1111111");
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
    }
}
