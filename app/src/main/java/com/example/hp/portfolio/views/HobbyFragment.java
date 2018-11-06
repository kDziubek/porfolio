package com.example.hp.portfolio.views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.hp.portfolio.ListViewAct.ListViewActivity;
import com.example.hp.portfolio.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HobbyFragment extends Fragment {





    public HobbyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View hobbyView = inflater.inflate(R.layout.fragment_hobby,container,false);



        final String[] hobbyArray = getResources().getStringArray(R.array.hobbyArray);


        final ListView mListView = hobbyView.findViewById(R.id.hobbyListView);
        ArrayAdapter listViewAdapter = new ArrayAdapter(getContext(),android.R.layout.simple_list_item_1,hobbyArray);
        mListView.setAdapter(listViewAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item =(String) mListView.getItemAtPosition(position);
                Toast.makeText(getContext(),"You selected : " + item,Toast.LENGTH_SHORT).show();
            }
        });

        return hobbyView;
    }

}
