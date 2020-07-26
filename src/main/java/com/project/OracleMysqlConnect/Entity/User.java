/**
 * 
 */
package com.project.OracleMysqlConnect.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ngupta253
 *
 */
@Entity
@Table(name = "USER_TABLE")
public class User {

	@Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;	
	@Column(name = "USER_NAME", nullable = true, length = 255)
    private String name;  
    @Column(name = "USER_SALARY", nullable = true, length = 10)
    private Integer salary;
    @Column(name = "USER_ADDRESS", nullable = true, length = 10)
    private String address;
    @Column(name = "USER_ANNUALINC", nullable = true, length = 10)
    private Integer annualInc;
    @Column(name = "USER_COMPANYNAME", nullable = true, length = 10)
    private String companyName;  
    @Column(name = "USER_VEHICLENO", nullable = true, length = 10)
    private String EMPVehNO; 
    @Column(name = "USER_VEHICLETYPE", nullable = true, length = 10)
    private String typeOFVehicle; 
    @Column(name = "USER_EXPERIANCE", nullable = true, length = 10)
    private String Experience; 
  
    protected User() {
    }
    
    
    /**
  	 * @return the id
  	 */
  	public Integer getId() {
  		return id;
  	}

  	/**
  	 * @param id the id to set
  	 */
  	public void setId(Integer id) {
  		this.id = id;
  	}

  	/**
  	 * @return the name
  	 */
  	public String getName() {
  		return name;
  	}

  	/**
  	 * @param name the name to set
  	 */
  	public void setName(String name) {
  		this.name = name;
  	}

  	/**
  	 * @return the salary
  	 */
  	public Integer getSalary() {
  		return salary;
  	}

  	/**
  	 * @param salary the salary to set
  	 */
  	public void setSalary(Integer salary) {
  		this.salary = salary;
  	}
    //constructor, setters and getters omitted for brevity


	/**
	 * @return the address
	 */
	public final String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public final void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the annualInc
	 */
	public final Integer getAnnualInc() {
		return annualInc;
	}


	/**
	 * @param annualInc the annualInc to set
	 */
	public final void setAnnualInc(Integer annualInc) {
		this.annualInc = annualInc;
	}


	/**
	 * @return the companyName
	 */
	public final String getCompanyName() {
		return companyName;
	}


	/**
	 * @param companyName the companyName to set
	 */
	public final void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	/**
	 * @return the eMPVehNO
	 */
	public final String getEMPVehNO() {
		return EMPVehNO;
	}


	/**
	 * @param eMPVehNO the eMPVehNO to set
	 */
	public final void setEMPVehNO(String eMPVehNO) {
		EMPVehNO = eMPVehNO;
	}


	/**
	 * @return the typeOFVehicle
	 */
	public final String getTypeOFVehicle() {
		return typeOFVehicle;
	}


	/**
	 * @param typeOFVehicle the typeOFVehicle to set
	 */
	public final void setTypeOFVehicle(String typeOFVehicle) {
		this.typeOFVehicle = typeOFVehicle;
	}


	/**
	 * @return the experience
	 */
	public final String getExperience() {
		return Experience;
	}


	/**
	 * @param experience the experience to set
	 */
	public final void setExperience(String experience) {
		Experience = experience;
	}

}
