package com.example.hp.portfolio.views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.hp.portfolio.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SkillsFragment extends Fragment {


    public SkillsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View skillsView = inflater.inflate(R.layout.fragment_skills, container, false);


        final String[] skillsArray = getResources().getStringArray(R.array.skillsArray);
        final ListView mListView = skillsView.findViewById(R.id.skillsListViewId);
        ArrayAdapter mArrayAdapter = new ArrayAdapter(getContext(),android.R.layout.simple_list_item_1,skillsArray);
        mListView.setAdapter(mArrayAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item =(String) mListView.getItemAtPosition(position);
                Toast.makeText(getContext(),"You selected : " + item,Toast.LENGTH_SHORT).show();
            }
        });

        return skillsView;
    }

}
