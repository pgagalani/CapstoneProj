package io.pragra.capstonestudentregistration.entity;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT_EDUCATION")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 255, nullable = false)
    private String credentialType;

    @Column(length = 255, nullable = false)
    private String field;

    @Column(length = 255, nullable = false)
    private String instituteName;

    @Column(length = 5, nullable = false)
    private int yearOfGraduation;

 //   @OneToOne(targetEntity = Student.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
   // private Student student;
    @OneToOne(targetEntity = Student.class,cascade = CascadeType.ALL)
    private long studentId;

    public Education() {
    }

    public Education(String credentialType, String field, String instituteName, int yearOfGraduation, long student) {
        this.credentialType = credentialType;
        this.field = field;
        this.instituteName = instituteName;
        this.yearOfGraduation = yearOfGraduation;
        this.studentId = student;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCredentialType() {
        return credentialType;
    }

    public void setCredentialType(String credentialType) {
        this.credentialType = credentialType;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(int yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }

    public long getStudent() {
        return studentId;
    }

    public void setStudent(long student) {
        this.studentId = student;
    }

    @Override
    public String toString() {
        return "Education{" +
                "credentialType='" + credentialType + '\'' +
                ", field='" + field + '\'' +
                ", instituteName='" + instituteName + '\'' +
                ", yearOfGraduation=" + yearOfGraduation +
                ", student=" + studentId +
                '}';
    }
}
