package com.example.yogatama.myapplication;


import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ResepDetailFragment extends Fragment {


    private long resepId;

    public ResepDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resep_detail, container, false);
    }

    public void setResep(long id){
        this.resepId = id;
    }

    public void onStart() {
        super.onStart();
        View view = getView();

        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Resep resepmakanan = Resep.resepmakanan[(int) resepId];

            title.setText(resepmakanan.getName());

            TextView harga = (TextView) view.findViewById(R.id.textHarga);
            harga.setText(resepmakanan.getHarga());

            TextView tipe = (TextView) view.findViewById(R.id.textTipe);
            tipe.setText(resepmakanan.getTipe());

            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(resepmakanan.getDescription());

            ImageView gambar = (ImageView) view.findViewById(R.id.image);
            gambar.setImageResource(resepmakanan.getGambar());


        } }

}
