package vit.kelembakam.impacto;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Ivideo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivideo1);
        VideoView videoview =(VideoView)findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoview);
        Uri uri = Uri.parse("rtsp://r3---sn-a5mekn7r.googlevideo.com/Cj0LENy73wIaNAn87DGvaBawRRMYDSANFC0B6uNXMOCoAUIASARg1oPx7oSJ6uhXigELZ1QzSzBQZmlzdEkM/DF002554EEAB5A74EE1B38F5EBE23C6CF0F47E3E.6AC4CED226C0803A3F2625CF567CBA35CE92A967/yt6/1/video.3gp");
        videoview.setMediaController(mediaController);
        videoview.setVideoURI(uri);
        videoview.requestFocus();
        videoview.start();

    }
}
