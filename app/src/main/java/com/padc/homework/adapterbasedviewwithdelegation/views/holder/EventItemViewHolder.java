package com.padc.homework.adapterbasedviewwithdelegation.views.holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.padc.homework.adapterbasedviewwithdelegation.delegates.ItemViewTabDelegate;

public class EventItemViewHolder extends RecyclerView.ViewHolder {

    private ItemViewTabDelegate mItemViewTabDelegate;

    public EventItemViewHolder(@NonNull View itemView, ItemViewTabDelegate itemViewTabDelegate) {
        super(itemView);

        mItemViewTabDelegate = itemViewTabDelegate;

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mItemViewTabDelegate.onTabItemView();
            }
        });
    }
}
