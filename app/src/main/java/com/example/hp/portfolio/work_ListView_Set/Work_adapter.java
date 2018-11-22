package com.example.hp.portfolio.work_ListView_Set;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hp.portfolio.R;

public class Work_adapter extends ArrayAdapter<Work> {


    private Context mContext;
    private int mLayoutResourcesId;
   private Work mData[] = null;
    private String url = "https://github.com/kDziubek";

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

        View row;
        row = convertView;

        LayoutInflater inflater = LayoutInflater.from(mContext);
        row = inflater.inflate(mLayoutResourcesId,parent,false);

        //get a reference to the different view elements we wish to update
        TextView biggerText = row.findViewById(R.id.biggerTextId);
        TextView smallerText = row.findViewById(R.id.smallTextId);
        final ImageView image = row.findViewById(R.id.imageListView);

        //get a data from the data array
        Work work = mData[position];

        //setting the view to reflect the data we need to display
        biggerText.setText(work.name);
        smallerText.setText(work.when);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               goTuUrl(url);
            }
        });


        return row;
    }
    private void goTuUrl(String url){
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW,uriUrl);
        mContext.startActivity(launchBrowser);
    }
}
