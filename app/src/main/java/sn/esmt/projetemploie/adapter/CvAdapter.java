package sn.esmt.projetemploie.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import sn.esmt.projetemploie.R;
import sn.esmt.projetemploie.model.CvEntities;

public class CvAdapter extends RecyclerView.Adapter<CvHolder> {

    private List<CvEntities> cvEntitiesList ;

    public CvAdapter(List<CvEntities> cvEntitiesList) {
        this.cvEntitiesList = cvEntitiesList;
    }

    @NonNull
    @Override
    public CvHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_cv_item,parent,false);
        return new CvHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CvHolder holder, int position) {
        CvEntities cvEntities = cvEntitiesList.get(position);
        holder.nom.setText(cvEntities.getNom());
        holder.prenom.setText(cvEntities.getPrenom());
        holder.age.setText(cvEntities.getAge());
        holder.addresse.setText(cvEntities.getAdresse());
        holder.email.setText(cvEntities.getEmail());
        holder.telephone.setText(cvEntities.getTelephone());
        holder.specialite.setText(cvEntities.getSpecialite());
        holder.niveau.setText(cvEntities.getNiveauEtude());
        holder.experience.setText(cvEntities.getExperienceProfessionnell());

    }

    @Override
    public int getItemCount() {
        return cvEntitiesList.size();
    }
}
