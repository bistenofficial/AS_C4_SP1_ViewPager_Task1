package com.example.as_c4_sp1_viewpager_task1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RocketPageFragment extends Fragment
{
    private Rocket rocket;
    private TextView textViewRocket;
    private TextView textViewPosition;
    private TextView textViewName;
    private ImageView imageView;
    private static int counter = 0;

    public RocketPageFragment()
    {

    }
    public RocketPageFragment(Rocket rocket) {
        this.rocket=rocket;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = (ViewGroup) inflater.inflate(
                R.layout.fragment_employee_page, container, false);

        this.textViewName = view.findViewById(R.id.textView_fullName);
        this.textViewPosition = view.findViewById(R.id.textView_position);
        this.textViewRocket = view.findViewById(R.id.textView_rocket);
        this.imageView = view.findViewById(R.id.imageView);
        return view;
    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState){

        Bundle dataBundle = this.employeeToBundle(this.rocket);
        outState.putAll(dataBundle);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onViewStateRestored(@NonNull Bundle savedInstanceState)
    {
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        if(this.rocket == null)
            this.rocket = this.bundleToEmployee(savedInstanceState);
        this.showInGUI(this.rocket);
    }

    private void showInGUI(Rocket rocket)
    {
        this.textViewName.setText(rocket.getName());
        this.textViewPosition.setText(rocket.getNameCompany());
        this.textViewRocket.setText(String.valueOf(rocket.getLaunch()));
        this.imageView.setImageResource(rocket.getImg());
    }

    private  Bundle employeeToBundle(Rocket rocket)
    {
        Bundle bundle = new Bundle();
        bundle.putString("Name", rocket.getName());
        bundle.putString("NameCompany", rocket.getNameCompany());
        bundle.putInt("launch", rocket.getLaunch());
        bundle.putInt("image", rocket.getImg());
        return  bundle;
    }

    private  Rocket bundleToEmployee(Bundle savedInstanceState)
    {
        String fullName = savedInstanceState.getString("Name");
        String position = savedInstanceState.getString("NameCompany");
        int launch = savedInstanceState.getInt("launch");
        int image = savedInstanceState.getInt("image");
        return new Rocket(fullName, launch, position, image);
    }
}
