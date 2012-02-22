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
 * Facebook JSON structure for Education
 *
 * @author Inderjeet Singh
 */
public class Education {
  private final FacebookRef school;
  private final FacebookRef year;
  private final String type;

  // For Gson
  @SuppressWarnings("unused")
  private Education() {
    this(null, null, null);
  }

  public Education(FacebookRef school, FacebookRef year, String type) {
    this.school = school;
    this.year = year;
    this.type = type;
  }

  public FacebookRef getSchool() {
    return school;
  }

  public FacebookRef getYear() {
    return year;
  }

  public String getType() {
    return type;
  }
}
