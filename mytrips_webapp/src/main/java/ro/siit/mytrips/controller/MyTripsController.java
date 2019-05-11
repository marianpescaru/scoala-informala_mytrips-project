package ro.siit.mytrips.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ro.siit.mytrips.service.MyTripsService;


@Controller
@RequestMapping(path="/mytrips")
public class MyTripsController {

    @Autowired
    MyTripsService myTripsService;

    @GetMapping(path = "")
    public ModelAndView getAllTrips() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("mytrips");
        mv.addObject("mytrips", myTripsService.getAllTrips());
        return mv;
    }
}
