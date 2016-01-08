package com.bulbulhossen.listviewandfragmentwithanimation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class CustomAdapter extends ArrayAdapter<String> {
    String[] str;
    Context mContext;
    LayoutInflater inflater;

    public CustomAdapter(Context context, int textViewResourceId, String[] objects) {
        super(context, textViewResourceId, objects);
        str = objects;
        mContext = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View row = inflater.inflate(R.layout.listview_adapter, parent, false);

        TextView textView = (TextView) row.findViewById(R.id.textView);
        textView.setText(str[position]);

        textView.setAnimation(AnimationUtils.loadAnimation(mContext, R.anim.listview_anim));

        return row;
    }
}

