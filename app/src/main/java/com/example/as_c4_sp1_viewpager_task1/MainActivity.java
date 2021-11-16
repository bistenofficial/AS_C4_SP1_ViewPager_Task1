package com.example.as_c4_sp1_viewpager_task1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager2Products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.viewPager2Products = findViewById(R.id.viewPager);

        RocketFragmentStateAdapter adapter = new RocketFragmentStateAdapter(this);
        this.viewPager2Products.setAdapter(adapter);
        this.viewPager2Products.setPageTransformer(new ZoomOutPageTransformer());
    }
}
