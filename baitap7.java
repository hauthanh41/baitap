package baitap;



public class baitap7 {
 private int day;
 private int month;
 private int year;
 
 public baitap7() {
  
 }
 public baitap7(int day, int month, int year) {
  this.day = day;
  this.month = month;
  this.year = year;
 }
 public int getDay() {
  return day;
 }
 public void setDay(int day) {
  this.day = day;
 }
 public int getMonth() {
  return month;
 }
 public void setMonth(int month) {
  this.month = month;
 }
 public int getYear() {
  return year;
 }
 public void setYear(int year) {
  this.year = year;
 }
 public void setDate(int day,int month,int year) {
 this.day=day;
 this.month=month;
 this.year=year;
 
}
 @Override
 public String toString() {
  return "BaiTap1_7 [day=" + day + ", month=" + month + ", year=" + year + "]";
 } 
}