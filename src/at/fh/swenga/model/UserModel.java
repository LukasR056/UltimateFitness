package at.fh.swenga.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "User")
public class UserModel implements java.io.Serializable {

	@Id
	@Column(name = "id")
	public int id;
	
	@Column()
	private String firstName;
	@Column()
	private String lastName;
	@Column(unique = true)
	public String userName;
	@Column()
	public Date birthDate;
	@Column()
	private boolean gender;
	@Column()
	private float height;
	@Column()
	private float weight;
	@Column()
	private int coach;
	@Column(unique = true)
	private String eMail;
	@Column()
	private float bmi;
	@Column()
	private boolean isAdmin;
	@Column()
	private boolean enabled;
	
	@OneToMany(mappedBy="userId",fetch=FetchType.LAZY)
	@OrderBy("id")
	private Set<LogModel> logs; 
	
	@OneToMany(mappedBy="userId",fetch=FetchType.LAZY)
	@OrderBy("id")
	private Set<ForumentryModel> entries;

	public UserModel ()
	{
		
	}
	
	
	public UserModel(int id, String firstName, String lastName, String userName, Date birthDate, boolean gender,
			float height, float weight, int coach, String eMail, float bmi, boolean isAdmin, boolean enabled) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.birthDate = birthDate;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.coach = coach;
		this.eMail = eMail;
		this.bmi = bmi;
		this.isAdmin = isAdmin;
		this.enabled = enabled;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getCoach() {
		return coach;
	}

	public void setCoach(int coach) {
		this.coach = coach;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public float getBmi() {
		return bmi;
	}

	public void setBmi(float bmi) {
		this.bmi = bmi;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eMail == null) ? 0 : eMail.hashCode());
		result = prime * result + id;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserModel other = (UserModel) obj;
		if (eMail == null) {
			if (other.eMail != null)
				return false;
		} else if (!eMail.equals(other.eMail))
			return false;
		if (id != other.id)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", birthDate=" + birthDate + ", gender=" + gender + ", height=" + height + ", weight=" + weight
				+ ", coach=" + coach + ", eMail=" + eMail + ", bmi=" + bmi + ", isAdmin=" + isAdmin + ", enabled="
				+ enabled + "]";
	}

}
