package com.dj.ssm.web.page;

import com.dj.ssm.service.BaseDataService;
import com.dj.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * UserPageController
 **/
@Controller
@RequestMapping("/user")
public class UserPageController {

    @Autowired
    private UserService userService;

    @Autowired
    private BaseDataService baseDataService;

}
