/*
 * Copyright (C) 2012 Trymph Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.trymph.facebook.model;

import java.net.URL;
import java.util.List;

/**
 * A facebook user profile as described through
 * <a href='http://developers.facebook.com/docs/reference/api/user/'>their JSON API</a>
 *
 * @author Inderjeet Singh
 */
public class UserProfile {
  // Not including the following fields yet:
  // "installed", video_upload_limits

  private final String id;
  private final String name;
  private final String first_name;
  private final String middle_name;
  private final String last_name;
  private final Gender gender;
  private final String locale;
  private final List<FacebookRef> languages;
  private final URL link;
  private final String user_name;
  private final String third_party_id;
  private final String timezone;
  private final String bio;
  private final String birthday;
  private final List<Employer> education;
  private final String email;
  private final FacebookRef hometown;
  private final List<String> interested_in;
  private final FacebookRef location;
  private final String political;
  private final List<FacebookRef> favorite_athletes;
  private final List<FacebookRef> favorite_teams;
  private final String quotes;
  private final String relationship_status;
  private final String religion;
  private final FacebookRef significant_other;
  private final URL website;
  private final List<Employer> work;

  // For Gson
  @SuppressWarnings("unused")
  private UserProfile() {
    this(null, null, null, null, null, null, null, null, null, null, null, null, null, null,
        null, null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public UserProfile(String id, String name, String firstName, String middleName,
      String lastName, Gender gender, String locale, List<FacebookRef> languages, URL link,
      String userName, String thirdPartyId, String timeZone, String bio, String birthday,
      List<Employer> education, String email, FacebookRef homeTown,
      List<String> interestedIn, FacebookRef location, String political,
      List<FacebookRef> favoriteAthletes, List<FacebookRef> favoriteTeams,
      String quotes, String relationshipStatus, String religion,
      FacebookRef significantOther, URL website, List<Employer> work) {
    this.id = id;
    this.name = name;
    this.first_name = firstName;
    this.middle_name = middleName;
    this.last_name = lastName;
    this.gender = gender;
    this.locale = locale;
    this.languages = languages;
    this.link = link;
    this.user_name = userName;
    this.third_party_id = thirdPartyId;
    this.timezone = timeZone;
    this.bio = bio;
    this.birthday = birthday;
    this.education = education;
    this.email = email;
    this.hometown = homeTown;
    this.interested_in = interestedIn;
    this.location = location;
    this.political = political;
    this.favorite_athletes = favoriteAthletes;
    this.favorite_teams = favoriteTeams;
    this.quotes = quotes;
    this.relationship_status = relationshipStatus;
    this.religion = religion;
    this.significant_other = significantOther;
    this.website = website;
    this.work = work;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getFirstName() {
    return first_name;
  }

  public String getMiddleName() {
    return middle_name;
  }

  public String getLastName() {
    return last_name;
  }

  public Gender getGender() {
    return gender;
  }

  public String getLocale() {
    return locale;
  }

  public List<FacebookRef> getLanguages() {
    return languages;
  }

  public URL getLink() {
    return link;
  }

  public String getUserName() {
    return user_name;
  }

  public String getThirdPartyId() {
    return third_party_id;
  }

  public String getTimeZone() {
    return timezone;
  }

  public String getBio() {
    return bio;
  }

  public String getBirthday() {
    return birthday;
  }

  public List<Employer> getEducation() {
    return education;
  }

  public String getEmail() {
    return email;
  }

  public FacebookRef getHomeTown() {
    return hometown;
  }

  public List<String> getInterestedIn() {
    return interested_in;
  }

  public FacebookRef getLocation() {
    return location;
  }

  public String getPolitical() {
    return political;
  }

  public List<FacebookRef> getFavoriteAthletes() {
    return favorite_athletes;
  }

  public List<FacebookRef> getFavoriteTeams() {
    return favorite_teams;
  }

  public String getQuotes() {
    return quotes;
  }

  public String getRelationshipStatus() {
    return relationship_status;
  }

  public String getReligion() {
    return religion;
  }

  public FacebookRef getSignificantOther() {
    return significant_other;
  }

  public URL getWebsite() {
    return website;
  }

  public List<Employer> getWork() {
    return work;
  } 
}
