package be.mobyus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Random;

@Controller
public class HelpController {
	@RequestMapping(value = "/show-nums", method = RequestMethod.GET)
    public String showNums(ModelMap model) {
		Random r = new Random();
        int[] nums = { r.nextInt(1005), r.nextInt(2589), r.nextInt(8526) };
        model.addAttribute("nums", nums);
        return "shownums";
    }
	@RequestMapping(value = "/show-time", method = RequestMethod.GET)
    public String showTime(ModelMap model) {
        return "showtime";
    }
}
