package com.fresh.javatypereferences.viewmodel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.fresh.javatypereferences.R;
import com.fresh.javatypereferences.model.DataType;

import java.util.List;

public class DataTypeAdapter extends RecyclerView.Adapter<DataTypeAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<DataType> list;

    public DataTypeAdapter(Context context, List<DataType> list) {
        inflater = LayoutInflater.from(context);
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DataType type = list.get(position);
        holder.typeName.setText(type.getName());
        holder.category.setText(type.getCategory());
        holder.description.setText(type.getDescription());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView typeName, category, description;


        public ViewHolder(View view) {
            super(view);
            typeName = view.findViewById(R.id.typeName);
            category = view.findViewById(R.id.category);
            description = view.findViewById(R.id.description);
        }
    }
}
