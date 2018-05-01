package com.example.bugra.mapzz;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class layout extends Activity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        ImageView image=(ImageView)findViewById(R.id.imageView);
        image.setImageResource(R.drawable.profil);

        ImageButton img=(ImageButton) findViewById(R.id.imageButton);
        img.setImageResource(R.drawable.mesaj);

        ImageButton img2=(ImageButton) findViewById(R.id.imageButton2);
        img2.setImageResource(R.drawable.atac);

        ImageButton img3=(ImageButton) findViewById(R.id.imageButton4);
        img3.setImageResource(android.R.drawable.ic_menu_edit);

        ImageView image2=(ImageView)findViewById(R.id.imageView10);
        image2.setImageResource(R.drawable.profil);

        ImageView image3=(ImageView)findViewById(R.id.imageView11);
        image3.setImageResource(R.drawable.profil);

        ImageView image4=(ImageView)findViewById(R.id.imageView13);
        image4.setImageResource(R.drawable.profil);

        ImageView image5=(ImageView)findViewById(R.id.imageView15);
        image5.setImageResource(R.drawable.profil);

    }
}