package com.example.com.myapplication;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 文钦 on 2015/9/24.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    public TextView mTextView;
    public RecyclerViewHolder(View itemView) {
        super(itemView);

        mTextView = (TextView) itemView.findViewById(R.id.content);
    }
}
