package sn.esmt.projetemploie.model.retofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import sn.esmt.projetemploie.model.CvEntities;

public interface Api {

    @GET("/cvs/all")
    Call<List<CvEntities>> all();

    @POST("/cvs/save")
    Call<CvEntities> save(@Body CvEntities cvEntities);
}
