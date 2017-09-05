package com.example.aula_7.bottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bnv = (BottomNavigationView) findViewById(R.id.bnv_1);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.item1:
                        UnoFragment Pantalla1 = new UnoFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fl_1, Pantalla1)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        Toast.makeText(MainActivity.this, "Item 1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item2:
                        DosFragment Pantalla2 = new DosFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fl_1, Pantalla2)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        Toast.makeText(MainActivity.this, "Item 1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item3:
                        TresFragment Pantalla3 = new TresFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fl_1, Pantalla3)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        Toast.makeText(MainActivity.this, "Item 1", Toast.LENGTH_SHORT).show();
                        break;

                }

            return false;

            }
        });


    }
}
