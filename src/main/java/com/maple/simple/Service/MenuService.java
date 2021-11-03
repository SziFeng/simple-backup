package com.maple.simple.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.maple.simple.Mapper.MenuMapper;
import com.maple.simple.Vo.Menu;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @DESCRIPTION:
 * @Author maple
 * @Date 2021/11/3
 */

@Service
public class MenuService extends ServiceImpl<MenuMapper, Menu> {

    public List<Menu> getAllMenu() {
        return lambdaQuery().list();
    }

}
