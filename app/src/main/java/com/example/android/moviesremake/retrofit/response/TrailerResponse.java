package com.example.android.moviesremake.retrofit.response;

import com.example.android.moviesremake.retrofit.model.MovieRetrofitTrailer;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by PepovPC on 1/17/2018.
 */

public class TrailerResponse {


    @SerializedName("youtube")
    private List<MovieRetrofitTrailer> resultsTrailer;

    public List<MovieRetrofitTrailer> getResultsForTrailer() {
        return resultsTrailer;
    }

}