package com.infinitysports.designwithmenu;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by jatin on 11/03/17.
 */




public class TabPagerAdapter extends FragmentPagerAdapter {

    int tabCount;

    public TabPagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.tabCount = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Chants_Fragment chants_fragment = new Chants_Fragment();
                return chants_fragment;
            case 1:
                History_Fragment history_fragment = new History_Fragment();
                return history_fragment;
            case 2:
                Management_Fragment management_fragment = new Management_Fragment();
                return management_fragment;
            case 3:
                Owner_Fragment owner_fragment = new Owner_Fragment();
                return owner_fragment;
            case 4:
                Stadium_Fragment stadium_fragment = new Stadium_Fragment();
                return stadium_fragment;
            case 5:
                Squad_Fragment squad_fragment = new Squad_Fragment();
                return squad_fragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}