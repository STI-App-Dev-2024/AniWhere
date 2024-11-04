package com.example.aniwhere.adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.compose.ui.graphics.Color;
import androidx.recyclerview.widget.RecyclerView;
import com.example.aniwhere.R;
import com.example.aniwhere.models.LostAndFoundModels;
import java.util.List;

public class LostAndFoundAdapter extends RecyclerView.Adapter<LostAndFoundAdapter.ViewHolder> {

    private List<LostAndFoundModels> animalList;

    public LostAndFoundAdapter(List<LostAndFoundModels> animalList) {
        this.animalList = animalList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lostandfound_item, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        LostAndFoundModels animal = animalList.get(position);
        holder.animalType.setText(animal.getType());
        holder.animalName.setText("Name: " + animal.getName());
        holder.animalGender.setText("Gender: " + animal.getGender());
        holder.animalLocation.setText(animal.getLocation());
        holder.lastSeen.setText("Last seen " + animal.getLastSeen());
        holder.status.setText(animal.getStatus());

        if (animal.getStatus().equalsIgnoreCase("lost")) {
            holder.status.setTextColor(holder.itemView.getContext().getResources().Color.parseColor("#721011"));
        } else {
            holder.status.setTextColor(holder.itemView.getContext().getResources().Color.parseColor("#705D3F"));
        }
        holder.petlostProfile.setImageResource(animal.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView animalType, animalName, animalGender, animalLocation, lastSeen, status;
        ImageView petlostProfile;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            animalType = itemView.findViewById(R.id.animalType);
            animalName = itemView.findViewById(R.id.animalName);
            animalGender = itemView.findViewById(R.id.animalGender);
            animalLocation = itemView.findViewById(R.id.animalLocation);
            lastSeen = itemView.findViewById(R.id.lastSeen);
            status = itemView.findViewById(R.id.status);
            petlostProfile = itemView.findViewById(R.id.petlostprofile);
        }
    }
}
