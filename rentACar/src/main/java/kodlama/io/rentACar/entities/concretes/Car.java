package kodlama.io.rentACar.entities.concretes;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="cars")
@Data    // loombok sayesinde getter ve setterlerden kurtulduk.
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Car {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name ="plate", unique = true)
	private String plate;
	
	@Column(name ="dailyPrice")
	private double dailyPrice;
	
	@Column(name ="modelYear")
	private int modelYear;
	
	@Column(name ="state")  //1- Available 2 - Rented 3- Maintenance
	private State state;
	
	@Column(name ="fuel")
	private String fuel;
	
	@Column(name ="gear")
	private String gear;
	
	@Column(name ="startDate")
	private Date startDate;
	
	@Column(name ="endDate")
	private Date endDate;
	
	@ManyToOne
	@JoinColumn(name = "model_id")
	private Model model;

}
