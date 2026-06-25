package Alumini.project.Aluminipro;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Document(collection = "mentorRegistrations")
public class MentorRegistration {

    @Id
    private String id;

    private String companyName;
    private String companyWebsite;
    private String companySize;
    private String industryDomain;
    private String designation;
    private String experience;
    private String location;

    @NotBlank
    private String fullName;

    @NotBlank
    private String phone;
    private String alternatePhone;

    @Email
    @NotBlank
    private String primaryEmail;
    private String secondaryEmail;
    private String linkedin;

    private String alumniStatus;
    private String registerNumber;
    private String department;
    private String passoutYear;
    private String degree;

    private String mentorshipMode;
    private String sessionsPerMonth;
    private String skills;
    private String bio;

    public MentorRegistration() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public String getCompanySize() {
        return companySize;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    public String getIndustryDomain() {
        return industryDomain;
    }

    public void setIndustryDomain(String industryDomain) {
        this.industryDomain = industryDomain;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAlternatePhone() {
        return alternatePhone;
    }

    public void setAlternatePhone(String alternatePhone) {
        this.alternatePhone = alternatePhone;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getAlumniStatus() {
        return alumniStatus;
    }

    public void setAlumniStatus(String alumniStatus) {
        this.alumniStatus = alumniStatus;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPassoutYear() {
        return passoutYear;
    }

    public void setPassoutYear(String passoutYear) {
        this.passoutYear = passoutYear;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMentorshipMode() {
        return mentorshipMode;
    }

    public void setMentorshipMode(String mentorshipMode) {
        this.mentorshipMode = mentorshipMode;
    }

    public String getSessionsPerMonth() {
        return sessionsPerMonth;
    }

    public void setSessionsPerMonth(String sessionsPerMonth) {
        this.sessionsPerMonth = sessionsPerMonth;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
