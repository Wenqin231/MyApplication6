package com.example.com.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by 文钦 on 2015/9/24.
 */
public class MyAdapter extends RecyclerView.Adapter<RecyclerViewHolder>{

    List<String> datas;
    public MyAdapter(List<String> datas){
        this.datas = datas;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.text,viewGroup,false);
        RecyclerViewHolder holder = new RecyclerViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder recyclerViewHolder, int i) {
        recyclerViewHolder.mTextView.setText(datas.get(i));
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
}
