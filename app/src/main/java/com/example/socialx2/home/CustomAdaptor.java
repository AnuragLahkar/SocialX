package com.example.socialx2.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.socialx2.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdaptor extends RecyclerView.Adapter<CustomViewHolder> {
    private Context context;
    private List<NewsHeadlines> headlines;

    public CustomAdaptor(Context context, List<NewsHeadlines> headlines) {
        this.context = context;
        this.headlines = headlines;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(context).inflate(R.layout.headline_list, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
    holder.title.setText(headlines.get(position).getTitle());
    holder.source.setText(headlines.get(position).getSource().getName());
        holder.des.setText(headlines.get(position).getDescription());
        holder.time.setText(headlines.get(position).getPublishedAt());

    if(headlines.get(position).getUrlToImage()!=null){
        Picasso.get().load(headlines.get(position).getUrlToImage()).into(holder.headlineImg);
    }
    }

    @Override
    public int getItemCount() {
        return headlines.size();
    }
}
