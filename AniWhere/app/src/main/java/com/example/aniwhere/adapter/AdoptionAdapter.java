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
import com.example.aniwhere.models.AdoptionModels;
import com.example.aniwhere.models.AdoptionModels;

import java.util.List;

public class AdoptionAdapter extends RecyclerView.Adapter<AdoptionAdapter.AdoptionViewHolder> {

    private List<AdoptionModels> adoptionList;
    private Context context;

    public AdoptionAdapter(List<AdoptionModels> adoptionList, Context context) {
        this.adoptionList = adoptionList;
        this.context = context;
    }

    @NonNull
    @Override
    public AdoptionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adoption_item, parent, false);
        return new AdoptionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdoptionViewHolder holder, int position) {
        AdoptionModels model = adoptionList.get(position);
        holder.nameTextView.setText(model.getName());
        holder.breedTextView.setText(model.getBreed());
        holder.ageTextView.setText(model.getAge());
        holder.locationTextView.setText(model.getLocation());
        holder.imageView.setImageResource(model.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return adoptionList.size();
    }

    static class AdoptionViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameTextView;
        TextView breedTextView;
        TextView ageTextView;
        TextView locationTextView;

        public AdoptionViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            nameTextView = itemView.findViewById(R.id.name);
            breedTextView = itemView.findViewById(R.id.breed);
            ageTextView = itemView.findViewById(R.id.age);
            locationTextView = itemView.findViewById(R.id.location);
        }
    }
}
