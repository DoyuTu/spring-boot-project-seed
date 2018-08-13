package com.doyutu.springbootseedproject.service.impl;

import com.doyutu.springbootseedproject.entity.SeedUser;
import com.doyutu.springbootseedproject.mapper.SeedUserMapper;
import com.doyutu.springbootseedproject.service.SeedUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author DoyuTu
 * @since 2018-08-10
 */
@Service
public class SeedUserServiceImpl extends ServiceImpl<SeedUserMapper, SeedUser> implements SeedUserService {

}
