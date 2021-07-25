package com.example.Candidates;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Table(name = "candidates")
@Entity
class Candidates{
    @Column(name = "Job_id")
     @Id
    private int jobId;
   
    @Column(name = "Candidate_name",table = "candidates")
    private String can_name;
    @Column(name = "Candidate_mail",table = "candidates")
    private String can_mail;
    @Column(name = "Candidate_phone",table = "candidates")
    private long can_phone;
    @Column(name = "Candidate_hq",table = "candidates")
    private String can_hq;
    @Column(name = "Candidate_exp",table = "candidates")
    private int can_exp;
    @Column(name = "Candidate_resume",table = "candidates")
    private String can_resume;
    public int getJobId() {
        return jobId;
    }
    public void setJobId(int jobId) {
        this.jobId = jobId;
    }
    public String getCan_name() {
        return can_name;
    }
    public void setCan_name(String can_name) {
        this.can_name = can_name;
    }
    public String getCan_mail() {
        return can_mail;
    }
    public void setCan_mail(String can_mail) {
        this.can_mail = can_mail;
    }
    public long getCan_phone() {
        return can_phone;
    }
    public void setCan_phone(long can_phone) {
        this.can_phone = can_phone;
    }
    public String getCan_hq() {
        return can_hq;
    }
    public void setCan_hq(String can_hq) {
        this.can_hq = can_hq;
    }
    public int getCan_exp() {
        return can_exp;
    }
    public void setCan_exp(int can_exp) {
        this.can_exp = can_exp;
    }
    public String getCan_resume() {
        return can_resume;
    }
    public void setCan_resume(String can_resume) {
        this.can_resume = can_resume;
    }
}

