package sn.esmt.projetemploie.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import sn.esmt.projetemploie.R;

public class CvHolder extends RecyclerView.ViewHolder {

    TextView nom , prenom , age , addresse , email , telephone , specialite , niveau , experience ;

    public CvHolder(@NonNull View itemView) {
        super(itemView);
        nom = itemView.findViewById(R.id.cvListItem_nom);
        prenom = itemView.findViewById(R.id.cvListItem_prenom);
        age = itemView.findViewById(R.id.cvListItem_age);
        addresse = itemView.findViewById(R.id.cvListItem_addresse);
        email = itemView.findViewById(R.id.cvListItem_email);
        telephone = itemView.findViewById(R.id.cvListItem_telephone);
        specialite = itemView.findViewById(R.id.cvListItem_specialite);
        niveau = itemView.findViewById(R.id.cvListItem_niveau);
        experience = itemView.findViewById(R.id.cvListItem_experience);
    }
}
