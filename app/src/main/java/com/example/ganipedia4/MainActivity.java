package com.example.ganipedia4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


        public void home (View view){
            Intent home = new Intent(MainActivity.this, MainActivity.class);
            startActivity(home);
        }
        public void about (View view){
        Intent about = new Intent(MainActivity.this, AboutMe.class);
        startActivity(about);
    }


        public void contact (View view){
        String url = "https://api.whatsapp.com/send?phone=6283878624702";
        Intent wa = new Intent (Intent.ACTION_VIEW,Uri.parse(url));
        startActivity(wa);
        }

        public void project (View view){
        String url = "https://github.com/ganiramadhan";
        Intent github = new Intent (Intent.ACTION_VIEW,Uri.parse(url));
        startActivity(github);
        }

        public void exit (View view){
        finish();
        }



}
