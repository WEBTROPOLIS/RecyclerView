package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.databinding.WorditemlistBinding;

import java.util.List;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.WordViewHolder>{
    private List<String> mwordList;


    public WordAdapter(List<String> mwordList){
        this.mwordList= mwordList;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       WorditemlistBinding mBinding=WorditemlistBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new WordViewHolder(mBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        String  element = mwordList.get(position);
        holder.textView.setText(element);
    }

    @Override
    public int getItemCount() {
        return mwordList.size();
    }

    public class WordViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;
        public WordViewHolder(@NonNull WorditemlistBinding mBinding) {
            super(mBinding.getRoot());
            textView=mBinding.textView;


        }
    }
}
