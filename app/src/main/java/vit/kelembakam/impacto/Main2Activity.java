package vit.kelembakam.impacto;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        VideoView videoview =(VideoView)findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoview);
        Uri uri = Uri.parse("rtsp://r2---sn-a5mlrn7s.googlevideo.com/Cj0LENy73wIaNAnWuFE8i34wlRMYDSANFC2JAORXMOCoAUIASARg1oPx7oSJ6uhXigELZ1QzSzBQZmlzdEkM/C3D517BDE6F2F168100E961780C50C1F81D25ADD.B672C4591D25B38B1DF200137B7AEF714ABB2C22/yt6/1/video.3gp");
        videoview.setMediaController(mediaController);
        videoview.setVideoURI(uri);
        videoview.requestFocus();
        videoview.start();
    }
}
