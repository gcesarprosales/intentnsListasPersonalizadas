package com.example.gcesar.proyectoandroidbasico;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by GCesar on 24/01/2016.
 */
public abstract class MiAdaptadorMuro extends BaseAdapter {

    List elementos;
    int archivo_layout;
    Context context;

    public MiAdaptadorMuro(List elementos, int archivo_layout, Context context) {
        this.elementos = elementos;
        this.archivo_layout = archivo_layout;
        this.context = context;
    }


    @Override
    public int getCount() {
        return elementos.size();
    }

    @Override
    public Object getItem(int position) {
        return elementos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater li = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = li.inflate(archivo_layout,null);
        }

        inicializaElemento(getItem(position),convertView);
        return convertView;
    }
    public abstract View inicializaElemento(Object elemento, View view);
}
