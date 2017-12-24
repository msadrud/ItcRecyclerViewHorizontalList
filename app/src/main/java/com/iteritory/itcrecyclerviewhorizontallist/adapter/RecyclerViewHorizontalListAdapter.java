package com.iteritory.itcrecyclerviewhorizontallist.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.iteritory.itcrecyclerviewhorizontallist.R;
import com.iteritory.itcrecyclerviewhorizontallist.model.Grocery;

import java.util.List;

/**
 * Created by Sadruddin on 12/24/2017.
 */

public class RecyclerViewHorizontalListAdapter extends RecyclerView.Adapter<RecyclerViewHorizontalListAdapter.GroceryViewHolder>{
    private List<Grocery> horizontalGrocderyList;
    Context context;

    public RecyclerViewHorizontalListAdapter(List<Grocery> horizontalGrocderyList, Context context){
        this.horizontalGrocderyList= horizontalGrocderyList;
        this.context = context;
    }

    @Override
    public GroceryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the layout file
        View groceryProductView = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_list_grocery_item, parent, false);
        GroceryViewHolder gvh = new GroceryViewHolder(groceryProductView);
        return gvh;
        }

    @Override
    public void onBindViewHolder(GroceryViewHolder holder, final int position) {
        holder.imageView.setImageResource(horizontalGrocderyList.get(position).getProductImage());
        holder.txtview.setText(horizontalGrocderyList.get(position).getProductName());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String productName = horizontalGrocderyList.get(position).getProductName().toString();
                Toast.makeText(context, productName + " is selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return horizontalGrocderyList.size();
    }

    public class GroceryViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView txtview;
    public GroceryViewHolder(View view) {
        super(view);
        imageView=view.findViewById(R.id.idProductImage);
        txtview=view.findViewById(R.id.idProductName);
    }
    }
}
