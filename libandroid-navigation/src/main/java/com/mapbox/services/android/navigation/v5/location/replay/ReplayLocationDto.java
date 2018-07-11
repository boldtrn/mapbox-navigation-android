package com.mapbox.services.android.navigation.v5.location.replay;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

class ReplayLocationDto {

  @SerializedName("lng")
  private double longitude;
  @SerializedName("horizontalAccuracy")
  private float horizontalAccuracyMeters;
  @SerializedName("course")
  private double bearing;
  @SerializedName("verticalAccuracy")
  private float verticalAccuracyMeters;
  private double speed;
  @SerializedName("lat")
  private double latitude;
  @SerializedName("altitude")
  private double altitude;
  @SerializedName("timestamp")
  @JsonAdapter(TimestampAdapter.class)
  private Date time;

  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  public float getHorizontalAccuracyMeters() {
    return horizontalAccuracyMeters;
  }

  public void setHorizontalAccuracyMeters(float horizontalAccuracyMeters) {
    this.horizontalAccuracyMeters = horizontalAccuracyMeters;
  }

  public double getBearing() {
    return bearing;
  }

  public void setBearing(double bearing) {
    this.bearing = bearing;
  }

  public float getVerticalAccuracyMeters() {
    return verticalAccuracyMeters;
  }

  public void setVerticalAccuracyMeters(float verticalAccuracyMeters) {
    this.verticalAccuracyMeters = verticalAccuracyMeters;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }

  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public double getAltitude() {
    return altitude;
  }

  public void setAltitude(double altitude) {
    this.altitude = altitude;
  }

  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }
}
