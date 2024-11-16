package com.example.aniwhere.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aniwhere.R;
import com.example.aniwhere.models.LostAndFoundModels;

import java.util.List;

public class LostAndFoundAdapter extends RecyclerView.Adapter<LostAndFoundAdapter.LostAndFoundViewHolder> {

    private Context context;
    private List<LostAndFoundModels> lostAndFoundModels;

    public LostAndFoundAdapter(Context context, List<LostAndFoundModels> lostAndFoundModels) {
        this.context = context;
        this.lostAndFoundModels = lostAndFoundModels;
    }

    @NonNull
    @Override
    public LostAndFoundViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.lostandfound_item, parent, false);
        return new LostAndFoundViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LostAndFoundViewHolder holder, int position) {
        LostAndFoundModels item = lostAndFoundModels.get(position);
        holder.petImage.setImageResource(item.getImageResource());
        holder.type.setText(item.getType());
        holder.breed.setText(item.getBreed());
        holder.name.setText("Name: " + item.getName());
        holder.sex.setText("Sex: " + item.getSex());
        holder.location.setText(item.getLocation());
        holder.lastSeen.setText("Last seen: " + item.getLastSeen());
    }

    @Override
    public int getItemCount() {
        return lostAndFoundModels.size();
    }

    public static class LostAndFoundViewHolder extends RecyclerView.ViewHolder {

        ImageView petImage;
        TextView type, breed, name, sex, location, lastSeen;

        public LostAndFoundViewHolder(View itemView) {
            super(itemView);
            petImage = itemView.findViewById(R.id.imagelnf);
            type = itemView.findViewById(R.id.type);
            breed = itemView.findViewById(R.id.breed);
            name = itemView.findViewById(R.id.name);
            sex = itemView.findViewById(R.id.sex);
            location = itemView.findViewById(R.id.location);
            lastSeen = itemView.findViewById(R.id.lastseen);
        }
    }
}
