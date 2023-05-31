package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
	
	private BrandService brandService;
 
	@GetMapping()
	public List<GetAllBrandsResponse> getAll(){
		
		return brandService.getAll();
	}
	
	@GetMapping("/{id}")
	public GetByIdBrandResponse getById(@PathVariable int id){ // pathvariable, gelecek parametrelerden oku demek.
		return brandService.getById(id);
	}
	
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody() @Valid CreateBrandRequest brandRequest) {
		this.brandService.add(brandRequest);
	}
	
	@PutMapping
	public void update(@RequestBody UpdateBrandRequest  updateBrandRequest) {	
		this.brandService.update(updateBrandRequest);	
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		
		this.brandService.delete(id);
		
	}
	
	

}
