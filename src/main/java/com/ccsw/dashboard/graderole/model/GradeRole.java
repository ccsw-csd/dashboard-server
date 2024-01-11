package com.ccsw.dashboard.graderole.model;

import jakarta.persistence.*;

@Entity
@Table(name = "vista_grados_roles")
public class GradeRole {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
    @Column(name="vc_Grado")
    private String grade;
    
    @Column(name="vc_Profile_Rol_L1")
    private String role;
    
    @Column(name="id_Import")
    private int idImport;
    
    @Column(name="id_Import_staffing")
    private int idImportStaffing;
    
    public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdImport() {
		return idImport;
	}

	public void setIdImport(int idImport) {
		this.idImport = idImport;
	}

	public int getIdImportStaffing() {
		return idImportStaffing;
	}

	public void setIdImportStaffing(int idImportStaffing) {
		this.idImportStaffing = idImportStaffing;
	}
		
}
