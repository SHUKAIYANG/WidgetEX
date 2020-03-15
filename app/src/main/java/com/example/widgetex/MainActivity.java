package com.example.widgetex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton imagebutton1, imagebutton2, imagebutton3, imagebutton4, imagebutton5, imagebutton6, imagebutton7, imagebutton8;
    private ImageView imageViewPic;
    private TextView textViewresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 設定 imagebutton物件
        imagebutton1 = (ImageButton) findViewById(R.id.imageButton1);
        imagebutton2 = (ImageButton) findViewById(R.id.imageButton2);
        imagebutton3 = (ImageButton) findViewById(R.id.imageButton3);
        imagebutton4 = (ImageButton) findViewById(R.id.imageButton4);
        imagebutton5 = (ImageButton) findViewById(R.id.imageButton5);
        imagebutton6 = (ImageButton) findViewById(R.id.imageButton6);
        imagebutton7 = (ImageButton) findViewById(R.id.imageButton7);
        imagebutton8 = (ImageButton) findViewById(R.id.imageButton8);

        imageViewPic = (ImageView) findViewById(R.id.imageView_pic);

        imageViewPic.setVisibility(View.INVISIBLE);

        textViewresult = (TextView) findViewById(R.id.textView_result);

        textViewresult.setText("");

        // 監聽 imagebutton
        imagebutton1.setOnClickListener(new MyClick());
        imagebutton2.setOnClickListener(new MyClick());
        imagebutton3.setOnClickListener(new MyClick());
        imagebutton4.setOnClickListener(new MyClick());
        imagebutton5.setOnClickListener(new MyClick());
        imagebutton6.setOnClickListener(new MyClick());
        imagebutton7.setOnClickListener(new MyClick());
        imagebutton8.setOnClickListener(new MyClick());

    }


    private class MyClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.imageButton1:
                    imageViewPic.setVisibility(View.VISIBLE);
                    imageViewPic.setImageResource(R.drawable.pic_1_b);
                    textViewresult.setText("This is image 1.");
                    break;

                case R.id.imageButton2:
                    imageViewPic.setVisibility(View.VISIBLE);
                    imageViewPic.setImageResource(R.drawable.pic_2_b);
                    textViewresult.setText("This is image 2.");
                    break;

                case R.id.imageButton3:
                    imageViewPic.setVisibility(View.VISIBLE);
                    imageViewPic.setImageResource(R.drawable.pic_3_b);
                    textViewresult.setText("This is image 3.");
                    break;

                case R.id.imageButton4:
                    imageViewPic.setVisibility(View.VISIBLE);
                    imageViewPic.setImageResource(R.drawable.pic_4_b);
                    textViewresult.setText("This is image 4.");
                    break;

                case R.id.imageButton5:
                    imageViewPic.setVisibility(View.VISIBLE);
                    imageViewPic.setImageResource(R.drawable.pic_5_b);
                    textViewresult.setText("This is image 5.");
                    break;

                case R.id.imageButton6:
                    imageViewPic.setVisibility(View.VISIBLE);
                    imageViewPic.setImageResource(R.drawable.pic_6_b);
                    textViewresult.setText("This is image 6.");
                    break;

                case R.id.imageButton7:
                    imageViewPic.setVisibility(View.VISIBLE);
                    imageViewPic.setImageResource(R.drawable.pic_7_b);
                    textViewresult.setText("This is image 7.");
                    break;

                case R.id.imageButton8:
                    imageViewPic.setVisibility(View.VISIBLE);
                    imageViewPic.setImageResource(R.drawable.pic_8_b);
                    textViewresult.setText("This is image 8.");
                    break;
            }

        }
    }
}
