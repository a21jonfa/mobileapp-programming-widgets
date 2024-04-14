package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView imageView;
    TextView textView;
    RatingBar ratingbar;
    Integer i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        ratingbar = findViewById(R.id.ratingBar);
        i=0;
        button.setOnClickListener(v -> {
            button.setText("Button Clicked "+i+" times");
            i++;
            ratingbar.setRating(0f);
            CycleImage();
        });
            ratingbar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {
                textView.setText("Thanks for giving the picture: "+rating);
        });
    }

    public void CycleImage() {
        imageView = findViewById(R.id.imageView);
        Random random = new Random();
        int i = random.nextInt(3);
        if (i == 0)
            imageView.setImageResource(R.drawable.butteryfly_other_side);
        else if (i == 1)
            imageView.setImageResource(R.drawable.butteryfly_side);
        else if (i == 2)
            imageView.setImageResource(R.drawable.ic_action_name);
    }
}

