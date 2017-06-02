package com.example.gcesar.proyectoandroidbasico;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by GCesar on 25/01/2016.
 */
public abstract class MiAdaptadorChat extends BaseAdapter {

    List elementosChat;
    int archivo_layout;
    Context context;

    public MiAdaptadorChat(List elementosChat, int archivo_layout, Context context) {
        this.elementosChat = elementosChat;
        this.archivo_layout = archivo_layout;
        this.context = context;
    }

    @Override
    public int getCount() {
        return elementosChat.size();
    }

    @Override
    public Object getItem(int position) {
        return elementosChat.get(position);
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
    public  abstract  View inicializaElemento(Object elemento,View vista);
}
