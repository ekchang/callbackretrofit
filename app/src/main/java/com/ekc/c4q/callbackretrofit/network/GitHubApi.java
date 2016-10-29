package com.ekc.c4q.callbackretrofit.network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubApi {

  @GET("/repos/{owner}/{repo}/contributors")
  Call<ResponseBody> getContributors(@Path("owner") String owner, @Path("repo") String repo);

  @GET("/users/{user}/repos")
  Call<ResponseBody> getRepositories(@Path("user") String user);
}
