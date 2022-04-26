package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onMyButtonClick(View view)
    {
        // выводим сообщение
        int msg = 0;
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}