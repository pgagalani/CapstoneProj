package io.pragra.capstonestudentregistration.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "PAYMENT_SCHEDULE")
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

  @OneToOne(targetEntity = Student.class,  cascade = CascadeType.ALL)
  @JoinColumn(name = "studentId", referencedColumnName = "studentId")
  private Student student;


  public PaymentSchedule() {

  }

  public PaymentSchedule(double amount_due, Date datePaid, double invoiceNum,
      Student student) {

    this.amount_due = amount_due;
    this.datePaid = datePaid;
    this.invoiceNum = invoiceNum;
    this.student = student;
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


}
