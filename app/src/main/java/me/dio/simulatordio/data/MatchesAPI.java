package me.dio.simulatordio.data;

import java.util.List;

import me.dio.simulatordio.domain.Match;
import retrofit2.http.GET;
import retrofit2.Call;

public interface MatchesAPI {

    @GET("matches.json")
    Call<List<Match>> getMatches();

}
