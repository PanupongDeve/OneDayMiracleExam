package com.example.panupong.recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    protected TextView tvName;
    protected ImageView ivResId;
    private ItemClickListener mItemClickListener;
    public ViewHolder(View itemView) {
        super(itemView);
        tvName = (TextView) itemView.findViewById(R.id.tvName);
        ivResId = (ImageView) itemView.findViewById(R.id.ivResId);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(mItemClickListener != null) {
            mItemClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    public void setmItemClickListener(ItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }
}
