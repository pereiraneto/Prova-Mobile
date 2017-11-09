package com.jordao.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MenuDialogFragment.NotificarEscutadorDoDialog, AdapterView.OnItemClickListener {
    ArrayAdapter<String> adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("item 1");
        lista.add("item 2");
        lista.add("item 3");

        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, lista);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
        MenuDialogFragment fragmento = new MenuDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("pos", pos);
        fragmento.setArguments(bundle);
        fragmento.show(this.getFragmentManager(), "confirma");
    }

    @Override
    public void onDialogEditarClick(int posicao) {

    }

    @Override
    public void onDialogNovoGastoClick(int posicao) {

    }

    @Override
    public void onDialogGastosRealizadosClick(int posicao) {

    }

    @Override
    public void onDialogExcluiClick(int posicao) {

    }
}
