package lk.sample.wk3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.sample.wk3.model.UserModel;
import lk.sample.wk3.repositary.UserRep;
import lk.sample.wk3.repositary.VacRepo;

@Service
public class UserServ implements IUserServ{

    @Autowired
    private UserRep userRep;
    @Autowired
    private VacRepo vacRepo;
    @Override
    public Iterable<UserModel> getUser() {
        return userRep.findAll();
    }

    @Override
    public UserModel addUser(UserModel userModel) {
        vacRepo.save(userModel.getVacId());
        return userRep.save(userModel);
    }
    
    

}
