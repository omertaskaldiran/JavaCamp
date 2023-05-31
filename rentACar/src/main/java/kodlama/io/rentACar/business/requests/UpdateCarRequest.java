package kodlama.io.rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateCarRequest {
	
	private int id;
	private String plate;
	private double dailyPrice;
	private int modelYear;
	private int state;
	private String fuel;
	private String gear;
	private int modelId;

}
