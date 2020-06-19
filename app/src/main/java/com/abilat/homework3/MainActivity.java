package com.abilat.homework3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_settings:
                Toast.makeText(getApplicationContext(), "Настройки", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_seek:
                Toast.makeText(getApplicationContext(), "Поиск", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_Exit:
                finish();
                break;
            default:
                super.onOptionsItemSelected(item);
        }
        return true;
    }
}