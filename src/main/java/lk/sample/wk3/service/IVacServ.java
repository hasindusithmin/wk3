package lk.sample.wk3.service;

import lk.sample.wk3.model.VacineModel;

public interface IVacServ {
    Iterable<VacineModel> getOneVac();

    VacineModel addOneVac(VacineModel vacineModel);
}
