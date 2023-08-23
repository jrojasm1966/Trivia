package com.example.trivia;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.trivia.databinding.FragmentLogoTriviaBinding;


public class LogoTriviaFragment extends Fragment {

  FragmentLogoTriviaBinding binding;


  // ESTE PARÁMETRO SE DEBE RECIBIR  CON EL MISMO NOMBRE DE LA CLAVE QUE SE ENVIA
    // DESDE EL OTRO FRAGMENTO
    private static final String ARG_PARAM1 = "clave1";



    private String mParam1;


    public LogoTriviaFragment() {
        // Required empty public constructor
    }


    public static LogoTriviaFragment newInstance(String param1, String param2) {
        LogoTriviaFragment fragment = new LogoTriviaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLogoTriviaBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        String greeting = getString(R.string.greeting,mParam1);
        binding.triviaNameTv.setText(greeting);


        return  view;

    }
}