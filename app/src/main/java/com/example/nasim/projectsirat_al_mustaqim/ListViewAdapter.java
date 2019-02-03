package com.example.nasim.projectsirat_al_mustaqim;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    Activity context;
    ArrayList<String> arrayList;

    public ListViewAdapter(Activity context, ArrayList<String> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null)
        {
            view = context.getLayoutInflater().inflate(R.layout.list_item, viewGroup, false);
        }
        TextView dummyText = view.findViewById(R.id.text);
        String textName = arrayList.get(i).toString();
        dummyText.setText(textName);
        return view;
    }
}
