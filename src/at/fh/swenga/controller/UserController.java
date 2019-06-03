package at.fh.swenga.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import at.fh.swenga.model.LogModel;
import at.fh.swenga.model.UserModel;
import at.fh.swenga.repository.ForumentryRepository;
import at.fh.swenga.repository.LogRepository;
import at.fh.swenga.repository.UserRepository;

@Controller
public class UserController {

	/*@Autowired
	UserRepository userRepository;
	
	@Autowired
	LogRepository logRepository;
	
	@Autowired
	ForumentryRepository forumentryRepository; */

	@RequestMapping(value = { "/", "list" })
	public String index(Model model) {
	/*	List<UserModel> users = userRepository.findAll();
		model.addAttribute("users", users);
		model.addAttribute("count", users.size()); */
		return "index";
	}
	
	/*@RequestMapping(value = { "/getPage" })
	public String getPage(Pageable page,Model model) {
		Page<UserModel> usersPage = userRepository.findAll(page);
		model.addAttribute("usersPage", usersPage);
		model.addAttribute("users", usersPage.getContent());
		model.addAttribute("count", usersPage.getTotalElements());
		return "index";
	}
*/
	

	



	
 /*	 @RequestMapping("/fillUser")
	 public String fillData(Model model)
	 {
	 
		DataFactory df = new DataFactory();
		String array[]= {"Niels Bohr","Albert Einstein","Marie Curie","Lord Rayleigh"};
		String array2[]= {"Physics","Chemistry","Literature","Peace"};

		
		UserModel user = null;
		
		for(int i=0;i<15;i++) {
			 if (i%10==0) {
				String userName=df.getName();		//"User1";
				user = userRepository.findFirstByUserName(userName);
				if (user==null) {
					user = new UserModel(userName);
				}
			} 
			
			Calendar dob = Calendar.getInstance();
			dob.setTime(df.getBirthDate());
			
			UserModel userModel = new UserModel(df.getFirstName(), array[df.getNumberBetween(0, 4)],array2[df.getNumberBetween(0, 4)], df.getBirthDate(), "m", 187.5, 76.3, 5, "fdnsdf@gmx.at", 54.3, true, true);
			
			
		
			// userModel.setCountry(country);
			userRepository.save(userModel);
		}
	
		return "forward:list";
	 } */

	/*@RequestMapping("/delete")
	public String deleteData(Model model, @RequestParam int id) {
		userRepository.deleteById(id);

		return "forward:list";
	} */

	@ExceptionHandler(Exception.class)
	public String handleAllException(Exception ex) {

		return "error";

	}
}