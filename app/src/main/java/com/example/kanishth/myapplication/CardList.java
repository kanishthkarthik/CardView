package com.example.kanishth.myapplication;

/**
 * Created by kanishth on 9/8/14.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CardList extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] username;
    public CardList(Activity context,
                    String[] username) {
        super(context, R.layout.list_single, username);
        this.context = context;
        this.username = username;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_single, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.textView1);

        txtTitle.setText(username[position]);
        return rowView;
    }
}