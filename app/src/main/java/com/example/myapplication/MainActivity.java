package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.AnalyticsListener;
import com.androidnetworking.interfaces.DownloadListener;
import com.androidnetworking.interfaces.DownloadProgressListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;
    // we user ArrayList to populate data in RecyclerView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.rvdata);

        addData();

        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        //selesai ngatur data dari adapter, kemudian di tempel ke Recyclerview nya
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("BAHASA INDONESIA", "Jumlah Peserta : 15"));
        mahasiswaArrayList.add(new Mahasiswa("BAHASA INGGRIS", "Jumlah Peserta : 17"));
        mahasiswaArrayList.add(new Mahasiswa("MATEMATIKA", "Jumlah Peserta : 10"));
        Mahasiswa Sari = new Mahasiswa("IPA", "Jumlah Peserta : 13");
        Mahasiswa Anto = new Mahasiswa("SMK RADEN UMAR SAID", "Jumlah Peserta : 1035");
        Mahasiswa Budi = new Mahasiswa("BLOK PROGRAMMING", "Jumlah Peserta : 547");
        mahasiswaArrayList.add(Budi);
        mahasiswaArrayList.add(Sari);
        mahasiswaArrayList.add(Anto);
    }
}