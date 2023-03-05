package sn.esmt.projetemploie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import sn.esmt.projetemploie.adapter.CvAdapter;
import sn.esmt.projetemploie.model.CvEntities;
import sn.esmt.projetemploie.model.retofit.Api;
import sn.esmt.projetemploie.model.retofit.RetrofitService;

public class RecruteurActivity extends AppCompatActivity {
    private RecyclerView recyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recruteur);
        recyclerView = findViewById(R.id.cvList_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        loadcvs();
    }

    private void loadcvs() {
        RetrofitService retrofitService = new RetrofitService();
        Api api = retrofitService.getRetrofit().create(Api.class);
        api.all()
                .enqueue(new Callback<List<CvEntities>>() {
                    @Override
                    public void onResponse(Call<List<CvEntities>> call, Response<List<CvEntities>> response) {
                        populateListView(response.body());
                    }

                    @Override
                    public void onFailure(Call<List<CvEntities>> call, Throwable t) {
                        Toast.makeText(RecruteurActivity.this, "Erreur de chargement de la liste des cvs ", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void populateListView(List<CvEntities> cvEntitiesList) {
        CvAdapter cvAdapter = new CvAdapter(cvEntitiesList);
        recyclerView.setAdapter(cvAdapter);
    }
}