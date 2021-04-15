package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class Home_Activity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    SearchView cari;
    private ListView list;
    private ListViewAdapter adapter;
    ArrayAdapter<String> adap;

    String[] listNama;

    public static ArrayList<ClassNama> classNamaArrayList = new ArrayList<ClassNama>();
    Bundle bundle = new Bundle();

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cari = findViewById(R.id.pencarian);
        listNama = new String[]{"inayah", "ilham", "eris","fikri","maul","intan",
                "vina","gita","vian","lutfi"};

        list = findViewById(R.id.listKontak);
        classNamaArrayList = new ArrayList<>();

        for(int i=0;i<listNama.length;i++){
            ClassNama classNama = new ClassNama(listNama[i]);
            classNamaArrayList.add(classNama);
        }

        adap = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1);

        cari.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adap.getFilter().filter(newText);
                return false;
            }
        });

       adapter = new ListViewAdapter(this,android.R.layout.simple_list_item_1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nama = classNamaArrayList.get(position).getName();

                bundle.putString("a",nama.trim());

                PopupMenu pm = new PopupMenu(getApplicationContext(),view);
                pm.setOnMenuItemClickListener(Home_Activity.this);
                pm.inflate(R.menu.popup_menu);
                pm.show();
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {

        switch (menuItem.getItemId())
        {
            case R.id.mnview:
                intent = new Intent(getApplicationContext(),ActivityLihatData.class);
                intent.putExtras(bundle);
                startActivity(intent);
                break;

            case R.id.mnedit:
                String nama = bundle.getString("a");
                if(nama.equals("inayah")){
                    Toast.makeText(getApplicationContext(),"1238929",Toast.LENGTH_LONG).show();}
                else if(nama.equals("ilham")){
                    Toast.makeText(getApplicationContext(),"243739",Toast.LENGTH_LONG).show();}
                else if(nama.equals("eris")){
                    Toast.makeText(getApplicationContext(),"32387923",Toast.LENGTH_LONG).show();}
                else if(nama.equals("fikri")){
                    Toast.makeText(getApplicationContext(),"4372732",Toast.LENGTH_LONG).show();}
                else if(nama.equals("maul")){
                    Toast.makeText(getApplicationContext(),"5983239",Toast.LENGTH_LONG).show();}
                else if(nama.equals("intan")){
                    Toast.makeText(getApplicationContext(),"623989832",Toast.LENGTH_LONG).show();}
                else if(nama.equals("vina")){
                    Toast.makeText(getApplicationContext(),"72399237",Toast.LENGTH_LONG).show();}
                else if(nama.equals("gita")){
                    Toast.makeText(getApplicationContext(),"8237323",Toast.LENGTH_LONG).show();}
                else if(nama.equals("vian")){
                    Toast.makeText(getApplicationContext(),"9238723",Toast.LENGTH_LONG).show();}
                else if(nama.equals("lutfi")){
                    Toast.makeText(getApplicationContext(),"10329832",Toast.LENGTH_LONG).show();}

        }

        return false;
    }
}