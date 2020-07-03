package com.example.eat_clean;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class thucdonadapter extends RecyclerView.Adapter<thucdonadapter.ViewHolder> {
    Context context;
    ArrayList<thucdon> arrayList=new ArrayList<>();

    public thucdonadapter(Context context, ArrayList<thucdon> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dong_thucdon, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        thucdon thucdon=arrayList.get(position);
        holder.image_sp.setImageResource(thucdon.idimgae);
        holder.tenthucdon.setText(thucdon.tenthucdon);
        holder.nguyenlieu.setText(thucdon.motangan);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image_sp;
        TextView tenthucdon;
        TextView nguyenlieu;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            image_sp = itemView.findViewById(R.id.image);
            tenthucdon = itemView.findViewById(R.id.tv_tenthucdon);
            nguyenlieu = itemView.findViewById(R.id.tv_mota);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(context,ChitiethucdonActivity.class);
                    thucdon thucdon=arrayList.get(getPosition());
                    intent.putExtra("thucdon",thucdon);
                    context.startActivity(intent);


                }
            });
        }

    }
}
