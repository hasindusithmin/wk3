package lk.sample.wk3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.sample.wk3.model.VacineModel;
import lk.sample.wk3.repositary.VacRepo;

@Service
public class VacServ implements IVacServ{

    @Autowired
    private VacRepo vacRepo;

    @Override
    public Iterable<VacineModel> getOneVac() {
        return vacRepo.findAll();
    }

    @Override
    public VacineModel addOneVac(VacineModel vacineModel) {
        return vacRepo.save(vacineModel);
    }
    
}
