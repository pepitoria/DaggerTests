package com.ef.daggertestproject;

import javax.inject.Inject;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends BaseActivity {

    @Inject
    CoolModule coolModule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coolModule.getStrings().add(getClass().getSimpleName());

        System.out.println(coolModule.toString());

        startActivity(new Intent(this, SecondActivity.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
