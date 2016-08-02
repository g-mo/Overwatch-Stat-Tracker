package com.gmo.overwatch_stat_tracker;

import com.gmo.overwatch_stat_tracker.profile.Profile;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by gmo on 8/1/2016.
 */
public interface OverwatchAPIEndpointInterface {

    @GET("{platform}/{region}/{tag}/profile")
    Call<Profile> getProfile(@Path("platform") String platform, @Path("region") String region, @Path("tag") String tag);

}
