package com.wildcodeschool.wildandwizard.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long capacity;
    private String country;
    
    @OneToMany(mappedBy = "school")
    public List<Wizard> wizards;
    
    // additional information:
/*    
    -->
    You notice that the class School will contain a reference to a list of Wizards. It will
    therefore be necessary to create getters and setters for it.
    
    Here, mappedBy contains the value "school": it refers to the attribute school of the
    class Wizard.
    
    To be read carefully: you must give the attribute the name you want to attach to the
    value of mappedBy. For example if in Wizard the name of the attribute was School foo, it
    would be necessary to write mappedBy = "foo" in the class Wizard.
    
    When recovering a school, it is now possible to have all the wizards associated with it:
    
*/

    
    // getter and setters:
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

	public List<Wizard> getWizards() {
		return wizards;
	}

	public void setWizards(List<Wizard> wizards) {
		this.wizards = wizards;
	}
}