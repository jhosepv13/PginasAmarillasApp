package pe.bazan.jhosep.com.pginasamarillasapp.adapters;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import pe.bazan.jhosep.com.pginasamarillasapp.R;
import pe.bazan.jhosep.com.pginasamarillasapp.activities.InfoActivity;
import pe.bazan.jhosep.com.pginasamarillasapp.models.Company;

/**
 * Created by Alumno on 5/04/2018.
 */

public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.ViewHolder>{

    private List<Company> companies;
    public View itemView;

    public void setCompany (List<Company> companies) {this.companies = companies;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView pictureImage;
        TextView nameText;
        TextView addressText;
        TextView phoneText;
        //TextView urlText;

        public ViewHolder(View itemView){
            super(itemView);
            pictureImage = itemView.findViewById(R.id.pictureImage);
            nameText = itemView.findViewById(R.id.nameText);
            addressText = itemView.findViewById((R.id.addressText));
            phoneText = itemView.findViewById(R.id.phoneText);

    }
}


    @Override
    public CompanyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_company, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Company company = companies.get(position);

        int resId = holder.itemView.getContext().getResources().getIdentifier(company.getLogo(), "drawable", holder.itemView.getContext().getPackageName());
        holder.pictureImage.setImageResource(resId);

        holder.nameText.setText(company.getName());
        holder.addressText.setText(company.getAddress());
        holder.phoneText.setText(company.getPhone());

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
                    public void onClick(View v){
                /*Toast.makeText(holder.itemView.getContext(), "Detaills: "+company.getName(), Toast.LENGTH_SHORT).show();
                redireccionar();*/

                Intent intent = new Intent(itemView.getContext(), InfoActivity.class);
                intent.putExtra("info", company.getInfo());
                intent.putExtra("name", company.getName());
                intent.putExtra("address", company.getAddress());
                intent.putExtra("phone", company.getPhone());
                intent.putExtra("category", company.getCategory());
                intent.putExtra("url", company.getUrl());
                intent.putExtra("logo", company.getLogo());

                itemView.getContext().startActivity(intent);
            }

        });


    }

    private void redireccionar() {

        /*Intent intent = new Intent(itemView.getContext(), InfoActivity.class);
            itemView.getContext().startActivity(intent);*/


    }

    @Override
    public int getItemCount() {
        return companies.size();
    }

    public void filterList(ArrayList<Company> filter){
        companies = filter;
        notifyDataSetChanged();
    }

}
