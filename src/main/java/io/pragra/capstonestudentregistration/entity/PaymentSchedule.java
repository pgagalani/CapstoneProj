package io.pragra.capstonestudentregistration.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="PAYMENT_SCHEDULE")
public class PaymentSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long scheduleId;
    @Column
    private double amount_due;
    @Column
    private Date datePaid;
    @Column
    private double invoiceNum;
    @Column
    private String initals;
    @OneToOne(targetEntity = Student.class,cascade = CascadeType.ALL)
    private long studentId;

    public PaymentSchedule() {
    }

    public PaymentSchedule(double amount_due, Date datePaid, double invoiceNum, String initals, long studentId) {
        this.amount_due=amount_due;
        this.datePaid=datePaid;
        this.invoiceNum=invoiceNum;
        this.initals=initals;
        this.studentId=studentId;
    }


    public double getAmount_due() {
        return amount_due;
    }

    public void setAmount_due(double amount_due) {
        this.amount_due = amount_due;
    }

    public Date getDatePaid() {
        return datePaid;
    }

    public void setDatePaid(Date datePaid) {
        this.datePaid = datePaid;
    }

    public double getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(double invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getInitals() {
        return initals;
    }

    public void setInitals(String initals) {
        this.initals = initals;
    }
}
