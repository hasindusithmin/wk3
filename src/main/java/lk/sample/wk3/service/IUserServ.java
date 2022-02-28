package lk.sample.wk3.service;

import lk.sample.wk3.model.UserModel;

public interface IUserServ{
    Iterable<UserModel> getUser();

    UserModel addUser(UserModel userModel);
}
