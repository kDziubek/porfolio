package com.example.hp.portfolio.ListViewAct;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.hp.portfolio.R;

public class Work_adapter extends ArrayAdapter<Work> {


    private Context mContext;
    private int mLayoutResourcesId;
    private Work mData[] = null;

    public Work_adapter(Context context, int resource, Work[] data) {
        super(context, resource, data);
        this.mContext = context;
        this.mLayoutResourcesId = resource;
        this.mData = data;
    }

    @Override
    public Work getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;

        LayoutInflater inflater = LayoutInflater.from(mContext);
        row = inflater.inflate(mLayoutResourcesId,parent,false);

        //get a reference to the different view elements we wish to update
        TextView biggerText = (TextView) row.findViewById(R.id.biggerTextId);
        TextView smallerText = (TextView) row.findViewById(R.id.smallTextId);

        //get a data from the data array
        Work work = mData[position];

        //setting the view to reflect the data we need to display
        biggerText.setText(work.name);
        smallerText.setText(work.when);


        return row;
    }
}