package org.example.contact.dto;

import java.util.Objects;

public class ContactDto {
    private Long contactId;
    private String firstName;
    private String lastName;
    private String occupation;
    private String phoneNumber;
    private String emailAddress;

    public ContactDto() {
    }

    public ContactDto(Long contactId, String firstName, String lastName, String occupation, String phoneNumber, String emailAddress) {
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "ContactDto{" +
                "contactId=" + contactId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", occupation='" + occupation + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactDto that = (ContactDto) o;
        return Objects.equals(contactId, that.contactId) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(occupation, that.occupation) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(emailAddress, that.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactId, firstName, lastName, occupation, phoneNumber, emailAddress);
    }
}
