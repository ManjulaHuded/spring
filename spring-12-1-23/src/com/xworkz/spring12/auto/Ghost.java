package com.xworkz.spring12.auto;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	
	
	private String ghostName;
	private int ghostAge;
	private LocalDate deathDate;
	private boolean isLegsTwisted;
	private String ghostLastName;
	private boolean isSucide;
	private String profession;
	private boolean isMarried;
	private String motherName;
	private boolean naturalDeath;
	@Autowired
	@Qualifier("ghostColor")
	private String color;
	@Autowired
	@Qualifier("fatherName")
	private String fatherName;
	@Autowired
	@Qualifier("sisterName")
	private String sisterName;
	@Autowired
	@Qualifier("isMurder")
	private boolean isMurder;
	@Autowired
	@Qualifier("brotherName")
	private String brotherName;
	@Autowired
	@Qualifier("grandMotherName")
	private String grandMotherName;
	@Autowired
	@Qualifier("address")
	private String address;
	@Autowired
	@Qualifier("salary")
	private double salary;
	@Autowired
	@Qualifier("isChildren")
	private boolean isChildren;
	@Autowired
	@Qualifier("children")
	private int children;
	
	
	public Ghost(@Qualifier("ghostName") String ghostName,@Qualifier("ghostAge") int ghostAge, LocalDate deathDate,@Qualifier("isLegsTwisted") boolean isLegsTwisted,@Qualifier("ghostLastName") String ghostLastName,
		@Qualifier("isSucide")	boolean isSucide,@Qualifier("profession") String profession,@Qualifier("isMarried") boolean isMarried,@Qualifier("motherName") String motherName,@Qualifier("naturalDeath") boolean naturalDeath) {
		super();
		this.ghostName = ghostName;
		this.ghostAge = ghostAge;
		this.deathDate = deathDate;
		this.isLegsTwisted = isLegsTwisted;
		this.ghostLastName = ghostLastName;
		this.isSucide = isSucide;
		this.profession = profession;
		this.isMarried = isMarried;
		this.motherName = motherName;
		this.naturalDeath = naturalDeath;
	}


	@Override
	public String toString() {
		return "Ghost [ghostName=" + ghostName + ", ghostAge=" + ghostAge + ", deathDate=" + deathDate
				+ ", isLegsTwisted=" + isLegsTwisted + ", ghostLastName=" + ghostLastName + ", isSucide=" + isSucide
				+ ", profession=" + profession + ", isMarried=" + isMarried + ", motherName=" + motherName
				+ ", naturalDeath=" + naturalDeath + ", color=" + color + ", fatherName=" + fatherName + ", sisterName="
				+ sisterName + ", isMurder=" + isMurder + ", brotherName=" + brotherName + ", grandMotherName="
				+ grandMotherName + ", address=" + address + ", salary=" + salary + ", isChildren=" + isChildren
				+ ", children=" + children + "]";
	}
	
	
	
	

}
