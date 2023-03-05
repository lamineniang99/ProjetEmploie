package sn.esmt.projetemploie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.logging.Level;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import sn.esmt.projetemploie.model.CvEntities;
import sn.esmt.projetemploie.model.retofit.Api;
import sn.esmt.projetemploie.model.retofit.RetrofitService;

public class DemandeurActivity extends AppCompatActivity {

    private TextInputEditText nomParam ;
    private TextInputEditText prenomParam ;
    private TextInputEditText ageParam ;
    private TextInputEditText addresseParam ;
    private TextInputEditText emailParam ;
    private TextInputEditText telephoneParam ;
    private TextInputEditText specialiteParam ;
    private TextInputEditText niveauParam ;
    private TextInputEditText experienceeParam ;
    private Button submitParam ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demandeur);
        nomParam = (TextInputEditText) findViewById(R.id.emailParam);
        prenomParam = (TextInputEditText) findViewById(R.id.prenomParam);
        ageParam = (TextInputEditText) findViewById(R.id.ageParam);
        addresseParam = (TextInputEditText) findViewById(R.id.addresseParam);
        emailParam = (TextInputEditText) findViewById(R.id.emailParam);
        telephoneParam = (TextInputEditText) findViewById(R.id.telephoneParam);
        specialiteParam = (TextInputEditText) findViewById(R.id.specialiteParam);
        niveauParam = (TextInputEditText) findViewById(R.id.niveauParam);
        experienceeParam = (TextInputEditText) findViewById(R.id.experienceParam);
        submitParam = (Button) findViewById(R.id.submitParam);

        submitParam.setOnClickListener(new View.OnClickListener() {
            RetrofitService retrofitService = new RetrofitService();
            Api api = retrofitService.getRetrofit().create(Api.class);
            @Override
            public void onClick(View view) {
                String nom = nomParam.getText().toString();
                String prenom = prenomParam.getText().toString();
                String age = ageParam.getText().toString();
                String addresse = addresseParam.getText().toString();
                String email = emailParam.getText().toString();
                String telephone = telephoneParam.getText().toString();
                String specialite = specialiteParam.getText().toString();
                String niveau = niveauParam.getText().toString();
                String experience = experienceeParam.getText().toString();

                CvEntities cvEntities = new CvEntities();
                cvEntities.setNom(nom);
                cvEntities.setPrenom(prenom);
                cvEntities.setAge(age);
                cvEntities.setAdresse(addresse);
                cvEntities.setEmail(email);
                cvEntities.setTelephone(telephone);
                cvEntities.setSpecialite(specialite);
                cvEntities.setNiveauEtude(niveau);
                cvEntities.setExperienceProfessionnell(experience);

                api.save(cvEntities)
                        .enqueue(new Callback<CvEntities>() {
                            @Override
                            public void onResponse(Call<CvEntities> call, Response<CvEntities> response) {
                                Toast.makeText(DemandeurActivity.this, "enrigistré avec succée !!!", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onFailure(Call<CvEntities> call, Throwable t) {
                                Toast.makeText(DemandeurActivity.this, "Echec de l'enrigistrement", Toast.LENGTH_SHORT).show();
                                Logger.getLogger(DemandeurActivity.class.getName()).log(Level.SEVERE,"Erreur",t);
                            }
                        });
            }
        });




    }
}