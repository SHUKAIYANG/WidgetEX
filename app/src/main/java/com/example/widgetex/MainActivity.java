package com.example.widgetex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "main";
    private ImageButton imagebutton1, imagebutton2, imagebutton3, imagebutton4, imagebutton5, imagebutton6, imagebutton7, imagebutton8;
    private ImageView imageViewPic;
    private TextView textViewresult;
    private Context context;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        // 設定 imagebutton物件
        imagebutton1 = (ImageButton) findViewById(R.id.imageButton1);
        imagebutton2 = (ImageButton) findViewById(R.id.imageButton2);
        imagebutton3 = (ImageButton) findViewById(R.id.imageButton3);
        imagebutton4 = (ImageButton) findViewById(R.id.imageButton4);
        imagebutton5 = (ImageButton) findViewById(R.id.imageButton5);
        imagebutton6 = (ImageButton) findViewById(R.id.imageButton6);
        imagebutton7 = (ImageButton) findViewById(R.id.imageButton7);
        imagebutton8 = (ImageButton) findViewById(R.id.imageButton8);


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

            Intent intent = new Intent(context, DisplayActivity.class);

            switch (v.getId()){
                case R.id.imageButton1:
                    name = getResources().getString(R.string.imageButton1);
                    Log.d(TAG, "name = " + name);
                    intent.putExtra("title", name);
                    intent.putExtra("image", R.drawable.pic_1_b);
                    intent.putExtra("text", R.string.imageButton1_info);

                    break;

                case R.id.imageButton2:
                    name = getResources().getString(R.string.imageButton2);
                    Log.d(TAG, "name = " + name);
                    intent.putExtra("title", name);
                    intent.putExtra("image", R.drawable.pic_2_b);
                    intent.putExtra("text", R.string.imageButton2_info);

                    break;

                case R.id.imageButton3:
                    name = getResources().getString(R.string.imageButton3);
                    Log.d(TAG, "name = " + name);
                    intent.putExtra("title", name);
                    intent.putExtra("image", R.drawable.pic_3_b);
                    intent.putExtra("text", R.string.imageButton3_info);

                    break;

                case R.id.imageButton4:
                    name = getResources().getString(R.string.imageButton4);
                    Log.d(TAG, "name = " + name);
                    intent.putExtra("title", name);
                    intent.putExtra("image", R.drawable.pic_4_b);
                    intent.putExtra("text", R.string.imageButton4_info);

                    break;

                case R.id.imageButton5:
                    name = getResources().getString(R.string.imageButton5);
                    Log.d(TAG, "name = " + name);
                    intent.putExtra("title", name);
                    intent.putExtra("image", R.drawable.pic_5_b);
                    intent.putExtra("text", R.string.imageButton5_info);

                    break;

                case R.id.imageButton6:
                    name = getResources().getString(R.string.imageButton6);
                    Log.d(TAG, "name = " + name);
                    intent.putExtra("title", name);
                    intent.putExtra("image", R.drawable.pic_6_b);
                    intent.putExtra("text", R.string.imageButton6_info);
                    break;

                case R.id.imageButton7:
                    name = getResources().getString(R.string.imageButton7);
                    Log.d(TAG, "name = " + name);
                    intent.putExtra("title", name);
                    intent.putExtra("image", R.drawable.pic_7_b);
                    intent.putExtra("text", R.string.imageButton7_info);

                    break;

                case R.id.imageButton8:
                    name = getResources().getString(R.string.imageButton8);
                    Log.d(TAG, "name = " + name);
                    intent.putExtra("title", name);
                    intent.putExtra("image", R.drawable.pic_8_b);
                    intent.putExtra("text", R.string.imageButton8_info);

                    break;
            }

            startActivity(intent);

        }
    }
}
