package com.maple.simple.Controller;

import com.maple.simple.Service.MenuService;
import com.maple.simple.Vo.Menu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @DESCRIPTION:
 * @Author maple
 * @Date 2021/11/3
 */

@RestController
@RequestMapping("/api/menu")
public class MenuController {

    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("getAllMenu")
    public List<Menu> getAllMenu(){
        return menuService.getAllMenu();
    }
}
