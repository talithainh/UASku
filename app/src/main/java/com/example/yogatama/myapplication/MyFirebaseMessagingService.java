package com.example.yogatama.myapplication;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = "FCM_GUE";

    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        Log.e("NEW_TOKEN",s);
    }

    public void onTokenRefresh(){
        String refreshToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG,"Refresh Token: "+ refreshToken);
    }

//    @Override
//    public void onMessageReceived(RemoteMessage remoteMessage) {
//        super.onMessageReceived(remoteMessage);
//
//        Log.d(TAG, "Pengirim: " + remoteMessage.getFrom());
//    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        Log.d(TAG, "Pengirim: " + remoteMessage.getFrom());

        if (remoteMessage.getData().size() > 0) {
            Log.d(TAG,"Pesennya bang: " + remoteMessage.getData().get("body"));
        }

        MyNotificationManager.getInstance(this).displayNotification(
                remoteMessage.getData().get("body"),
                remoteMessage.getData().get("title")
        );
    }


}
