package com.example.TelephoneNumberAndAddressDB.personalDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    @GetMapping("/personalDetails/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model, RedirectAttributes redirectAttributes) {

        try {
            PersonalDetail personalDetail= personalDetailService.get(id);
            model.addAttribute("personalDetail", personalDetail);
            model.addAttribute("pageTitle", "Edit User (ID: " + id +")");
            return "personal_details_form";
        } catch (PersonalDetailNotFoundExemption e) {
            redirectAttributes.addFlashAttribute("message", "The User has been saved successfully");
            return "redirect:/personal_details";
        }
    }

    @PostMapping("/personal_details/save")
    public String savePersonalDetail(PersonalDetail personalDetail, RedirectAttributes ra){
        personalDetailService.save(personalDetail);
        ra.addFlashAttribute("message", "The User has been saved successfully");
        return "redirect:/personalDetails";
    }

    @GetMapping("/personalDetalis/new")
    public String showNewForm (Model model){
        model.addAttribute("personalDetail", new PersonalDetail());
        model.addAttribute("pageTitle", "New Record");
        return "personal_details_form";
    }

    @GetMapping("/personalDetails/delete/{id}")
    public String deletePersonalDetails(@PathVariable("id")Integer id, RedirectAttributes ra)  {
        try {
            personalDetailService.delete(id);
        } catch (PersonalDetailNotFoundExemption e) {
            ra.addFlashAttribute("message", "Person with number : " + id + " has been deleted");
        }
        return "redirect:/personalDetails";
    }
}


