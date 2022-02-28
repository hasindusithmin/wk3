package lk.sample.wk3.repositary;

import org.springframework.data.repository.CrudRepository;

import lk.sample.wk3.model.UserModel;

public interface UserRep extends CrudRepository<UserModel,Integer>{
    
}
