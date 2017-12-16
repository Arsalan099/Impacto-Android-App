package vit.kelembakam.impacto;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Ivideo5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivideo6);
        VideoView videoview =(VideoView)findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoview);
        Uri uri = Uri.parse("rtsp://r6---sn-a5mekne7.googlevideo.com/Cj0LENy73wIaNAmLvhPYvceGfxMYDSANFC1i8uNXMOCoAUIASARg1oPx7oSJ6uhXigELZ1QzSzBQZmlzdEkM/69847D84096D9430144972F52F8C3A3DE88E8900.7DEC9428E2F7E6E6B88D648C6CF392903549BC54/yt6/1/video.3gp");
        videoview.setMediaController(mediaController);
        videoview.setVideoURI(uri);
        videoview.requestFocus();
        videoview.start();

    }
}
