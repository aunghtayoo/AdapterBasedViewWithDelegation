package com.padc.homework.adapterbasedviewwithdelegation.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.padc.homework.adapterbasedviewwithdelegation.R;
import com.padc.homework.adapterbasedviewwithdelegation.adapters.RecyclerViewAdapter;
import com.padc.homework.adapterbasedviewwithdelegation.delegates.ItemViewTabDelegate;

public class MainActivity extends AppCompatActivity implements ItemViewTabDelegate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencing Recycler View
        RecyclerView recyclerView = findViewById(R.id.rv_event);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayout.VERTICAL, false));

        //Set adapter
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onTabItemView() {
        Intent intent = intentDetail(getApplicationContext());
        startActivity(intent);
    }

    private static Intent intentDetail(Context context){
        Intent intent = new Intent(context, DetailActivity.class);
        return intent;
    }
}
