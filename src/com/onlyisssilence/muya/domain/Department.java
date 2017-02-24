package com.onlyisssilence.muya.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: MuYa
 * Date  : 2017/2/24
 * Description:
 */
public class Department {

    private Integer did;
    private String dname;
    private String ddesc;


    private Set<Employee> employees = new HashSet<>();

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDdesc() {
        return ddesc;
    }

    public void setDdesc(String ddesc) {
        this.ddesc = ddesc;
    }
}
