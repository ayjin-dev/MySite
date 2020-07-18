package com.ayjin.controller.admin;

import com.ayjin.mapper.ViewerMapper;
import com.ayjin.pojo.Viewer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/")
public class adminController {
    @RequestMapping({"","index"})
    public String admin(){
        return "admin/index";
    }
}
