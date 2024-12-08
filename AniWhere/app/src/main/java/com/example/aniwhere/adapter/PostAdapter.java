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
import com.example.aniwhere.models.PostModel;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    private final Context context;
    private final List<PostModel> postList;

    public PostAdapter(Context context, List<PostModel> postList) {
        this.context = context;
        this.postList = postList;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.homepage_item, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        PostModel post = postList.get(position);

        holder.nameTextView.setText(post.getName());
        holder.descriptionTextView.setText(post.getDescription());
        holder.profileImageView.setImageResource(post.getProfileImage());


        List<Integer> galleryImages = post.getGalleryImages();
        if (galleryImages.size() >= 1) {
            holder.mainImage.setImageResource(galleryImages.get(0));
        }
        if (galleryImages.size() >= 2) {
            holder.subImage1.setImageResource(galleryImages.get(1));
        }
        if (galleryImages.size() >= 3) {
            holder.subImage2.setImageResource(galleryImages.get(2));
        }
        if (galleryImages.size() >= 4) {
            holder.subImage3.setImageResource(galleryImages.get(3));
        }
        if (galleryImages.size() >= 5) {
            holder.subImage4.setImageResource(galleryImages.get(4));
        }
    }
    @Override
    public int getItemCount() {
        return postList.size();
    }

    public static class PostViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView, descriptionTextView;
        ShapeableImageView profileImageView, mainImage, subImage1, subImage2, subImage3, subImage4;
        Button followButton;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            profileImageView = itemView.findViewById(R.id.profile_image);
            nameTextView = itemView.findViewById(R.id.name_text);
            descriptionTextView = itemView.findViewById(R.id.description_text);
            followButton = itemView.findViewById(R.id.followBtn);
            mainImage = itemView.findViewById(R.id.main_image);
            subImage1 = itemView.findViewById(R.id.sub_image1);
            subImage2 = itemView.findViewById(R.id.sub_image2);
            subImage3 = itemView.findViewById(R.id.sub_image3);
            subImage4 = itemView.findViewById(R.id.sub_image4);
        }
    }
}
