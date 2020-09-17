package org.taskManagement.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.FetchType;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Task implements Serializable{
	
	private static final long serialVersionUID = 94758947589347598L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private LocalDateTime startDate;
	private LocalDateTime releaseDate;
	
	@ManyToOne
	private State state;
	@ManyToOne
	private TypeStudy typeStudy;
	@ManyToOne
	private Sector sector;
	@ManyToOne
	private AppUser appUser;
	
	
	@OneToMany(mappedBy = "task")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Collection<Pole> poles;
	
	
}
