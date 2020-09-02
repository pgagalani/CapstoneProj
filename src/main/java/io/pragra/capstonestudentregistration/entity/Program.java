package io.pragra.capstonestudentregistration.entity;
import javax.persistence.*;

@Entity
@Table(name = "PROGRAM_TABLE")
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long pid;

    @Column(length = 255, nullable = false)
    private String programName;

    @Column
    private double programFee;

    public Program() {
    }

    public Program(String programName, double programFee) {
        this.programName = programName;
        this.programFee = programFee;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public double getProgramFee() {
        return programFee;
    }

    public void setProgramFee(double programFee) {
        this.programFee = programFee;
    }

    @Override
    public String toString() {
        return "Program{" +
                "programName='" + programName + '\'' +
                ", programFee=" + programFee +
                '}';
    }
}
