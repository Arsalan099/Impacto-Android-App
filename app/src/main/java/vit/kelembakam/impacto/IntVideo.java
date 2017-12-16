package vit.kelembakam.impacto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntVideo extends AppCompatActivity {
    Button ib1,ib2,ib3,ib4,ib5,ib6,ib7,ib8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_int_video);
        ib1=(Button)findViewById(R.id.ib1);
        ib2=(Button)findViewById(R.id.ib2);
        ib3=(Button)findViewById(R.id.ib3);
        ib4=(Button)findViewById(R.id.ib4);
        ib5=(Button)findViewById(R.id.ib5);
        ib6=(Button)findViewById(R.id.ib6);
        ib7=(Button)findViewById(R.id.ib7);
        ib8=(Button)findViewById(R.id.ib8);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(IntVideo.this,Ivideo1.class);
                startActivity(s);
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(IntVideo.this,Ivideo2.class);
                startActivity(s);

            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(IntVideo.this,Ivideo3.class);
                startActivity(s);
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(IntVideo.this, Ivideo4.class);
                startActivity(s);
            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(IntVideo.this, Ivideo5.class);
                startActivity(s);
            }
        });
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(IntVideo.this, Ivideo6.class);
                startActivity(s);
            }
        });
        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(IntVideo.this, Ivideo7.class);
                startActivity(s);
            }
        });
        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(IntVideo.this, Ivideo8.class);
                startActivity(s);
            }
        });
    }
}
