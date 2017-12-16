package vit.kelembakam.impacto;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    Button b21,b22,b221,b222,b223,b224,b23,b24,b25;
    EditText tv1,tv2;
    WebView wv1,wv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b21=(Button)findViewById(R.id.b21);
        b22=(Button)findViewById(R.id.b22);
        b221=(Button)findViewById(R.id.b221);
        b222=(Button)findViewById(R.id.b222);
        b223=(Button)findViewById(R.id.b223);
        b224=(Button)findViewById(R.id.b224);
        b23=(Button)findViewById(R.id.b23);
        b24=(Button)findViewById(R.id.b24);
        b25=(Button)findViewById(R.id.b25);
        tv1=(EditText)findViewById(R.id.tv1);
        tv2=(EditText)findViewById(R.id.tv2);
        tv1.setVisibility(View.GONE);
        tv2.setVisibility(View.GONE);
        b221.setVisibility(View.GONE);
        b222.setVisibility(View.GONE);
        b223.setVisibility(View.GONE);
        b224.setVisibility(View.GONE);
        wv1=(WebView)findViewById(R.id.wv1);
        wv1.setWebChromeClient(new WebChromeClient());
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.setWebViewClient(new WebViewClient());
        wv2=(WebView)findViewById(R.id.wv2);
        wv2.setWebChromeClient(new WebChromeClient());
        wv2.getSettings().setJavaScriptEnabled(true);
        wv2.setWebViewClient(new WebViewClient());
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s= new Intent(Main3Activity.this,MainActivity.class);
                startActivity(s);
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b221.setVisibility(View.VISIBLE);
                b222.setVisibility(View.VISIBLE);
                b22.setVisibility(View.GONE);
                b23.setVisibility(View.GONE);
                b24.setVisibility(View.GONE);
                b25.setVisibility(View.GONE);
                b221.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b222.setVisibility(View.GONE);
                        b221.setVisibility(View.GONE);
                        tv1.setVisibility(View.VISIBLE);
                        b223.setVisibility(View.VISIBLE);
                        b223.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String i = tv1.getText().toString();
                                wv1.loadUrl("https://translate.google.co.in/?biw=1366&bih=698&um=1&ie=UTF-8&hl=en&client=tw-ob#auto/es/"+i);
                            }
                        });
                    }
                });
                b222.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        b222.setVisibility(View.GONE);
                        b221.setVisibility(View.GONE);
                        tv2.setVisibility(View.VISIBLE);
                        b224.setVisibility(View.VISIBLE);
                        b224.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String i =tv2.getText().toString();
                                wv2.loadUrl("https://translate.google.co.in/?biw=1366&bih=698&um=1&ie=UTF-8&hl=en&client=tw-ob#es/en/"+i);
                            }
                        });

                    }
                });
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s= new Intent(Main3Activity.this,Tutorial.class);
                startActivity(s);

            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s= new Intent(Main3Activity.this,Test.class);
                startActivity(s);
            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(Main3Activity.this,IntVideo.class);
                startActivity(s);
            }
        });

    }
}
