package com.example.aniwhere.adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.aniwhere.R;
import com.example.aniwhere.models.CharitiesModel;

import java.util.List;

public class CharitiesAdapter extends RecyclerView.Adapter<CharitiesAdapter.CharityViewHolder> {

    private List<CharitiesModel> charitiesModel;

    public CharitiesAdapter(List<CharitiesModel> charitiesModel) {
        this.charitiesModel = charitiesModel;
    }

    @Override
    public CharityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.charitiesanddonation_item, parent, false);
        return new CharityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CharityViewHolder holder, int position) {
        CharitiesModel item = charitiesModel.get(position);

        holder.nameTextView.setText(item.getName());
        holder.usernameTextView.setText(item.getUsername());
        holder.descriptionTextView.setText(item.getDescription());

        Glide.with(holder.itemView.getContext())
                .load(item.getProfileImageUrl())
                .into(holder.profileImageView);

        holder.donateButton.setOnClickListener(v -> {

        });
    }

    @Override
    public int getItemCount() {
        return charitiesModel.size();
    }

    public static class CharityViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView, usernameTextView, descriptionTextView;
        ImageView profileImageView;
        Button donateButton;

        public CharityViewHolder(View itemView) {
            super(itemView);
            profileImageView = itemView.findViewById(R.id.profile_image);
            nameTextView = itemView.findViewById(R.id.name);
            usernameTextView = itemView.findViewById(R.id.username);
            descriptionTextView = itemView.findViewById(R.id.description);
            donateButton = itemView.findViewById(R.id.donate_btn);
        }
    }
}
