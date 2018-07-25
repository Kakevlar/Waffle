package com.waffle;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Carlos Kowalevicz on 7/16/2018.
 */
public class CustomAdapter extends ArrayAdapter {

    Activity activity;
    int layout;
    ArrayList<Info> arrayList;

    public CustomAdapter(Activity activity,int layout,ArrayList<Info> arrayList) {
        super(activity,layout, arrayList);

        this.activity = activity;
        this.layout = layout;
        this.arrayList = arrayList;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        convertView = layoutInflater.inflate(layout,null);
        ImageView imageinitial = (ImageView) convertView.findViewById(R.id.imageinitial);
        TextView textTitle = (TextView) convertView.findViewById(R.id.textTitle);
        TextView textDesc = (TextView) convertView.findViewById(R.id.textDesc);
        imageinitial.setImageResource(arrayList.get(position).getImage());
        textTitle.setText(arrayList.get(position).getTitle());
        textDesc.setText(arrayList.get(position).getDesc());

        return convertView;
    }
}
