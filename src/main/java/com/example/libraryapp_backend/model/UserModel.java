package com.example.libraryapp_backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userdetails")
public class UserModel {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String aadhar;
    private String adddress;
    private int pincode;
    private String dob;
    private String emailid;
    private String phonenumber;
    private String username;
    private String password;
    private String cpassword;


    public UserModel() {
    }

    public UserModel(int id, String name, String aadhar, String adddress, int pincode, String dob, String emailid, String phonenumber, String username, String password, String cpassword) {
        this.id = id;
        this.name = name;
        this.aadhar = aadhar;
        this.adddress = adddress;
        this.pincode = pincode;
        this.dob = dob;
        this.emailid = emailid;
        this.phonenumber = phonenumber;
        this.username = username;
        this.password = password;
        this.cpassword = cpassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getAdddress() {
        return adddress;
    }

    public void setAdddress(String adddress) {
        this.adddress = adddress;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }
}
