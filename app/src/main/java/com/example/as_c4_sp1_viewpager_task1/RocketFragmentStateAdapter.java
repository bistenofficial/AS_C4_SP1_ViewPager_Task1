package com.example.as_c4_sp1_viewpager_task1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

public class RocketFragmentStateAdapter extends FragmentStateAdapter
{
    private List<Rocket> rockets;

    public RocketFragmentStateAdapter(@NonNull FragmentActivity fragmentActivity)
    {
        super(fragmentActivity);
        this.rockets = this.insData();

    }

    private List<Rocket> insData()
    {

        Rocket emp1 = new Rocket("Falcon",100,"SpaceX", R.drawable.falcon);
        Rocket emp2 = new Rocket("Falcon Heavy",5,"SpaceX", R.drawable.falconheavy);

        List<Rocket> list = new ArrayList<Rocket>();
        list.add(emp1);
        list.add(emp2);
        return list;
    }
    @NonNull
    @Override
    public Fragment createFragment(int position)
    {
        Rocket rocket = this.rockets.get(position);
        return new RocketPageFragment(rocket);
    }

    @Override
    public int getItemCount()
    {
        return this.rockets.size();
    }
}
