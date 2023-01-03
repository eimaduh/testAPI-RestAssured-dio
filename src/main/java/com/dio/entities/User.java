package com.dio.entities;

public class User {

   private String username;
   private String firstname;
   private String lastname;
   private String email;
   private String password;
   private String phone;

   public User(String username, String firstname, String lastname, String email, String password, String phone) {
      this.username = username;
      this.firstname = firstname;
      this.lastname = lastname;
      this.email = email;
      this.password = password;
      this.phone = phone;
   }

   public String getUserName() {
      return username;
   }

   public void setUserName(String username) {
      this.username = username;
   }

   public String getFirstName() {
      return firstname;
   }

   public void setFirstName(String firstname) {
      this.firstname = firstname;
   }

   public String getLastName() {
      return lastname;
   }

   public void setLastName(String lastname) {
      this.lastname = lastname;
   }

   public String getEmail(){
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPassword(){
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getPhone(){
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }
}
