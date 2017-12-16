package vit.kelembakam.impacto;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Ivideo6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivideo6);
        VideoView videoview =(VideoView)findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoview);
        Uri uri = Uri.parse("rtsp://r1---sn-a5mekn7y.googlevideo.com/Cj0LENy73wIaNAkiljZH_OlLkhMYDSANFC268uNXMOCoAUIASARg1oPx7oSJ6uhXigELZ1QzSzBQZmlzdEkM/C39719316FCC4211EC101ACCD029611F07B996AB.3ABFA8D995DD81F94A955CBC0B3F56BA79C98702/yt6/1/video.3gp");
        videoview.setMediaController(mediaController);
        videoview.setVideoURI(uri);
        videoview.requestFocus();
        videoview.start();

    }
}
