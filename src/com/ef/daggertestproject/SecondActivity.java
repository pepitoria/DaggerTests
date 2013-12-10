package com.ef.daggertestproject;

import javax.inject.Inject;

import android.os.Bundle;

public class SecondActivity extends BaseActivity {

    @Inject
    CoolModule coolModule;

    // @Inject
    // MyApplication app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coolModule.getStrings().add(getClass().getSimpleName());

        System.out.println(coolModule.toString());
    }

}
