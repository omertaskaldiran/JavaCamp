package kodlama.io.rentACar.entities.concretes;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="brands")
@Data    // loombok sayesinde getter ve setterlerden kurtulduk.
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Brand {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy = "brand")
	List<Model> model;

}
