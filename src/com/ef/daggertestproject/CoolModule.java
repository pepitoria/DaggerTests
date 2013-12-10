package com.ef.daggertestproject;

import java.util.ArrayList;

import javax.inject.Inject;

import dagger.Module;

@Module
public class CoolModule {

    private ArrayList<String> strings;

    @Inject
    public CoolModule() {
    }

    public ArrayList<String> getStrings() {
        if (strings == null) {
            strings = new ArrayList<String>();
        }
        return strings;
    }

    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
    }

    public String toString() {
        StringBuilder b = new StringBuilder();

        for (String st : getStrings()) {
            b.append(st);
            b.append(" - ");
        }

        return b.toString();
    }
}
