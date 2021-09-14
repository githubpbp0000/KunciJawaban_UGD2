package com.example.ugd1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ugd1.entity.Dosen;

public class RVDosenAdapter extends RecyclerView.Adapter<RVDosenAdapter.ViewHolder> {
    private final Dosen[] listDosen;

    RVDosenAdapter(Dosen[] data){
        listDosen = data;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPicture;
        TextView tvName;
        TextView tvNomorDosen;
        TextView tvMasaKerja;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivPicture = itemView.findViewById(R.id.iv_picture);
            tvName = itemView.findViewById(R.id.tv_nama);
            tvNomorDosen = itemView.findViewById(R.id.tv_nomor_dosen);
            tvMasaKerja = itemView.findViewById(R.id.tv_masa_kerja);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_dosen,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Dosen dosen = listDosen[position];

        holder.tvName.setText(dosen.getName());
        holder.tvNomorDosen.setText(dosen.getNomorDosen());
        String bergabung = "Bergabung Sejak " + dosen.getMasaKerja().toString() + " Tahun Lalu";
        holder.tvMasaKerja.setText(bergabung);
        Glide.with(holder.itemView.getContext())
                .load(dosen.getPhotoDosen())
                .into(holder.ivPicture);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());

                builder.setTitle("Data Dosen")
                .setMessage("Dosen yang dipilih adalah " + dosen.getName())
                .setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listDosen.length;
    }


}
