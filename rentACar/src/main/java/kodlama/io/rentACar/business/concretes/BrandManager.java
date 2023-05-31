package kodlama.io.rentACar.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentACar.business.rules.BrandBusinessRules;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;

@Service  // bu sınıf bir business nesnesidir.
@AllArgsConstructor
public class BrandManager implements BrandService {
	
	private BrandRepository brandRepository;
	private ModelMapperService modelMapperService;
	private BrandBusinessRules brandBusinessRules;

	@Override
	public List<GetAllBrandsResponse> getAll() {
		
		List<Brand> brands = brandRepository.findAll();
		// stream brandsleri tek tek dolaşıyor for each gibi.
		// her bir brand için mapper servisten dönüş yapıyorum.
		// gelen her bir brandı da , get allbrandsresponse ye çevirip listesini alıyorum.
		List<GetAllBrandsResponse> brandsResponse = brands.stream()
				.map(brand->this.modelMapperService.forResponse()
						.map(brand,GetAllBrandsResponse.class)).toList();
		
		return brandsResponse ;
	}
	

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		
		this.brandBusinessRules.checkIfBrandNameExists(createBrandRequest.getName());
		
		Brand brand = this.modelMapperService.forRequest()
				.map(createBrandRequest, Brand.class); // requestten gelen verileri brand e map ediyor.
        this.brandRepository.save(brand);		
	}


	@Override
	public GetByIdBrandResponse getById(int id) {
	 Brand brand=this.brandRepository.findById(id).orElseThrow();  // id bulamazsa hata döndürecek.
	 
	 GetByIdBrandResponse getByIdBrandResponse = this.modelMapperService.forResponse().map(brand, GetByIdBrandResponse.class);
	 // geri dönüş tipi getByIdBrandResponse olduğu için, map ederek döndürdük. 
	 
		return getByIdBrandResponse;
	}


	public void update(UpdateBrandRequest updateBrandRequest) {
		Brand brand = this.modelMapperService.forRequest()
				.map(updateBrandRequest, Brand.class); // requestten gelen verileri brand e map ediyor.
        this.brandRepository.save(brand);	

	}


	@Override
	public void delete(int id) {	
		 this.brandRepository.deleteById(id);	
	}
	
	

}
