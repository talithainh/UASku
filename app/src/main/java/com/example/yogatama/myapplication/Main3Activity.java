package com.example.yogatama.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.Patterns;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class Main3Activity extends AppCompatActivity implements ZXingScannerView.ResultHandler{

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main3);
//    }

    private ZXingScannerView mScannerView;
    private Intent browserIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mScannerView = new ZXingScannerView(this);
        setContentView(mScannerView);
    }
    @Override
    public void onResume() {
        super.onResume();
        mScannerView.setResultHandler(this);
        mScannerView.startCamera();
    }

    @Override
    public void onPause() {
        super.onPause();
        mScannerView.stopCamera();
    }

    @Override
    public void handleResult(Result rawResult) {
//        Log.v("TAG", rawResult.getText()); // Prints scan results
//        Log.v("TAG", rawResult.getBarcodeFormat().toString());
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("Scan Result");
//        builder.setMessage(rawResult.getText());
//        AlertDialog alert1 = builder.create();
//        alert1.show();
//
//        mScannerView.resumeCameraPreview(this);

        if (Patterns.WEB_URL.matcher(rawResult.getText()).matches())
        {
            browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(rawResult.getText()));
            startActivity(browserIntent);
        }
    }
//        Intent myIntent =new Intent(Main3Activity.this, ScannerActivity.class);
//    Main3Activity.this.startActivity(myIntent);
}
