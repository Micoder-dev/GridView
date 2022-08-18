package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class GridAdapter extends ArrayAdapter<GridModel> {

    public GridAdapter(@NonNull Context context, ArrayList<GridModel> gridModelArrayList) {
        super(context, 0, gridModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView = convertView;

        if (listitemView == null) {
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.grid_card_item, parent, false);
        }

        GridModel gridModel = getItem(position);
        TextView gridTitle = listitemView.findViewById(R.id.gridTextView);
        ImageView gridImage = listitemView.findViewById(R.id.gridImageView);

        gridTitle.setText(gridModel.getGridName());
        gridImage.setImageResource(gridModel.getGridImage());

        return listitemView;

    }

}
