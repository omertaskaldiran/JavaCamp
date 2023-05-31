package kodlama.io.rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequest {
	private int id;
	private String plate;
	private double dailyPrice;
	private int modelYear;
	private int state;
	private String fuel;
	private String gear;
	private int modelId;

}
