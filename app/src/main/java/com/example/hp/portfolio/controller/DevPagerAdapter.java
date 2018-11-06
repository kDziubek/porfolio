package com.example.hp.portfolio.controller;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.hp.portfolio.views.AboutFragment;
import com.example.hp.portfolio.views.ContactFragment;
import com.example.hp.portfolio.views.HobbyFragment;
import com.example.hp.portfolio.views.SkillsFragment;
import com.example.hp.portfolio.views.WorkFragment;

public class DevPagerAdapter extends FragmentPagerAdapter {

    public DevPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new AboutFragment();
            case 1:
                return new WorkFragment();
            case 2:
                return new SkillsFragment();
            case 3:
                return new ContactFragment();
            case 4:
                return new HobbyFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public String getPageTitle(int position) {

        switch (position) {
            case 0:
                return "ABOUT";
            case 1:
                return "WORK";
            case 2:
                return "SKILLS";
            case 3:
                return "CONTACT";
            case 4:
                return "Hobby";
        }
        return null;
    }


}
