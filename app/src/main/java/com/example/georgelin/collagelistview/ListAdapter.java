package com.example.georgelin.collagelistview;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by georgelin on 11/14/14.
 */
public class ListAdapter extends ArrayAdapter<Album> {

    int mResourceId[] = new int[] {
            R.layout.list_item_3_1,
            R.layout.list_item_4_1,
            R.layout.list_item_4_2,
            R.layout.list_item_5_1,
            R.layout.list_item_6_1
    };
    int mPhotoNum[] = new int[] {
            3,
            4,
            4,
            5,
            6
    };

    public ListAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        int mRan = 1;

        LayoutHolder holder;

        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(mResourceId[mRan],
                    parent, false);
            holder = new LayoutHolder();
            holder.mTitle = (TextView) convertView.findViewById(R.id.tv_title);
            for (int i = 0; i < mPhotoNum[mRan]; i++) {
                String strSource = "iv" + i;
                // Find resource id by string
                int resourceId = getContext().getResources().getIdentifier(strSource,
                        "id",
                        "com.example.georgelin.collagelistview");
                holder.mPhotos[i] = (ImageView) convertView.findViewById(resourceId);
            }
            convertView.setTag(holder);
        }

        holder = (LayoutHolder) convertView.getTag();

        holder.mTitle.setText(getItem(position).getTitle());

        for (int i = 0; i < mPhotoNum[mRan]; i++) {
            holder.mPhotos[i].setImageResource(R.drawable.ic_launcher);
        }

        return convertView;

    }

    private static class LayoutHolder {

        TextView mTitle;
        ImageView[] mPhotos = new ImageView[6];

    }
}
