package com.example.yogatama.myapplication;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;
public class MainActivity_Video extends AppCompatActivity {
    VideoView videoView;
    ListView listView;
    TextView textLoading;

    ArrayList<String> listVideo;
    ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutvideo);

        videoView = (VideoView) findViewById(R.id.videoView);
        listView =  (ListView) findViewById(R.id.listView);

        textLoading = (TextView) findViewById(R.id.textLoading);
        textLoading.setVisibility(VideoView.INVISIBLE);



        listVideo = new ArrayList<>();
        listVideo.add("coba");
        listVideo.add("hehe");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, datavideo.drama);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                datavideo datavideo = com.example.yogatama.myapplication.datavideo.drama[(int )id];

                Uri videoUri = dapatkanMedia(datavideo.getVideoRawId());
                buatPlayer(videoUri);


            }

            private Uri dapatkanMedia(String namaMedia){

                if (URLUtil.isValidUrl(namaMedia)){
                    return Uri.parse(namaMedia);
                }else {
                    return Uri.parse("android.resource://" + getPackageName() +
                            "/raw/" + namaMedia);
                }

            }
            private void buatPlayer(Uri videoUri){
                textLoading.setVisibility(VideoView.VISIBLE);

                videoView.setVideoURI(videoUri);

                MediaController mc = new MediaController(MainActivity_Video.this);
                videoView.setMediaController(mc);
                mc.setAnchorView(videoView);

                videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {

                        textLoading.setVisibility(VideoView.INVISIBLE);

                        videoView.start();
                    }
                });

//                videoView.setMediaController(new MediaController(MainActivity.this));

//                videoView.requestFocus();
//                videoView.start();
                videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Toast.makeText(MainActivity_Video.this, "Video Tamat", Toast.LENGTH_SHORT).show();

                        videoView.seekTo(0);
                    }
                });
            }


        });
    }
}
