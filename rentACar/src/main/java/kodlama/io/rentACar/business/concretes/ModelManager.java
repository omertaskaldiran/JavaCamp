package kodlama.io.rentACar.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.ModelService;
import kodlama.io.rentACar.business.requests.CreateModelRequest;
import kodlama.io.rentACar.business.requests.UpdateModelRequest;
import kodlama.io.rentACar.business.responses.GetAllModelsResponse;
import kodlama.io.rentACar.business.responses.GetByIdModelResponse;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.ModelRepository;
import kodlama.io.rentACar.entities.concretes.Model;
import lombok.AllArgsConstructor;

@Service  // IOC ye yerleşsin diye
@AllArgsConstructor   // depency enjeksiyon için  
public class ModelManager implements ModelService {
	
	private ModelRepository modelRepository;
	private ModelMapperService modelMapperService;


	@Override
	public List<GetAllModelsResponse> getAll() {
		
		List<Model> models = modelRepository.findAll();
		
		List<GetAllModelsResponse> modelsResponse = models.stream()
				.map(model->this.modelMapperService.forResponse()
						.map(model, GetAllModelsResponse.class)).toList();
		
		return modelsResponse ;
	}


	@Override
	public GetByIdModelResponse getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void add(CreateModelRequest createModelRequest) {
		Model model = this.modelMapperService.forRequest()
				.map(createModelRequest, Model.class); // requestten gelen verileri brand e map ediyor.
		
        this.modelRepository.save(model);
		
	}


	@Override
	public void update(UpdateModelRequest updateModelRequest) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
