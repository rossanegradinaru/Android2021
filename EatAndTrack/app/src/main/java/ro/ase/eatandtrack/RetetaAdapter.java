package ro.ase.eatandtrack;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RetetaAdapter extends BaseAdapter {

    private List<Reteta> listaRetete = new ArrayList<>();

    public RetetaAdapter(List<Reteta> lista) {
        listaRetete = lista;
    }

    @Override
    public int getCount() {
        return listaRetete.size();
    }

    @Override
    public Object getItem(int position) {
        return listaRetete.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_reteta,parent,false);
        ImageView img = view.findViewById(R.id.ivRecipe);
        TextView tvNumeReteta = view.findViewById(R.id.tvRecipeName);
        TextView tvCalorii = view.findViewById(R.id.tvNumberOfCalories);

        Reteta reteta = listaRetete.get(position);
        img.setImageResource(reteta.getImagine());
        tvNumeReteta.setText(reteta.getNume());
        tvCalorii.setText(Integer.toString(reteta.getNumarCalorii()));

        return view;
    }
}
