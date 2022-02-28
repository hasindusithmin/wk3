package lk.sample.wk3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.sample.wk3.model.VacineModel;
import lk.sample.wk3.service.IVacServ;

@RestController
@RequestMapping("/vaccine")
public class VacCont {
    @Autowired
    IVacServ vacServ;

    @GetMapping
    public Iterable<VacineModel> getOne(){
        return vacServ.getOneVac();
    }
    
    @PostMapping
    public VacineModel addOne(@RequestBody VacineModel vacineModel){
        return vacServ.addOneVac(vacineModel);
    }
}
