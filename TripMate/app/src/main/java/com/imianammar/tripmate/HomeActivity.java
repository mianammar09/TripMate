package com.imianammar.tripmate;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.imianammar.tripmate.R;
import com.imianammar.tripmate.CityAdapter;
import com.imianammar.tripmate.City;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CityAdapter cityAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.city_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<City> cityList = generateCityList(); // Assume you have a method to generate city list
        cityAdapter = new CityAdapter(cityList);
        recyclerView.setAdapter(cityAdapter);
    }

    private List<City> generateCityList() {
        List<City> cityList = new ArrayList<>();
        cityList.add(new City("New York"));
        cityList.add(new City("Paris"));
        cityList.add(new City("Tokyo"));
        // Add more cities as needed
        return cityList;
    }
}
