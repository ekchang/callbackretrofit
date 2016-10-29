package com.ekc.c4q.callbackretrofit.network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

// Client for interacting with the GitHubApi
public class GitHubClient {
  public static final String API_URL = "https://api.github.com";

  private static GitHubClient instance;

  private final GitHubApi api;

  public static GitHubClient getInstance() {
    if (instance == null) {
      instance = new GitHubClient();
    }

    return instance;
  }

  private GitHubClient() {
    Retrofit retrofit = new Retrofit.Builder().baseUrl(API_URL).build();
    api = retrofit.create(GitHubApi.class);
  }

  public Call<ResponseBody> getContributors(String owner, String repository) {
    return api.getContributors(owner, repository);
  }

  public Call<ResponseBody> getRepositories(String user) {
    return api.getRepositories(user);
  }
}
