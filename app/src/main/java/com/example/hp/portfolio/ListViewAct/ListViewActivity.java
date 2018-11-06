package com.example.hp.portfolio.ListViewAct;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.hp.portfolio.R;

public class ListViewActivity extends Activity {


    public ListView mlistView;
    public ArrayAdapter mArrayAdapter;

    public ListViewActivity() {
    }

    public ListView getMlistView() {
        return mlistView;
    }

    public void setMlistView(ListView mlistView) {
        this.mlistView = mlistView;
    }

    public ArrayAdapter getmArrayAdapter() {
        return mArrayAdapter;
    }

    public void setmArrayAdapter(ArrayAdapter mArrayAdapter) {
        this.mArrayAdapter = mArrayAdapter;
    }

    /*public void listViewMethod(final String[] myArray, ListView listView){

        listView = getMlistView();
        mArrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,myArray);

        if (listView !=null){
            listView.setAdapter(mArrayAdapter);
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.v("PLACE", myArray[position]);
            }
        });
    }
*/
}
