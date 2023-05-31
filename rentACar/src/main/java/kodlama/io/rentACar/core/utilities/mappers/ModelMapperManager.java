package kodlama.io.rentACar.core.utilities.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ModelMapperManager implements ModelMapperService {
	
	private ModelMapper modemMapper;

	@Override
	public ModelMapper forResponse() {
		 this.modemMapper.getConfiguration()
		 .setAmbiguityIgnored(true)
		 .setMatchingStrategy(MatchingStrategies.LOOSE);
		 
		 return this.modemMapper;
	}

	@Override
	public ModelMapper forRequest() {
		 this.modemMapper.getConfiguration()
		 .setAmbiguityIgnored(true)
		 .setMatchingStrategy(MatchingStrategies.STANDARD);
		 
		 return this.modemMapper;
	}

}
