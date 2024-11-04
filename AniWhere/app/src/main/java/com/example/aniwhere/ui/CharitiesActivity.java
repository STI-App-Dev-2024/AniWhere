// CharitiesActivity.java
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aniwhere.R;
import com.example.aniwhere.adapter.CharitiesAdapter;
import com.example.aniwhere.models.CharitiesModel;

import java.util.ArrayList;
import java.util.List;

public class CharitiesActivity extends AppCompatActivity {

    private RecyclerView charitiesRecyclerView;
    private CharitiesAdapter charitiesAdapter;
    private List<CharitiesModel> charitiesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.charitiesanddonation_item);

        charitiesRecyclerView = findViewById(R.id.charatiesrecycler_view);
        charitiesRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize and set up data for the RecyclerView
        charitiesList = new ArrayList<>();
        loadCharitiesData();
        charitiesAdapter = new CharitiesAdapter(this, charitiesList);
        charitiesRecyclerView.setAdapter(charitiesAdapter);
    }

    private void loadCharitiesData() {
        charitiesList.add(new CharitiesModel("Charity 1", "user1", "Helping kids in need",
                R.drawable.profile_image, R.drawable.image1, R.drawable.image2));
        charitiesList.add(new CharitiesModel("Charity 2", "user2", "Providing education support",
                R.drawable.profile_image, R.drawable.image1, R.drawable.image2));
        // Add more charity items as needed
    }
}
