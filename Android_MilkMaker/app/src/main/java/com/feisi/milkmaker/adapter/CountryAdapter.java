package com.feisi.milkmaker.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.feisi.milkmaker.R;
import com.feisi.milkmaker.bean.CountryBean;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.MyViewHoder> {

    private List<CountryBean> list;
    private LayoutInflater inflater;
    private Context context;

    public CountryAdapter(Context context,List<CountryBean> list){
        this.context = context;
        this.list = list;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.country_item_layout,parent,false);


        return new MyViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHoder holder, int position) {
        CountryBean country = list.get(position);

        holder.tv_name.setText(country.getName());
        holder.tv_tel.setText(country.getTel());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHoder extends RecyclerView.ViewHolder{
        TextView tv_name;
        TextView tv_tel;

        public MyViewHoder(@NonNull View itemView) {
            super(itemView);

            this.tv_name = itemView.findViewById(R.id.name);
            this.tv_tel = itemView.findViewById(R.id.tel);
        }
    }
}
