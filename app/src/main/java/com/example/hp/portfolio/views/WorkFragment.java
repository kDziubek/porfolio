package com.example.hp.portfolio.views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.hp.portfolio.ListViewAct.Work;
import com.example.hp.portfolio.ListViewAct.Work_adapter;
import com.example.hp.portfolio.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WorkFragment extends Fragment {


    public WorkFragment() {
        // Required empty public constructor
    }

    Work[] myWorkArray = new Work[]{

            new Work("portfolio","November 2018"),
            new Work("calculator","November 2018")

    };

    ListView mListView;
    Work_adapter mWorkAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View workView = inflater.inflate(R.layout.fragment_work, container, false);

        mListView = workView.findViewById(R.id.workListViewId);
        mWorkAdapter = new Work_adapter(getContext(),R.layout.row,myWorkArray);

        if (mListView !=null){
            mListView.setAdapter(mWorkAdapter);
        }



        return workView;
    }

}
