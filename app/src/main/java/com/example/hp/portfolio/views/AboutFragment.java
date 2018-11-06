package com.example.hp.portfolio.views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.hp.portfolio.ListViewAct.ListViewActivity;
import com.example.hp.portfolio.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {


    String[] myStringArray = new String[]{
            "bike",
            "sleeping",
            "ski jumping",
            "running",
            "swimming",
            "triathlon",
            "football",
            "basketball",
            "betting",
            "travelling",
            "programming"
    };


    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View aboutView = inflater.inflate(R.layout.fragment_about_fragment,container,false);
        return aboutView;
    }


}
