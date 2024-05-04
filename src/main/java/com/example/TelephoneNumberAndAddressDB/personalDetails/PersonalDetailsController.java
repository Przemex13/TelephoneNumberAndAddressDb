package com.example.TelephoneNumberAndAddressDB.personalDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PersonalDetailsController {

    @Autowired
    private PersonalDetailService personalDetailService;

    @GetMapping("/personalDetails")
    public String showPersonaLDetailsList(Model model) {
        List<PersonalDetail> PersonaLDetailsList;
        PersonaLDetailsList = personalDetailService.listAll();
        model.addAttribute("PersonaLDetailsList", PersonaLDetailsList);

        return "personal_details";
    }




}


