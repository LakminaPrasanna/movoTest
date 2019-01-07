/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.lang.annotation.Annotation;
import javax.enterprise.inject.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 *
 * @author lakmina
**/
@Controller
@RequestMapping("/employee-module/addNew")
@SessionAttributes("employee")
public class WebFormController
{
    @Autowired
    EmployeeManager manager;
     
    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model)
    {
         Model employeeVO;
        employeeVO = new Model() {
             @Override
             public Class<? extends Annotation> annotationType() {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
         };
         model.addAttribute("employee", employeeVO);
         return "form";
    }
     
    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(@ModelAttribute("employee") Model employeeVO,
                            BindingResult result, SessionStatus status)
    {
        //Store the employee information in database
        //manager.createNewRecord(employeeVO);
         
        //Mark Session Complete
        status.setComplete();
        return "redirect:addNew/success";
    }
     
    @RequestMapping(value = "/success", method = RequestMethod.GET)
    public String success(Model model)
    {
         return "result";
    }
}