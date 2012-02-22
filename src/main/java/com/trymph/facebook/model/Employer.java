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

/**
 * Facebook JSON structure for an employer
 *
 * @author Inderjeet Singh
 */
public class Employer {
  private final FacebookRef employer;
  private final FacebookRef location;
  private final FacebookRef position;
  private final String description;
  private final String start_date;
  private final String end_date;

  // For Gson
  @SuppressWarnings("unused")
  private Employer() {
    this(null, null, null, null, null, null);
  }

  public Employer(FacebookRef employer, FacebookRef location,
      FacebookRef position, String description, String startDate, String endDate) {
    this.employer = employer;
    this.location = location;
    this.position = position;
    this.description = description;
    this.start_date = startDate;
    this.end_date = endDate;
  }

  public FacebookRef getEmployer() {
    return employer;
  }

  public FacebookRef getLocation() {
    return location;
  }

  public FacebookRef getPosition() {
    return position;
  }

  public String getDescription() {
    return description;
  }

  public String getStartDate() {
    return start_date;
  }

  public String getEndDate() {
    return end_date;
  }
}
