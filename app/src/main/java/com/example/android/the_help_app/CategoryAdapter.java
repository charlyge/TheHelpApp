package com.example.android.the_help_app;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by DELL PC on 6/10/2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
 private Context context;
    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context =context;
    }

  
    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new profile();

        }
        else if(position==1){
            return new Resources();

        }
        else{
            return new knowlegeCafe();

        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position ==0){
            return context.getString(R.string.profile);
        }
        else if(position==1){
         return context.getString(R.string.resources);

        }
        else {
            return context.getString(R.string.knowledege_cafe);

        }
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 3;
    }
}
