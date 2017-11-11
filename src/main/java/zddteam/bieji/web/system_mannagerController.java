package zddteam.bieji.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import zddteam.bieji.dao.system_mannagerRepository;

@Controller
@RequestMapping(value = "/system_mannager")
public class system_mannagerController {

    @Autowired
    private system_mannagerRepository mannager;

    @RequestMapping
    @ResponseBody
    public Iterable getMannagerList(){
        return mannager.findAll();
    }
}
