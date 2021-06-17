package com.example.tarea8;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MenuSuperiorBotones#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MenuSuperiorBotones extends Fragment {



    public MenuSuperiorBotones() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_superior_botones, container, false);
    }

    public void irACalculadora(View v) {

    }

    public void irAWebview(View v) {

    }
}