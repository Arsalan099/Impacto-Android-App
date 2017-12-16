package vit.kelembakam.impacto;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Ivideo4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivideo4);
        VideoView videoview =(VideoView)findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoview);
        Uri uri = Uri.parse("rtsp://r5---sn-a5mekn7r.googlevideo.com/Cj0LENy73wIaNAmQO2vt11wV8hMYDSANFC2J8ONXMOCoAUIASARg1oPx7oSJ6uhXigELZ1QzSzBQZmlzdEkM/9565D17E806038B4EC70B64D80D71D79FB445E5A.71FCCD4AD7E2948810CF59F3CD029A3ED5C1586A/yt6/1/video.3gp");
        videoview.setMediaController(mediaController);
        videoview.setVideoURI(uri);
        videoview.requestFocus();
        videoview.start();

    }
}
