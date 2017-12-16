package vit.kelembakam.impacto;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Ivideo2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivideo2);
        VideoView videoview =(VideoView)findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoview);
        Uri uri = Uri.parse("rtsp://r4---sn-a5mlrn7s.googlevideo.com/Cj0LENy73wIaNAkaLmLqj6NQaxMYDSANFC2h6uNXMOCoAUIASARg1oPx7oSJ6uhXigELZ1QzSzBQZmlzdEkM/7D079939D1B4CEBD6792A788D0F0DE6FFB677565.9FA7ED246792601D0D088830847E64EFAC335CAB/yt6/1/video.3gp");
        videoview.setMediaController(mediaController);
        videoview.setVideoURI(uri);
        videoview.requestFocus();
        videoview.start();
    }
}
