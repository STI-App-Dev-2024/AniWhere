import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aniwhere.R;
import com.google.android.material.imageview.ShapeableImageView;

public class HomePageItem extends AppCompatActivity {

    private ShapeableImageView profileImage, mainImage, subImage1, subImage2, subImage3, subImage4;
    private TextView profileName, subTitle;
    private Button followButton;
    private ImageView likeIcon, commentIcon, shareIcon;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage_item);

        profileImage = findViewById(R.id.profile_image);
        mainImage = findViewById(R.id.main_image);
        subImage1 = findViewById(R.id.sub_image1);
        subImage2 = findViewById(R.id.sub_image2);
        subImage3 = findViewById(R.id.sub_image3);
        subImage4 = findViewById(R.id.sub_image4);

        profileName = findViewById(R.id.profile_name);
        subTitle = findViewById(R.id.sub_title);

        followButton = findViewById(R.id.follow_button);
        likeIcon = findViewById(R.id.like_icon);
        commentIcon = findViewById(R.id.comment_icon);
        shareIcon = findViewById(R.id.share_icon);


        followButton.setOnClickListener(view -> Toast.makeText(this, "Followed", Toast.LENGTH_SHORT).show());
        likeIcon.setOnClickListener(view -> Toast.makeText(this, "Liked!", Toast.LENGTH_SHORT).show());
        commentIcon.setOnClickListener(view -> Toast.makeText(this, " ", Toast.LENGTH_SHORT).show());
        shareIcon.setOnClickListener(view -> Toast.makeText(this, "Shared post", Toast.LENGTH_SHORT).show());
    }
}
