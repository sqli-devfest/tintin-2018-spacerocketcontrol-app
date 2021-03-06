package fr.sqli.tintinspacerocketcontrolapp.player;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by renaud on 16/06/17.
 */

public class Player implements Serializable {

    private int id;
    private String lastName;
    private String firstName;
    private String email;
    private String twitter;
    private String company;
    private boolean contact = true;
    private boolean resume = false;

    public Player() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isContact() {
        return contact;
    }

    public void setContact(boolean contact) {
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isNotEmpty() {
        return firstName != null && !firstName.isEmpty()
                && lastName != null && !lastName.isEmpty()
                && email != null && !email.isEmpty();
    }

    public boolean isResume() {
        return resume;
    }

    public void setResume(boolean resume) {
        this.resume = resume;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", twitter='" + twitter + '\'' +
                ", company='" + company + '\'' +
                ", contact=" + contact +
                ", resume=" + resume +
                '}';
    }
}
