package com.oo76.stu.adapter;

import com.oo76.stu.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.oo76.stu.ProfileItem;

import java.util.List;

public class ProfileAdapter extends BaseAdapter {
    private Activity activity;
    private List<ProfileItem> items;

    public ProfileAdapter(Activity activity, List<ProfileItem> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = activity.getLayoutInflater();
            convertView = inflater.inflate(R.layout.list_item_profile, parent, false);
        }

        ImageView icon = convertView.findViewById(R.id.itemImage);
        TextView title = convertView.findViewById(R.id.itemTitle);
        TextView value = convertView.findViewById(R.id.itemValue);

        ProfileItem item = items.get(position);
        icon.setImageResource(item.getImageResId());
        title.setText(item.getTitle());
        value.setText(item.getValue());

        return convertView;
    }
}