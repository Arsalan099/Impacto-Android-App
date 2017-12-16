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

public class Test extends AppCompatActivity {
    TextView qtv1,qtv2,qtv3,qtv4,qtv5;
    Button qb1,qb3;
    CheckBox qcb1,qcb2,qcb3,qcb4,qcb5,qcb6,qcb7,qcb8,qcb9,qcb10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        qb1=(Button)findViewById(R.id.qb1);
        qb3=(Button)findViewById(R.id.qb3);
        qcb1=(CheckBox)findViewById(R.id.qcb1);
        qcb2=(CheckBox)findViewById(R.id.qcb2);
        qcb3=(CheckBox)findViewById(R.id.qcb3);
        qcb4=(CheckBox)findViewById(R.id.qcb4);
        qcb5=(CheckBox)findViewById(R.id.qcb5);
        qcb6=(CheckBox)findViewById(R.id.qcb6);
        qcb7=(CheckBox)findViewById(R.id.qcb7);
        qcb8=(CheckBox)findViewById(R.id.qcb8);
        qcb9=(CheckBox)findViewById(R.id.qcb9);
        qcb10=(CheckBox)findViewById(R.id.qcb10);
        qtv1=(TextView) findViewById(R.id.qtv1);
        qtv2=(TextView) findViewById(R.id.qtv2);
        qtv3=(TextView) findViewById(R.id.qtv3);
        qtv4=(TextView) findViewById(R.id.qtv4);
        qtv5=(TextView) findViewById(R.id.qtv5);
        qcb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(b)
                {
                    //My checkbox is checked
                    Toast.makeText(Test.this,"Nooo..This answer is wrong..!!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //My checkbox is unchecked
                }
            }
        });
        qcb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(b)
                {
                    //My checkbox is checked
                    Toast.makeText(Test.this,"Yeah..This answer is right..!!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //My checkbox is unchecked
                }
            }
        });
        qcb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(b)
                {
                    //My checkbox is checked
                    Toast.makeText(Test.this,"Nooo..This answer is wrong..!!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //My checkbox is unchecked
                }
            }
        });
        qcb4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(b)
                {
                    //My checkbox is checked
                    Toast.makeText(Test.this,"Yeah..This answer is right..!!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //My checkbox is unchecked
                }
            }
        });
        qcb6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(b)
                {
                    //My checkbox is checked
                    Toast.makeText(Test.this,"Nooo..This answer is wrong..!!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //My checkbox is unchecked
                }
            }
        });
        qcb5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(b)
                {
                    //My checkbox is checked
                    Toast.makeText(Test.this,"Yeah..This answer is right..!!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //My checkbox is unchecked
                }
            }
        });
        qcb7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(b)
                {
                    //My checkbox is checked
                    Toast.makeText(Test.this,"Nooo..This answer is wrong..!!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //My checkbox is unchecked
                }
            }
        });
        qcb8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(b)
                {
                    //My checkbox is checked
                    Toast.makeText(Test.this,"Yeah..This answer is right..!!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //My checkbox is unchecked
                }
            }
        });
        qcb10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(b)
                {
                    //My checkbox is checked
                    Toast.makeText(Test.this,"Nooo..This answer is wrong..!!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //My checkbox is unchecked
                }
            }
        });
        qcb9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b){
                if(b)
                {
                    //My checkbox is checked
                    Toast.makeText(Test.this,"Yeah..This answer is right..!!",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    //My checkbox is unchecked
                }
            }
        });
        qb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s= new Intent(Test.this,Test2.class);
                startActivity(s);
            }
        });
        qb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s= new Intent(Test.this,MainActivity.class);
                startActivity(s);
            }
        });

    }
}
