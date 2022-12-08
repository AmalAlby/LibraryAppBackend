package com.example.libraryapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookissue")
public class IssueModel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String title;
    private String date;
    private int membershipno;

    public IssueModel() {
    }

    public IssueModel(int id, String name, String title, String date, int membershipno) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.date = date;
        this.membershipno = membershipno;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getMembershipno() {
        return membershipno;
    }

    public void setMembershipno(int membershipno) {
        this.membershipno = membershipno;
    }
}
