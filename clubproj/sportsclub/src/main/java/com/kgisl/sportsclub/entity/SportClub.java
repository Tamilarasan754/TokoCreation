package com.kgisl.sportsclub.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SportClub")
public class SportClub {
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="RegisterID")
  private Integer Id;
  @Column(name="FullName")
  private String FullName;
  @Column(name="DateOfBirth")
  private LocalDate DateOfBirth;
  @Column(name="Gender")
  private String Gender;
  @Column(name="Address")
  private String Address;
  @Column(name="Email")
  private String Email;
 @Column(name="ContactNumber")
  private String ContactNumber;
  @Column(name="SportsPreference")
  private String[] SportsPreference;
  @Column(name="SkillLevel")
  private String SkillLevel;
  @Column(name="MembershipType")
  private String MembershipType;
  @Column(name="EmergencyContactNumber")
  private String EmergencyContactNumber;
public SportClub() {
}
public SportClub(Integer id, String fullName, LocalDate dateOfBirth, String gender, String address, String email,
        String contactNumber, String[] sportsPreference, String skillLevel, String membershipType,
        String emergencyContactNumber) {
    Id = id;
    FullName = fullName;
    DateOfBirth = dateOfBirth;
    Gender = gender;
    Address = address;
    Email = email;
    ContactNumber = contactNumber;
    SportsPreference = sportsPreference;
    SkillLevel = skillLevel;
    MembershipType = membershipType;
    EmergencyContactNumber = emergencyContactNumber;
}
public Integer getId() {
    return Id;
}
public void setId(Integer id) {
    Id = id;
}
public String getFullName() {
    return FullName;
}
public void setFullName(String fullName) {
    FullName = fullName;
}
public LocalDate getDateOfBirth() {
    return DateOfBirth;
}
public void setDateOfBirth(LocalDate dateOfBirth) {
    DateOfBirth = dateOfBirth;
}
public String getGender() {
    return Gender;
}
public void setGender(String gender) {
    Gender = gender;
}
public String getAddress() {
    return Address;
}
public void setAddress(String address) {
    Address = address;
}
public String getEmail() {
    return Email;
}
public void setEmail(String email) {
    Email = email;
}
public String getContactNumber() {
    return ContactNumber;
}
public void setContactNumber(String contactNumber) {
    ContactNumber = contactNumber;
}
public String[] getSportsPreference() {
    return SportsPreference;
}
public void setSportsPreference(String[] sportsPreference) {
    SportsPreference = sportsPreference;
}
public String getSkillLevel() {
    return SkillLevel;
}
public void setSkillLevel(String skillLevel) {
    SkillLevel = skillLevel;
}
public String getMembershipType() {
    return MembershipType;
}
public void setMembershipType(String membershipType) {
    MembershipType = membershipType;
}
public String getEmergencyContactNumber() {
    return EmergencyContactNumber;
}
public void setEmergencyContactNumber(String emergencyContactNumber) {
    EmergencyContactNumber = emergencyContactNumber;
}
@Override
public String toString() {
    return "SportClub [Id=" + Id + ", FullName=" + FullName + ", DateOfBirth=" + DateOfBirth + ", Gender=" + Gender
            + ", Address=" + Address + ", Email=" + Email + ", ContactNumber=" + ContactNumber + ", SportsPreference="
            + SportsPreference + ", SkillLevel=" + SkillLevel + ", MembershipType=" + MembershipType
            + ", EmergencyContactNumber=" + EmergencyContactNumber + "]";
}



  

}