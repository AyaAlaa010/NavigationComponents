package com.example.navigationcomponents;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class HomFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hom, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        HomFragmentArgs fragmentArgs=null;
        if(getArguments()!= null){

             fragmentArgs =HomFragmentArgs.fromBundle(getArguments());
            String email= fragmentArgs.getEmail();
            Toast.makeText(requireContext(),email,Toast.LENGTH_LONG).show();
            User user= fragmentArgs.getUser();
            System.out.println(user.getEmail()+" xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx "+user.getPassword());
        }
    }
}