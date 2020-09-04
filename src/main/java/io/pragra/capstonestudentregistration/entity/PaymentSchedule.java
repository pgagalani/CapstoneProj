package io.pragra.capstonestudentregistration.entity;

import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PAYMENT_SCHEDULE")
public class PaymentSchedule {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long scheduleId;

  @Column
  private double amountPaid;

  @Column
  private Date datePaid;

  @Column
  private double invoiceNum=Math.round(Math.random()*100);

  @Enumerated(EnumType.STRING)
  @Column
  private PaymentType paymentType;
}
