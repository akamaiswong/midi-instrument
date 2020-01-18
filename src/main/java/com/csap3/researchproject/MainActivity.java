package com.csap3.researchproject;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;




public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Wire the button to do things.
        //1. Get the button.
        ImageButton btn = (ImageButton) findViewById(R.id.imageButton);
        //2. Set what happens when the user clicks.
        final MediaPlayer mpa = MediaPlayer.create(this, R.raw.pianoa);
        final MediaPlayer mpb = MediaPlayer.create(this, R.raw.pianob);
        final MediaPlayer mpc = MediaPlayer.create(this, R.raw.pianoc);
        final MediaPlayer mpd = MediaPlayer.create(this, R.raw.pianod);
        final MediaPlayer mpe = MediaPlayer.create(this, R.raw.pianoe);
        final MediaPlayer mpf = MediaPlayer.create(this, R.raw.pianof);
        final MediaPlayer mpg = MediaPlayer.create(this, R.raw.pianog);
        //btn.setOnClickListener(new View.OnClickListener() {
            //public void onClick(View v)
            //{
            //    mpa.start();
            //}
        //});

        Button playa = (Button) findViewById(R.id.button);
        playa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpa.start();
            }
        });

        Button playb = (Button) findViewById(R.id.button2);
        playb.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                mpb.start();
            }
        });


        Button playc = (Button) findViewById(R.id.button3);
        playc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                mpc.start();
            }
        });

        Button playd = (Button) findViewById(R.id.button4);
        playd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                mpd.start();
            }
        });

        Button playe = (Button) findViewById(R.id.button5);
        playe.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                mpe.start();
            }
        });

        Button playf = (Button) findViewById(R.id.button6);
        playf.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                mpf.start();
            }
        });

        Button playg = (Button) findViewById(R.id.button7);
        playg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                mpg.start();
            }
        });



        //btn.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View v) {
             //   Log.i("MyApp", "This is a log message!");
            //}
        //});

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.pianoa);
        //mediaPlayer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.stop();
        mediaPlayer.release();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
