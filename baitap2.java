package baitap;



public class baitap2 {
 private double radius;

 public baitap2() {
 }

 public baitap2(double radius) {
  this.radius = radius;
 }

 public double getRadius() {
  return radius;
 }

 public void setRadius(double radius) {
  this.radius = radius;
 }
 public double getArea() {
  return radius * radius * Math.PI;
 }
 public double getCircumference() {
  return Math.PI;
 }

 @Override
 public String toString() {
  return "[radius=" + radius + "]";
 }
 
}