package edu.dartmouth.cs.myfirstapp.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import edu.dartmouth.cs.myfirstapp.R;

public class ObjectAdapter extends ArrayAdapter {
    private List<objectsmodel> objectsmodelList;
    private int resource;
    private LayoutInflater inflater;
    public ObjectAdapter(Context context, int resource, List<objectsmodel> objects) {
        super(context, resource, objects);
        objectsmodelList = objects;
        this.resource = resource;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null)
        {
            convertView = inflater.inflate(resource, null);
        }

        TextView locu_id;
        TextView web_url;
        TextView TextView_name;
        TextView textlocality;
        TextView TextView_sa;
        TextView TextView_rgn;
        TextView TextView_cntry;
        TextView TextView_pc;
        TextView TextView_phn;
        TextView TextView_long;
        TextView TextView_lat;
        TextView TextView_hm;


        locu_id = (TextView)convertView.findViewById(R.id.locu_id);
        web_url = (TextView)convertView.findViewById(R.id.web_url);
        TextView_name = (TextView)convertView.findViewById(R.id.Textview_name);
        textlocality = (TextView)convertView.findViewById(R.id.textlocality);
        TextView_sa = (TextView)convertView.findViewById(R.id.textView_sa);
        TextView_rgn = (TextView)convertView.findViewById(R.id.textView_rgn);
        TextView_cntry = (TextView)convertView.findViewById(R.id.textView_cntry);
        TextView_pc = (TextView)convertView.findViewById(R.id.textView_pc);
        TextView_phn = (TextView)convertView.findViewById(R.id.textView_phn);
        TextView_long = (TextView)convertView.findViewById(R.id.textView_long);
        TextView_lat= (TextView)convertView.findViewById(R.id.textView_lat);
        TextView_hm = (TextView)convertView.findViewById(R.id.textView_hm);

        locu_id.setText("LOcu_id :" + objectsmodelList.get(position).getLocu_id());
        web_url.setText(objectsmodelList.get(position).getWebsite_url());
        TextView_name.setText(objectsmodelList.get(position).getName());
        textlocality.setText(objectsmodelList.get(position).getLocality());
        TextView_sa.setText("Address: \n "+objectsmodelList.get(position).getStreet_address());
        TextView_rgn.setText(objectsmodelList.get(position).getRegion());
        TextView_cntry.setText(objectsmodelList.get(position).getCountry());
        TextView_pc.setText(objectsmodelList.get(position).getPostal_code());
        TextView_phn.setText("Contact Number: " +objectsmodelList.get(position).getPhone());
        TextView_long.setText("longitude:" + objectsmodelList.get(position).getLongi());
        TextView_lat.setText("latitude:"+ objectsmodelList.get(position).getLat());
        TextView_hm.setText("Menu?" + objectsmodelList.get(position).isHas_menu());


        return convertView;
    }
}

