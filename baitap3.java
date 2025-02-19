package baitap;



public class baitap3{
 private float lenght;
 private float width;
 
 public baitap3() {
  
 }
 public baitap3(float lenght, float width) {
  this.lenght = lenght;
  this.width = width;
 }
 public float getLenght() {
  return lenght;
 }
 public void setLenght(float lenght) {
  this.lenght = lenght;
 }
 public float getWidth() {
  return width;
 }
 public void setWidth(float width) {
  this.width = width;
 }
 public double getArea() {
  return lenght * width;
 }
 public double getPerimeter() {
  return (lenght + width)/2;
 }
 @Override
 public String toString() {
  return  "[lenght=" + lenght 
    + ", width=" + width + "]";
 }
 
}