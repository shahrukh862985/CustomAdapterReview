package com.example.customadapterreview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Person> {

    public CustomAdapter(@NonNull Context context, ArrayList<Person> people) {
        //calling arrayadapter constructor
        super(context, 0,people);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View ItemView = convertView;
        if(ItemView == null)
        {
            ItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Person person = getItem(position);
        TextView txtname = (TextView) ItemView.findViewById(R.id.txtname);
        TextView txtnumber = (TextView) ItemView.findViewById(R.id.txtnumber);
        txtname.setText(person.getName());
        txtnumber.setText(person.getNumber());
        return ItemView;
    }
}
