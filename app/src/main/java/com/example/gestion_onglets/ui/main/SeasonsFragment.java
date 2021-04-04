package com.example.gestion_onglets.ui.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gestion_onglets.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SeasonsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SeasonsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_SECTION_NUMBER = "numero_page";
    private static final String ARG_SECTION_IMAGE = "image_page1";
    private static final String ARG_SECTION_IMAGE2 = "image_page2";
    private static final String ARG_SECTION_TITLE = "titre_page";



    // TODO: Rename and change types of parameters
    private int image1;
    private int image2;

    public SeasonsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param seasons
     * @param param2 Parameter 2.
     * @param min
     * @param i
     * @param min1
     * @return A new instance of fragment SeasonsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SeasonsFragment newInstance(int param1, String seasons, int param2, int min, int i, int min1) {
        SeasonsFragment fragment = new SeasonsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, param1);
        args.putString(ARG_SECTION_TITLE, seasons);
        args.putInt(ARG_SECTION_IMAGE, param1);
        args.putInt(ARG_SECTION_IMAGE2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            image1 = getArguments().getInt(ARG_SECTION_IMAGE);
            image2 = getArguments().getInt(ARG_SECTION_IMAGE2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seasons, container, false);
    }
}