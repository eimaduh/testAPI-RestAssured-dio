package com.dio.entities;

public class Booking {
   private String firstname;
   private String lastname;
   private float totalPrice;
   private boolean depositpaid;
   private BookingDates bookingdates;
   private String additionalneed;

   public Booking(String firstname, String lastname, float totalPrice, boolean depositpaid, BookingDates bookingdates, String additionalneed) {

      this.firstname = firstname;
      this.lastname = lastname;
      this.totalPrice = totalPrice;
      this.depositpaid = depositpaid;
      this.bookingdates = bookingdates;
      this.additionalneed = additionalneed;
   } 

   public String getFirstname(){
      return firstname;
   }

   public void setFirstname(String firstname){
      this.firstname = firstname;
   }

   public String getLastname(){
      return lastname;
   }

   public void setLastname(String lastname){
      this.lastname = lastname;
   }

   public float getTotalPrice() {
      return totalPrice;
   }

   public void setTotalPrice(float totalPrice) {
      this.totalPrice = totalPrice;
   }

   public boolean getDepositpaid() {
      return depositpaid;
   }

   public void setDepositpaid(boolean depositpaid) {
      this.depositpaid = depositpaid;
   }

   public BookingDates getBookingDates() {
      return bookingdates;
   }

   public void setBookingDates(BookingDates bookingdates) {
      this.bookingdates = bookingdates;
   }

   public String getAdditionalneed(){
      return additionalneed;
   }

   public void setAdditionalneed(String additionalneed) {
      this.additionalneed = additionalneed;
   }
}
