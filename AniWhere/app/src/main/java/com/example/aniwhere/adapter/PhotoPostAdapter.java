package com.example.aniwhere.adapter;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.aniwhere.R;
import java.util.List;

public class PhotoPostAdapter extends RecyclerView.Adapter<PhotoPostAdapter.PhotoViewHolder> {

    private final List<Uri> photoList;

    public PhotoPostAdapter(List<Uri> photoList) {
        this.photoList = photoList;
    }

    @NonNull
    @Override
    public PhotoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.postpage, parent, false);
        return new PhotoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhotoViewHolder holder, int position) {
        Uri photoUri = photoList.get(position);
        holder.photoImageView.setImageURI(photoUri);
    }

    @Override
    public int getItemCount() {
        return photoList.size();
    }

    static class PhotoViewHolder extends RecyclerView.ViewHolder {
        ImageView photoImageView;
        Button photoButton;

        public PhotoViewHolder(@NonNull View itemView) {
            super(itemView);
            photoButton = itemView.findViewById(R.id.addPhotosButton);
            photoButton.setOnClickListener(view -> {
            });
        }
    }
}
