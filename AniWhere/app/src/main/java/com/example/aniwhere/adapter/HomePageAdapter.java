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
import com.example.aniwhere.models.HomeProfileModels;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;

public class HomePageAdapter extends RecyclerView.Adapter<HomePageAdapter.ProfileViewHolder> {

    private Context context;
    private List<HomeProfileModels> homeProfileModelsList;

    public HomePageAdapter(Context context, List<HomeProfileModels> homeProfileModels) {
        this.context = context;
        this.homeProfileModelsList = homeProfileModelsList;
    }

    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.homepage_item, parent, false);
        return new ProfileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position) {
        HomeProfileModels homeProfileModels = homeProfileModelsList.get(position);

        holder.name.setText(homeProfileModels.getName());
        holder.username.setText(homeProfileModels.getUsername());

        holder.profileImage.setImageResource(homeProfileModels.getProfileImage());
        holder.image1.setImageResource(homeProfileModels.getImage1());
        holder.image2.setImageResource(homeProfileModels.getImage2());
        holder.image3.setImageResource(homeProfileModels.getImage3());
        holder.image4.setImageResource(homeProfileModels.getImage4());
        holder.image5.setImageResource(homeProfileModels.getImage5());


        holder.followBtn.setOnClickListener(v -> {

        });
        holder.likeBtn.setOnClickListener(v -> {

        });
        holder.commentBox.setOnClickListener(v -> {

        });
        holder.shareBtn.setOnClickListener(v -> {

        });
    }

    @Override
    public int getItemCount() {
        return homeProfileModelsList.size();
    }

    public static class ProfileViewHolder extends RecyclerView.ViewHolder {

        ShapeableImageView profileImage, image1, image2, image3, image4, image5;
        TextView name, username;
        Button followBtn;
        ImageView likeBtn, commentBox, shareBtn;

        public ProfileViewHolder(@NonNull View itemView) {
            super(itemView);
            profileImage = itemView.findViewById(R.id.profile_image);
            image1 = itemView.findViewById(R.id.image1);
            image2 = itemView.findViewById(R.id.image2);
            image3 = itemView.findViewById(R.id.image3);
            image4 = itemView.findViewById(R.id.image4);
            image5 = itemView.findViewById(R.id.image5);
            name = itemView.findViewById(R.id.name);
            username = itemView.findViewById(R.id.username);
            followBtn = itemView.findViewById(R.id.followbtn);
            likeBtn = itemView.findViewById(R.id.like_btn);
            commentBox = itemView.findViewById(R.id.comment_box);
            shareBtn = itemView.findViewById(R.id.share_btn);
        }
    }
}
