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
public class ContactFragment extends Fragment {


    public ContactFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View contactView = inflater.inflate(R.layout.fragment_contact,container,false);



        final String[] contactArray = getResources().getStringArray(R.array.contactArray);


        final ListView mListView = contactView.findViewById(R.id.contactId);
        ArrayAdapter mArrayAdapter = new ArrayAdapter(getContext(),android.R.layout.simple_list_item_1,contactArray);
        mListView.setAdapter(mArrayAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item =(String) mListView.getItemAtPosition(position);
                Toast.makeText(getContext(),"You selected : " + item,Toast.LENGTH_SHORT).show();
            }
        });


        return contactView;
    }

}
