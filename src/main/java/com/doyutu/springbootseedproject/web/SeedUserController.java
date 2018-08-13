package com.doyutu.springbootseedproject.web;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.doyutu.springbootseedproject.entity.SeedUser;
import com.doyutu.springbootseedproject.mapper.SeedUserMapper;
import com.doyutu.springbootseedproject.service.SeedUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DoyuTu
 * @version 0.0.1
 * spring-boot-seed-project
 */
@RestController
@Slf4j
public class SeedUserController {

    @Autowired
    private SeedUserService seedUserService;

    @GetMapping(value = "getAllSeedUser", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object getAllSeedUser() {
        Wrapper<SeedUser> seedUserWrapper = new EntityWrapper<>();
        return seedUserService.selectList(seedUserWrapper);
    }

    @GetMapping(value = "insertSeedUser/{userName}/{type}/{state}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object insertSeedUser(@PathVariable("userName")String userName,
                                 @PathVariable("type")String type,
                                 @PathVariable("state")String state) {
        SeedUser seedUser = new SeedUser()
                .setUserName(userName)
                .setState(state)
                .setType(type);
        return seedUserService.insert(seedUser);
    }

    @GetMapping(value = "updateSeedUserById/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object updateSeedUserById(@PathVariable Integer id) {
        SeedUser seedUser = new SeedUser()
                .setId(id)
                .setType("");
        return seedUserService.updateById(seedUser);
    }

}
