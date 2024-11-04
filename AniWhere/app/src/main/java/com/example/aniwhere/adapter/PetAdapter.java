package com.example.aniwhere.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import com.example.aniwhere.R;
import com.example.aniwhere.models.PetModels;

public class PetAdapter extends RecyclerView.Adapter<PetAdapter.PetViewHolder> {

    private List<PetModels> petList;
    private Context context;

    public PetAdapter(Context context, List<PetModels> petList) {
        this.context = context;
        this.petList = petList;
    }

    @NonNull
    @Override
    public PetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adoption_item, parent, false);
        return new PetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PetViewHolder holder, int position) {
        PetModels currentPet = petList.get(position);
        holder.nameTextView.setText(currentPet.getName());
        holder.breedTextView.setText(currentPet.getBreed());
        holder.ageTextView.setText(currentPet.getAge());
        holder.locationTextView.setText(currentPet.getLocation());
        holder.actionImageView.setImageResource(currentPet.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return petList.size();
    }

    public static class PetViewHolder extends RecyclerView.ViewHolder {
        ImageView actionImageView;
        TextView nameTextView, breedTextView, ageTextView, locationTextView;

        public PetViewHolder(@NonNull View itemView) {
            super(itemView);
            actionImageView = itemView.findViewById(R.id.action_image);
            nameTextView = itemView.findViewById(R.id.name);
            breedTextView = itemView.findViewById(R.id.breed);
            ageTextView = itemView.findViewById(R.id.age);
            locationTextView = itemView.findViewById(R.id.location);
        }
    }
}
