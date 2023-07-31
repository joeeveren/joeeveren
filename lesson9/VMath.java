package VolMath;
import MyMath.MyGeoMath;;
public class VMath {
  public static double volume(Double r, Double h) {
    return  MyGeoMath.circleArea(r) * h;
  }
}