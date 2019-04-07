package ImageHoster.model;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Ridvik
 *
 */

@Entity
@Table(name = "Comments")
public class Comment {

	@Id
	//Here the column name is explicitly mentioned as 'id'
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	// Text is a Postgres specific column type that allows you to save
	// text based data that will be longer than 256 characters

	@Column(columnDefinition = "TEXT")
	private String text;

	@Column(name = "createdDate")
	private Date createdDate;


	//The 'images' table is mapped to 'users' table with Many:One mapping
	//One image can have only one user (owner) but one user can have multiple images
	//FetchType is EAGER
	@ManyToOne(fetch = FetchType.EAGER)
	//Below annotation indicates that the name of the column in 'images' table referring the primary key in 'users' table will be 'user_id'
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne(fetch = FetchType.EAGER)
	//Below annotation indicates that the name of the column in 'images' table referring the primary key in 'users' table will be 'user_id'
	@JoinColumn(name = "image_id")
	private Image image;


	public Comment() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}


