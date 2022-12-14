package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movie {

  private String name;
  private String image;
  private float voteAverage;
  private int voteCount;
  private String releaseDate;
  private int id;

  public Movie(@JsonProperty("id") int id, @JsonProperty("original_title") String name,
      @JsonProperty("poster_path") String image, @JsonProperty("vote_average") float voteAverage,
      @JsonProperty("vote_count") int voteCount, @JsonProperty("release_date") String releaseDate
  ) {
    this.name = name;
    this.image = image;
    this.voteAverage = voteAverage;
    this.voteCount = voteCount;
    this.releaseDate = releaseDate;
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public String getImage() {
    return this.image;
  }

  public float getVoteAverage() {
    return this.voteAverage;
  }

  public int getVoteCount() {
    return this.voteCount;
  }

  public String getReleaseDate() {
    return this.releaseDate;
  }

  public int getId() {
    return this.id;
  }
}
