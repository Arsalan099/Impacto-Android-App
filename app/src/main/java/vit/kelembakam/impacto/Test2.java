package vit.kelembakam.impacto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class Test2 extends AppCompatActivity {
    TextView qtv6,qtv7,qtv8,qtv9,qtv10;
    Button qb2,tb4;
    CheckBox qcb11,qcb12,qcb13,qcb14,qcb15,qcb16,qcb17,qcb18,qcb19,qcb20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        qb2=(Button)findViewById(R.id.qb2);
        tb4=(Button)findViewById(R.id.tb4);
        qcb11=(CheckBox)findViewById(R.id.qcb11);
        qcb12=(CheckBox)findViewById(R.id.qcb12);
        qcb13=(CheckBox)findViewById(R.id.qcb13);
        qcb14=(CheckBox)findViewById(R.id.qcb14);
        qcb15=(CheckBox)findViewById(R.id.qcb15);
        qcb16=(CheckBox)findViewById(R.id.qcb16);
        qcb17=(CheckBox)findViewById(R.id.qcb17);
        qcb18=(CheckBox)findViewById(R.id.qcb18);
        qcb19=(CheckBox)findViewById(R.id.qcb19);
        qcb20=(CheckBox)findViewById(R.id.qcb20);
        qtv6=(TextView) findViewById(R.id.qtv6);
        qtv7=(TextView) findViewById(R.id.qtv7);
        qtv8=(TextView) findViewById(R.id.qtv8);
        qtv9=(TextView) findViewById(R.id.qtv9);
        qtv10=(TextView) findViewById(R.id.qtv10);
        qcb12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(b)
                {
                    //My checkbox is checked
                    Toast.makeText(Test2.this,"Nooo..This answer is wrong..!!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //My checkbox is unchecked
                }
            }
        });
        qcb11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(b)
                {
                    //My checkbox is checked
                    Toast.makeText(Test2.this,"Yeah..This answer is right..!!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //My checkbox is unchecked
                }
            }
        });
        qcb14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(b)
                {
                    //My checkbox is checked
                    Toast.makeText(Test2.this,"Nooo..This answer is wrong..!!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //My checkbox is unchecked
                }
            }
        });
        qcb13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(b)
                {
                    //My checkbox is checked
                    Toast.makeText(Test2.this,"Yeah..This answer is right..!!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //My checkbox is unchecked
                }
            }
        });
        qcb15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(b)
                {
                    //My checkbox is checked
                    Toast.makeText(Test2.this,"Nooo..This answer is wrong..!!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //My checkbox is unchecked
                }
            }
        });
        qcb16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(b)
                {
                    //My checkbox is checked
                    Toast.makeText(Test2.this,"Yeah..This answer is right..!!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //My checkbox is unchecked
                }
            }
        });
        qcb18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(b)
                {
                    //My checkbox is checked
                    Toast.makeText(Test2.this,"Nooo..This answer is wrong..!!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //My checkbox is unchecked
                }
            }
        });
        qcb17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(b)
                {
                    //My checkbox is checked
                    Toast.makeText(Test2.this,"Yeah..This answer is right..!!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //My checkbox is unchecked
                }
            }
        });
        qcb19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(b)
                {
                    //My checkbox is checked
                    Toast.makeText(Test2.this,"Nooo..This answer is wrong..!!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //My checkbox is unchecked
                }
            }
        });
        qcb20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(b)
                {
                    //My checkbox is checked
                    Toast.makeText(Test2.this,"Yeah..This answer is right..!!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //My checkbox is unchecked
                }
            }
        });
        qb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s= new Intent(Test2.this,Test.class);
                startActivity(s);
            }
        });
        tb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s= new Intent(Test2.this,MainActivity.class);
                startActivity(s);
            }
        });
    }
}
