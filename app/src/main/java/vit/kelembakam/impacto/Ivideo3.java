package vit.kelembakam.impacto;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Ivideo3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivideo3);
        VideoView videoview =(VideoView)findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoview);
        Uri uri = Uri.parse("rtsp://r6---sn-a5meknel.googlevideo.com/Cj0LENy73wIaNAm8h7D6FRdhQRMYDSANFC3r7eNXMOCoAUIASARg1oPx7oSJ6uhXigELZ1QzSzBQZmlzdEkM/898FF59FA2BE7B0A1AFC6679D607A8F819B7DE94.9B9B16F8A14D952EA363256C44DF709959F19EEE/yt6/1/video.3gp");
        videoview.setMediaController(mediaController);
        videoview.setVideoURI(uri);
        videoview.requestFocus();
        videoview.start();
    }
}
