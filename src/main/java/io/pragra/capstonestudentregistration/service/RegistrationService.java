package io.pragra.capstonestudentregistration.service;

import io.pragra.capstonestudentregistration.Repository.PaymentRepo;
import io.pragra.capstonestudentregistration.Repository.RegistrationRepo;
import io.pragra.capstonestudentregistration.entity.Payment;
import io.pragra.capstonestudentregistration.entity.PaymentSchedule;
import io.pragra.capstonestudentregistration.entity.Registration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class RegistrationService {

    private RegistrationRepo repo;
    private PaymentRepo paymentRepo;
//    private PaymentSchedule paymentScheduleRepo;

    public RegistrationService(RegistrationRepo repo, PaymentRepo paymentRepo) {
        this.repo = repo;
        this.paymentRepo = paymentRepo;
     //   this.paymentScheduleRepo = paymentScheduleRepo;
    }

  /* public RegistrationService(RegistrationRepo repo) {
      this.repo = repo;
   }*/

    public Registration addRegistration(Registration registration){
        if (Objects.isNull(registration))
        {
            throw new RuntimeException("Registration Id is not present");
        }
        double amount_due=registration.getPaidFees().getTotalProgramFees()-registration.getPaymentSchedule().get(0).getAmountPaid();
         registration.getPaidFees().setAmountDue(amount_due);
        return this.repo.save(registration);
    }
    public List<Registration> getAll()
    {
        return this.repo.findAll();
    }

    public Registration updateRegistration(long registrationId, PaymentSchedule paymentSchedule){

        Optional<Registration> registration= repo.findById(registrationId);
        List<PaymentSchedule> paySchedule=new ArrayList<>();
        paySchedule=registration.get().getPaymentSchedule();
        paySchedule.add(paymentSchedule);
        registration.get().setPaymentSchedule(paySchedule);
        long payment_id=registration.get().getPaidFees().getId();
        double amount_due=registration.get().getPaidFees().getAmountDue()-paymentSchedule.getAmountPaid();
     //  registration.get().getPaidFees().setAmountDue(amount_due);
        Payment payment=registration.get().getPaidFees();
        payment.setAmountDue(amount_due);
        this.paymentRepo.save(payment);
       return this.repo.save(registration.get());
    }
}
