package com.example.socialx2.home;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.socialx2.R;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    TextView title, source, des,time;
    ImageView headlineImg;
    CardView cardView;
    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title);
        source = itemView.findViewById(R.id.source);
        des = itemView.findViewById(R.id.des);
        time = itemView.findViewById(R.id.time);
        headlineImg = itemView.findViewById(R.id.headlineImg);
        cardView = itemView.findViewById(R.id.container1);
    }
}
