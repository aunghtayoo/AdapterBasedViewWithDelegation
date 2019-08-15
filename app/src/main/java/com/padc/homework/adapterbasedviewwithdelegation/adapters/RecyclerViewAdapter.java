package com.padc.homework.adapterbasedviewwithdelegation.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padc.homework.adapterbasedviewwithdelegation.R;
import com.padc.homework.adapterbasedviewwithdelegation.delegates.ItemViewTabDelegate;
import com.padc.homework.adapterbasedviewwithdelegation.views.holder.EventItemViewHolder;

public class RecyclerViewAdapter extends RecyclerView.Adapter {

    private ItemViewTabDelegate mItemViewTabDelegate;

    public RecyclerViewAdapter(ItemViewTabDelegate mItemViewTabDelegate) {
        this.mItemViewTabDelegate = mItemViewTabDelegate;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View viewHolder = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_car_info, parent,false);
        return new EventItemViewHolder(viewHolder, mItemViewTabDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
