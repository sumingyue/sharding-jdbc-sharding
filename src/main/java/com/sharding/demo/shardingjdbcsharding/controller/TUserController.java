package com.sharding.demo.shardingjdbcsharding.controller;

import com.sharding.demo.shardingjdbcsharding.entity.TUser;
import com.sharding.demo.shardingjdbcsharding.repository.TUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TUserController {

    private final static Logger logger = LoggerFactory.getLogger(TUserController.class);

    @Resource
    private TUserRepository tUserRepository;

    /**
     * 根据班级编号创建布卡课程
     * @return
     * @throws Exception
     */
    @GetMapping(value = "/addBatch")
    public void addBatch() {
        for(int i=1;i<100;i++) {
            TUser tUser = new TUser();
            tUser.setId(i);
            tUser.setPassword("11111111111");
            tUser.setUser_name("smy");
            tUserRepository.insert(tUser);
        }
    }
    /**
     * 根据班级编号创建布卡课程
     * @return
     * @throws Exception
     */
    @GetMapping(value = "/find")
    public List<TUser> selectAll() {
        TUser tUser = new TUser();
        return tUserRepository.selectAll(tUser);
    }
}
