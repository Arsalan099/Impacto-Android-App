package vit.kelembakam.impacto;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Ivideo7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivideo8);
        VideoView videoview =(VideoView)findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoview);
        Uri uri = Uri.parse("rtsp://r2---sn-a5m7zne7.googlevideo.com/Cj0LENy73wIaNAkpqf57RggC3xMYDSANFC2k9ONXMOCoAUIASARg1oPx7oSJ6uhXigELZ1QzSzBQZmlzdEkM/68230483D88463387FFD098F73627EAE20F38BB5.9084374E3D701092251F19509A70565B04EA4E59/yt6/1/video.3gp");
        videoview.setMediaController(mediaController);
        videoview.setVideoURI(uri);
        videoview.requestFocus();
        videoview.start();

    }
}
