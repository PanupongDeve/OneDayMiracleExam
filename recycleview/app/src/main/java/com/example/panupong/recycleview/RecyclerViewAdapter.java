package com.example.panupong.recycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

public class RecyclerViewAdapter extends
        RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private List<Actor> mData = Collections.emptyList();
    private LayoutInflater mInflater;
    private ItemClickListener mItemClickListener;

    public RecyclerViewAdapter(Context context, List<Actor> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.row_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        viewHolder.setmItemClickListener(mItemClickListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public Actor getItem(int id) {
        return mData.get(id);
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mItemClickListener = itemClickListener;
    }
}
