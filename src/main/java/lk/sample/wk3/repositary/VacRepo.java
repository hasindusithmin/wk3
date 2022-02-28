package lk.sample.wk3.repositary;

import org.springframework.data.repository.CrudRepository;

import lk.sample.wk3.model.VacineModel;

public interface VacRepo extends CrudRepository<VacineModel,String>{
    
}
