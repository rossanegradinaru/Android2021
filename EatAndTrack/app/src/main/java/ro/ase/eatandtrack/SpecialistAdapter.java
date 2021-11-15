package ro.ase.eatandtrack;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SpecialistAdapter extends BaseAdapter {

    private List<Specialist> listaSpecialisti = new ArrayList<>();

    public SpecialistAdapter(List<Specialist> listaSpecialisti){
        this.listaSpecialisti = listaSpecialisti;
    }

    @Override
    public int getCount() {
        return listaSpecialisti.size();
    }

    @Override
    public Object getItem(int position) {
        return listaSpecialisti.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item_specialist, parent, false);
        TextView tvNume = (TextView) view.findViewById(R.id.tvNumeSpecialist);
        TextView tvSpecializare = (TextView) view.findViewById(R.id.tvSpecializare);
        TextView tvOras = (TextView) view.findViewById(R.id.tvOras);

        Specialist specialist = listaSpecialisti.get(position);
        tvNume.setText(specialist.getNume());
        tvSpecializare.setText(specialist.getSpecializare());
        tvOras.setText(specialist.getOras());

        return view;
    }

    public void updateList(List<Specialist> listaNoua){
        listaSpecialisti.addAll(listaNoua);
        notifyDataSetChanged();
    }
}
