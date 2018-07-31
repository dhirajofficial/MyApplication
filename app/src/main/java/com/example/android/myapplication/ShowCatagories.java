package com.example.android.myapplication;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ShowCatagories extends ArrayAdapter<String> {

    private String[] catagories;
    private Activity context;

    public ShowCatagories(Activity context, String[] catagories) {
        super(context, R.layout.activity_show_catagories,catagories);

        this.context=context;
        this.catagories=catagories;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View r = convertView;
        ViewHolder viewHolder = null;

        if(r==null)
        {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.activity_show_catagories,null,true);

            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else viewHolder = (ViewHolder) r.getTag();

//        viewHolder.ivw.setImageResource(imgid[position]);
        viewHolder.tvw.setText(catagories[position]);
//        viewHolder.tvw2.setText(description[position]);
//        viewHolder.tvw3.setText(contact[position]);

//        return super.getView(position, convertView, parent);
        return r;
    }

    class ViewHolder
    {
        TextView tvw;
//        TextView tvw2;
//        TextView tvw3;
//        ImageView ivw;

        ViewHolder(View v)
        {
            tvw = v.findViewById(R.id.adCatagory);
//            tvw2 = v.findViewById(R.id.adDescription);
//            tvw3 = v.findViewById(R.id.adContact);
//            ivw = v.findViewById(R.id.adImage);
        }
    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_show_catagories);
//    }
}
