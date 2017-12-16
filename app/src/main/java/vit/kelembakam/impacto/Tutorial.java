package vit.kelembakam.impacto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tutorial extends AppCompatActivity {
    Button tub1,tub2,tub3,tub4,tub5,hb1,tub7,tub8,tub9,tub10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        tub1=(Button)findViewById(R.id.tub1);
        tub2=(Button)findViewById(R.id.tub2);
        tub3=(Button)findViewById(R.id.tub3);
        tub4=(Button)findViewById(R.id.tub4);
        tub5=(Button)findViewById(R.id.tub5);
        hb1=(Button)findViewById(R.id.hb1);
        tub7=(Button)findViewById(R.id.tub7);
        tub8=(Button)findViewById(R.id.tub8);
        tub9=(Button)findViewById(R.id.tub9);
        tub10=(Button)findViewById(R.id.tub10);
        hb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s= new Intent(Tutorial.this,MainActivity.class);
                startActivity(s);
            }
        });
        tub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s= new Intent(Tutorial.this,Ttut1.class);
                startActivity(s);
            }
        });
        tub7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s= new Intent(Tutorial.this,ttut2.class);
                startActivity(s);
            }
        });
        tub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s= new Intent(Tutorial.this,Ttut3.class);
                startActivity(s);
            }
        });
        tub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s= new Intent(Tutorial.this,Ttut4.class);
                startActivity(s);
            }
        });
        tub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s= new Intent(Tutorial.this,Ttut5.class);
                startActivity(s);
            }
        });
        tub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s= new Intent(Tutorial.this,Ttut6.class);
                startActivity(s);
            }
        });
        tub8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s= new Intent(Tutorial.this,Ttut7.class);
                startActivity(s);
            }
        });
        tub9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s= new Intent(Tutorial.this,Ttut8.class);
                startActivity(s);
            }
        });
        tub10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s= new Intent(Tutorial.this,Ttut10.class);
                startActivity(s);
            }
        });

    }
}
