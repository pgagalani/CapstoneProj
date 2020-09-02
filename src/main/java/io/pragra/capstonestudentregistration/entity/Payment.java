package io.pragra.capstonestudentregistration.entity;

import javax.persistence.*;

@Entity
@Table(name = "PAYMENT_INFO")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private double registrationFee;

    @Column
    private double consultingFee;

    @Column
    private double totalProgramFees;

    @Column
    private int numOfInstallments;

  //  @OneToOne(targetEntity = Student.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
   // private Student student;

    @OneToOne(targetEntity = Student.class,cascade = CascadeType.ALL)
    private long studentId;

    public Payment() {
    }

    public Payment(double registrationFee, double consultingFee, double totalProgramFees, int numOfInstallments, long student) {
        this.registrationFee = registrationFee;
        this.consultingFee = consultingFee;
        this.totalProgramFees = totalProgramFees;
        this.numOfInstallments = numOfInstallments;
        this.studentId = student;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }

    public double getConsultingFee() {
        return consultingFee;
    }

    public void setConsultingFee(double consultingFee) {
        this.consultingFee = consultingFee;
    }

    public double getTotalProgramFees() {
        return totalProgramFees;
    }

    public void setTotalProgramFees(double programFee) {
        this.totalProgramFees = totalProgramFees;
    }

    public int getNumOfInstallments() {
        return numOfInstallments;
    }

    public void setNumOfInstallments(int numOfInstallments) {
        this.numOfInstallments = numOfInstallments;
    }

    public long getStudent() {
        return studentId;
    }

    public void setStudent(long student) {
        this.studentId = student;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "registrationFee=" + registrationFee +
                ", consultingFee=" + consultingFee +
                ", totalProgramFees=" + totalProgramFees +
                ", numOfInstallments=" + numOfInstallments +
                ", student=" + studentId +
                '}';
    }
}
