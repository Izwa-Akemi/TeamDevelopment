package template.team.model.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="blogs")
public class BlogEntity {
	@Id
	@Column(name="blog_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long blogId;
	
	@NonNull
	@Column(name="blog_title")
	private String blogTitle;
	
	@NonNull
	@Column(name="blog_img")
	private String blogImg;
	
	@NonNull
	@Column(name="blog_message")
	private String blogMessage;
	
	 @ManyToOne
	    @JoinColumn(name="admin_id")
	    private AdminEntity admins;
}
