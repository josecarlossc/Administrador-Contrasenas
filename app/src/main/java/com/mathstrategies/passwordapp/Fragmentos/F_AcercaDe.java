package com.mathstrategies.passwordapp.Fragmentos;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mathstrategies.passwordapp.R;


public class F_AcercaDe extends Fragment {

    Button Ir_terminos_politicas;
    Button Ir_sitio_web;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_f__acerca_de, container, false);


        Ir_terminos_politicas = view.findViewById(R.id.Ir_terminos_politicas);

        Ir_sitio_web = view.findViewById(R.id.Ir_sitio_web);


        Ir_terminos_politicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir_p_terminos_politicas = new Intent(Intent.ACTION_VIEW, Uri.parse("https://math-strategies.com/terminos-y-politicas-de-privacidad/"));
                startActivity(ir_p_terminos_politicas);
            }
        });

        Ir_sitio_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir_p_sitio_web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://math-strategies.com/"));
                startActivity(ir_p_sitio_web);
            }
        });

        return view;
    }
}