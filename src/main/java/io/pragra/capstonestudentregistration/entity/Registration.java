package io.pragra.capstonestudentregistration.entity;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "REGISTRATION_INFO")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(targetEntity = Student.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Student student;

    @OneToMany(targetEntity = Program.class,cascade = CascadeType.ALL)
    private List<Program> programs;

    @OneToMany(targetEntity = Education.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Education> education;

    @OneToMany(targetEntity = Employer.class,cascade = CascadeType.ALL)
    private List<Employer> employers;

    @OneToOne(targetEntity = Payment.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Payment paidFees;

    @OneToMany(targetEntity = PaymentSchedule.class,cascade = CascadeType.ALL)
    private List<PaymentSchedule> paymentSchedule;

    @Column
    @Temporal(TemporalType.DATE)
    private Date registrationDate;

    public List<PaymentSchedule> getPaymentSchedule() {
        return paymentSchedule;
    }

    public void setPaymentSchedule(List<PaymentSchedule> paymentSchedule) {
        this.paymentSchedule = paymentSchedule;
    }

    public Registration() {
    }

    public Registration(Student student, List<Program> programs, List<Education> education, List<Employer> employers, Payment paidFees, Date registrationDate){//,List<PaymentSchedule> paymentSchedule) {
        this.student = student;
        this.programs = programs;
        this.education = education;
        this.employers = employers;
        this.paidFees = paidFees;
        this.registrationDate = registrationDate;
       // this.paymentSchedule=paymentSchedule;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Program> getPrograms() {
        return programs;
    }

    public void setPrograms(List<Program> programs) {
        this.programs = programs;
    }

    public List<Education> getEducation() {
        return education;
    }

    public void setEducation(List<Education> education) {
        this.education = education;
    }

    public List<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(List<Employer> employers) {
        this.employers = employers;
    }

    public Payment getPaidFees() {
        return paidFees;
    }

    public void setPaidFees(Payment paidFees) {
        this.paidFees = paidFees;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "student=" + student +
                ", programs=" + programs +
                ", education=" + education +
                ", employers=" + employers +
                ", paidFees=" + paidFees +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
