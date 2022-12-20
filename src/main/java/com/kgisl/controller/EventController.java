package com.kgisl.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
//mport org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kgisl.entity.User;
//import com.google.gson.Gson;
import com.kgisl.entity.Event;
//import com.kgisl.service.CustomerService;
import com.kgisl.service.EventService;
import com.kgisl.service.UserService;

@Controller
@RequestMapping("/")
public class EventController {

    @Autowired
    private EventService eventService;
    @Autowired
    private UserService userService;
   
    @GetMapping("/")
    public String viewpage1(Model theModel) {
      //  Event theEvent = new Event();
       // theModel.addAttribute("event", new Event());
    
        return "viewpage";
    }
    @GetMapping("/event-form")
    public String viewpage(Model theModel) {
      //  Event theEvent = new Event();
        theModel.addAttribute("event", new Event());
    
        return "event-form";
    }

    @GetMapping("/login")
    public String gotologin(Model theModel) {
      //  Event theEvent = new Event();
        theModel.addAttribute("loginpage", new User());
    
        return "login";
    }
    @PostMapping("/loginpage")
    public String login(@ModelAttribute ("loginpage") User user, Model model) {
        System.out.println("eneter in the login servlet");
        System.out.println(user);
        System.out.println(user.getUsername());
        List<User> user1= userService.loginUser(user);
        System.out.println("student2"+user1);
        if((user1 != null) && (user1.size() > 0)) {
         //System.out.println("hello");
         //model.addAttribute("student",user1);
        // session.setAttribute("student", user1);
         return "divide-form";
        }
    else{
        return "login";
        }
        
       }
      

    

    @GetMapping("/reg")
    public String gotoregister(Model theModel) {
      //  Event theEvent = new Event();
        theModel.addAttribute("user", new User());
    
        return "register";
    }
  
    @PostMapping("/savereg")
    public String saveRegister(@ModelAttribute("user") User theCustomer) {
    userService.saveRegister(theCustomer);
        return "redirect:/reg";
    }


    @PostMapping("/usertype")
    public String usertype(@RequestParam("gettype") String usertype) {

      System.out.println(usertype);
      String ab;
      if(usertype. equals("viwer")){
      ab="redirect:/list";
      }
     else
     {
        ab="redirect:/event-form";
     }
        return  ab;
    }

    
//      @RequestMapping(value="/getdata",method = RequestMethod.GET)
//     public void getdata(){
//     System.out.println("enter the servlet");
         
//     }
//     @RequestMapping(value="/list",method = RequestMethod.GET)
//    // @GetMapping("/list")
//     public ResponseEntity listCustomers(Model theModel) {
//         System.out.println("enter list servlet");
//         List < Customer > theCustomers = customerService.getCustomers();
//        // String g = new Gson().toJson(theCustomers);
//         theModel.addAttribute("customers",theCustomers);
        
//         return ResponseEntity.ok(theCustomers) ;
//     }

    @GetMapping("/list")
    public String listCustomers(Model theModel) {
        List < Event > theCustomers = eventService.getCustomers();
        theModel.addAttribute("customers", theCustomers);
        return "list-customers";
    }

//     @GetMapping("/showForm")
//     public String showFormForAdd(Model theModel) {
//         Customer theCustomer = new Customer();
//         theModel.addAttribute("customer", theCustomer);
//         return "customer-form";
//     }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("event") Event theCustomer) {
        eventService.saveCustomer(theCustomer);
        return "redirect:/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("customerId") int theId,
        Model theModel) {
    Event theCustomer = eventService.getCustomer(theId);
        theModel.addAttribute("event", theCustomer);
        return "event-form";
    }

//     @GetMapping("/delete")
//     public String deleteCustomer(@RequestParam("customerId") int theId) {
//         customerService.deleteCustomer(theId);
//         return "redirect:/customer/list";
//     }
}
