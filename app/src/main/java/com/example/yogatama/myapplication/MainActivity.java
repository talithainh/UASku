package com.example.yogatama.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ResepListFragment.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//
//    public void onShowDetails(View view) {
//        Intent intent = new Intent(this, DetailActivity.class);
//        startActivity(intent);
//    }

        public void itemClicked (long id) {
        View fragmentContainer = findViewById(R.id.detail_frag);
        if(fragmentContainer != null){
            ResepDetailFragment details = new ResepDetailFragment();

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setResep(id);

            ft.replace(R.id.detail_frag, details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);

            ft.commit();
        }else{
            Toast.makeText(this,"Item"+id+"di klik", Toast.LENGTH_SHORT).show();
            Intent i=new Intent(this.getApplicationContext(), DetailActivity.class);
            Bundle b=new Bundle();
            b.putLong("id",id);
            i.putExtras(b);
            startActivity(i);
        }
    }
}
