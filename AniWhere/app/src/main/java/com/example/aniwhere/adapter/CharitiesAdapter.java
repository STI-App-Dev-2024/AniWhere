package com.example.aniwhere.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aniwhere.R;
import com.example.aniwhere.models.CharitiesModel;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;

public class CharitiesAdapter extends RecyclerView.Adapter<CharitiesAdapter.CharitiesViewHolder> {

    private List<CharitiesModel> charitiesList;
    private Context context;

    public CharitiesAdapter(Context context, List<CharitiesModel> charitiesList) {
        this.context = context;
        this.charitiesList = charitiesList;
    }

    @NonNull
    @Override
    public CharitiesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.charitiesanddonation_item, parent, false);
        return new CharitiesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CharitiesViewHolder holder, int position) {
        CharitiesModel charity = charitiesList.get(position);
        holder.name.setText(charity.getName());
        holder.username.setText(charity.getUsername());
        holder.description.setText(charity.getDescription());
        holder.profileImage.setImageResource(charity.getProfileImage());
        holder.image1.setImageResource(charity.getImage1());
        holder.image2.setImageResource(charity.getImage2());
    }

    @Override
    public int getItemCount() {
        return charitiesList.size();
    }

    public static class CharitiesViewHolder extends RecyclerView.ViewHolder {
        TextView name, username, description;
        ShapeableImageView profileImage, image1, image2;
        Button donateButton;
        ImageView pawLike, commentBox, shareIcon;

        public CharitiesViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            username = itemView.findViewById(R.id.username);
            description = itemView.findViewById(R.id.description);
            profileImage = itemView.findViewById(R.id.profile_image);
            image1 = itemView.findViewById(R.id.image1);
            image2 = itemView.findViewById(R.id.image2);
            donateButton = itemView.findViewById(R.id.Donate); //WALANG I.D charitiesanddonation_item
            pawLike = itemView.findViewById(R.id.paw_like);
            commentBox = itemView.findViewById(R.id.comment_box);
            shareIcon = itemView.findViewById(R.id.share_icon);
        }
    }
}
