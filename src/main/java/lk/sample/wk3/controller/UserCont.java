package lk.sample.wk3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.sample.wk3.model.UserModel;
import lk.sample.wk3.service.IUserServ;

@RestController
@RequestMapping("/user")
public class UserCont {
    @Autowired
    IUserServ userServ;

    @GetMapping
    public Iterable<UserModel> getALL(){
        return userServ.getUser();
    }

    @PostMapping
    public  UserModel  addOne(@RequestBody UserModel userModel){
        return userServ.addUser(userModel);
    }
}
