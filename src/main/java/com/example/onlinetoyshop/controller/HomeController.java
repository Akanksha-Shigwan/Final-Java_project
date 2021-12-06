package com.example.onlinetoyshop.controller;

import javax.servlet.http.HttpSession;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.onlinetoyshop.entity.CheckoutData;
import com.example.onlinetoyshop.entity.ContactData;
import com.example.onlinetoyshop.entity.LoginData;
import com.example.onlinetoyshop.entity.UserData;
import com.example.onlinetoyshop.repository.CheckRepository;
import com.example.onlinetoyshop.repository.ContactRepository;
import com.example.onlinetoyshop.repository.UserRepository;



@Controller
public class HomeController {
	
	@Autowired
	private UserRepository repo;
	@Autowired
	private CheckRepository check;
	@Autowired
	private ContactRepository con;

	
	@GetMapping("/home")
	public String home1()
	{
		return "home1";
	}
	
	@GetMapping("/homelogin")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/user")
	public String user()
	{
		return "user";
	}
	
	
	@GetMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	
	@GetMapping("/cart")
	public String cart()
	{
		return "cart";
	}
	
	@GetMapping("/puzzle")
	public String puzzle()
	{
		return "puzzles";
	}
	
	@GetMapping("/softtoy")
	public String softtoy()
	{
		return "softtoy";
	}
	
	@GetMapping("/build")
	public String build()
	{
		return "building";
	}
	
	@GetMapping("/doll")
	public String doll()
	{
		return "doll";
	}
	
	@GetMapping("/book")
	public String book()
	{
		return "book";
	}
	
	@GetMapping("/gift")
	public String gift()
	{
		return "gift";
	}
	
	@GetMapping("/0-2yrs")
	public String oneyrs()
	{
		return "0-2yrs";
	}
	
	@GetMapping("/3-7yrs")
	public String sevenyrs()
	{
		return "3-7yrs";
	}
	
	@GetMapping("/7-12yrs")
	public String twelveyrs()
	{
		return "7-12yrs";
	}
	
	@GetMapping("/12+yrs")
	public String twelveplus()
	{
		return "12+yrs";
	}
	
	@GetMapping("/marvel")
	public String marvel()
	{
		return "marvel";
	}
	
	@GetMapping("/disney")
	public String disney()
	{
		return "disney";
	}
	
	@GetMapping("/hotwheel")
	public String hotwheel()
	{
		return "hotwheel";
	}
	
	@GetMapping("/lego")
	public String lego()
	{
		return "lego";
	}
	
	@GetMapping("/about")
	public String aboutus()
	{
		return "about";
	}
	
	@GetMapping("/checkout")
	public String checkout()
	{
		return "checkout";
	}
	
	@GetMapping("/checkoutnote")
	public String checkoutnote()
	{
		return "checkoutnote";
	}
	
	@GetMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	
	@PostMapping("/contact")
	public String contact(@ModelAttribute ContactData c, HttpSession session)
	{
		System.out.println(c);
		con.save(c);
		
		return "/home";
	}
	
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserData u, HttpSession session)
	{
		System.out.println(u);
		
		repo.save(u);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/signup";
	}
	
	@PostMapping("/checkoutpage")
	public String checkoutpage(@ModelAttribute CheckoutData c, HttpSession session)
	{
		System.out.println(c);
		
		check.save(c);
		
		
		return "redirect:/checkoutnote";
	}
	
	
	
}
