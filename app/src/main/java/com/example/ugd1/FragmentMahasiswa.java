package com.example.ugd1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ugd1.entity.Mahasiswa;

public class FragmentMahasiswa extends Fragment {


    public FragmentMahasiswa() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //  Proses menghubungkan layout fragment_mahasiswa.xml dengan fragment ini
        return inflater.inflate(R.layout.fragment_mahasiswa, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Menghubungkan rvMahasiswa dengan recycler view yang ada pada layout
        RecyclerView rvMahasiswa = view.findViewById(R.id.rv_mahasiswa);

        //  Set Layout Manager dari recycler view
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this.getContext(),LinearLayoutManager.VERTICAL,false));

        //  Set Adapter dari recycler view.
        rvMahasiswa.setAdapter(new RVMahasiswaAdapter(Mahasiswa.listOfMahasiswa));
    }
}