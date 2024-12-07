package com.klef.jfsd.exam;

import javax.persistence.*;

@Entity
@Table(name = "Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deptid;

    @Column(name = "deptname")
    private String deptname;

    @Column(name = "deptlocation")
    private String deptlocation;

    @Column(name = "depthod")
    private String depthod;

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getDeptlocation() {
		return deptlocation;
	}

	public void setDeptlocation(String deptlocation) {
		this.deptlocation = deptlocation;
	}

	public String getDepthod() {
		return depthod;
	}

	public void setDepthod(String depthod) {
		this.depthod = depthod;
	}

 
}
