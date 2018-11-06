package com.example.hp.portfolio;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

import com.example.hp.portfolio.controller.DevPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private Button getInTouch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new DevPagerAdapter(getSupportFragmentManager()));

        TabLayout tabs = findViewById(R.id.tabLayoutId);
        tabs.setupWithViewPager(viewPager,true);

        tabs.setTabTextColors(Color.GRAY,Color.parseColor("yellow"));
        getInTouch = findViewById(R.id.getInTouch);
        getInTouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialContactPhone("660567023");
            }
        });

    }
    private void dialContactPhone(final String phoneNumber){
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",phoneNumber,null)));
    }
}
