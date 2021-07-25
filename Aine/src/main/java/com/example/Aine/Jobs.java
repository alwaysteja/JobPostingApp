package com.example.Aine;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "jobs")
@Entity
public class Jobs{


@Column(name = "Job_id")
@Id
private int jobId;
@Column (name = "Job_title")
private String job_title;
@Column (name = "Job_company")
private String	Job_company;
@Column (name = "Job_location")
private String	Job_location;
@Column (name = "Job_des")
private String	Job_des;
@Column (name = "Job_skills")
private String	Job_skills;
@Column (name = "Job_exp")
private int	Job_exp;
@Column (name = "Job_salary")
private int	Job_salary;
@Column (name = "Job_poster")
private String	Job_poster;



public int getJobId() {
    return jobId;
}
public void setJobId(int jobId) {
    this.jobId = jobId;
}
public String getJob_title() {
    return job_title;
}
public void setJob_title(String job_title) {
    this.job_title = job_title;
}
public String getJob_company() {
    return Job_company;
}
public void setJob_company(String job_company) {
    Job_company = job_company;
}
public String getJob_location() {
    return Job_location;
}
public void setJob_location(String job_location) {
    Job_location = job_location;
}
public String getJob_des() {
    return Job_des;
}
public void setJob_des(String job_des) {
    Job_des = job_des;
}
public String getJob_skills() {
    return Job_skills;
}
public void setJob_skills(String job_skills) {
    Job_skills = job_skills;
}
public int getJob_exp() {
    return Job_exp;
}
public void setJob_exp(int job_exp) {
    Job_exp = job_exp;
}
public int getJob_salary() {
    return Job_salary;
}
public void setJob_salary(int job_salary) {
    Job_salary = job_salary;
}
public String getJob_poster() {
    return Job_poster;
}
public void setJob_poster(String job_poster) {
    Job_poster = job_poster;
}
	


}

