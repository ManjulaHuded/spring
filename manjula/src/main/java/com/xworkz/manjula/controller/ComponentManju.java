package com.xworkz.manjula.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.manjula.dto.BeverageDTO;
import com.xworkz.manjula.dto.ChatDTO;
import com.xworkz.manjula.dto.EductionDTO;
import com.xworkz.manjula.dto.FamilyDTO;
import com.xworkz.manjula.dto.MobileDTO;

@Component
@RequestMapping("/")
public class ComponentManju {

	public ComponentManju() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/test")
	public String onEmail(Model model) {
		model.addAttribute("email", "manjulahuded.xworkz@gmail.com");
		return "index.jsp";
	}

	@GetMapping("/phone")
	public String onMobile(Model model) {
		model.addAttribute("mobile", 9380532567l);
		return "index.jsp";
	}

	@GetMapping("/id")
	public String onAadhar(Model model) {
		model.addAttribute("aadhar", 58544632795l);
		return "index.jsp";
	}

	@GetMapping("/age")
	public String onAge(Model model) {
		model.addAttribute("age", 23);
		return "index.jsp";
	}

	@GetMapping("/dob")
	public String onDOB(Model model) {
		model.addAttribute("Dob", LocalDateTime.of(2023, 02, 06, 04, 30));
		return "index.jsp";
	}

	@GetMapping("/salary")
	public String onDesiredSalary(Model model) {
		model.addAttribute("DesiredSal", 30000);
		return "index.jsp";
	}

	@GetMapping("/friend")
	public String onBestFriendsName(Model model) {
		List<String> ref = new ArrayList<String>();
		ref.add("Shruti");
		ref.add("Vaishnavi");
		ref.add("Siddu");
		ref.add("Kanakesh");
		ref.add("Abhishek");
		model.addAttribute("best", ref);
		return "index.jsp";
	}

	@GetMapping("/place")
	public String onVisitedPlaces(Model model) {
		List<String> ref1 = new ArrayList<String>();
		ref1.add("Bagalkot");
		ref1.add("Mudhol");
		ref1.add("Bilagi");
		ref1.add("Goa");
		model.addAttribute("data", ref1);

		return "index.jsp";
	}

	@GetMapping("/set")
	public String onSkills(Model model) {
		List<String> ref2 = new ArrayList<String>();
		ref2.add("Java");
		ref2.add("MySql");
		ref2.add("Html");
		ref2.add("Servlet");
		ref2.add("Spring");
		model.addAttribute("info", ref2);
		return "index.jsp";
	}

	@GetMapping("/eduction")
	public String onEductionDTO(Model model) {
		EductionDTO dto = new EductionDTO();
		dto.setAddress("Navagar Bagalkot");
		dto.setCgpa(7.9);
		dto.setCollege("GPT Bagalkot");
		dto.setCollegeAddress("Mudhol");
		dto.setCollegeFees(62000);
		dto.setCollegeName("BGMIT Mudhol");
		dto.setSchoolAddress(" Navagar Bagalkot");
		dto.setSchoolFees(2000);
		dto.setSchoolName("GJTS Bagalkot");
		dto.setSchoolPercentage(75);
		model.addAttribute("eduction", dto);
		return "index.jsp";

	}

	@GetMapping("/happy")
	public String onFamilyDTO(Model model) {
		FamilyDTO dto = new FamilyDTO();
		dto.setMother("Basamma");
		dto.setFather("Anand");
		dto.setGrandMaa("Sangamma");
		dto.setMonthlyIncome(12000);
		dto.setNoOfChildrens(4);
		dto.setNoOfSiblings(3);
		dto.setNoOfVehicle(2);
		dto.setSister1("Sheetal");
		dto.setSister2("Shilpa");
		dto.setBrother("Muttu");
		model.addAttribute("Haven", dto);
		return "index.jsp";

	}

	@GetMapping("/cell")
	public String onMobileDTO(Model model) {
		MobileDTO dto = new MobileDTO();
		dto.setDeviceName("Redmi");
		dto.setDeviceModel("Redmi Note 6 pro");
		dto.setColor("Black");
		dto.setPrice(30000);
		dto.setStroage("64GB");
		model.addAttribute("smart", dto);
		return "index.jsp";

	}

	@GetMapping("/drink")
	public String onBevarage(Model ref) {
		System.out.println("Running onBevarage");
		BeverageDTO bevarageDTO = new BeverageDTO();
		bevarageDTO.setBrandName("Nandini");
		bevarageDTO.setBevarageName("MilkShake");
		bevarageDTO.setMfgDate(LocalDate.of(2022, 12, 31));
		bevarageDTO.setExpiryDate(LocalDate.of(2023, 03, 20));
		bevarageDTO.setPrice(35);
		bevarageDTO.setMilkContentInGm(2.5);
		bevarageDTO.setSugarContentInGm(3.6);
		bevarageDTO.setAvalaibleIn(250);
		ref.addAttribute("coldDrink", bevarageDTO);
		return "index.jsp";
	}

	@GetMapping("/chat")
	public String getChat(Model ref) {
		System.out.println("Runnning getChat...");
		ChatDTO chatDTO = new ChatDTO();
		chatDTO.setChatShopName("Bangarpete chat shop");
		chatDTO.setChatName("Panipuri");
		chatDTO.setNoOfPiece(6);
		chatDTO.setIngredient1("Puri");
		chatDTO.setIngredient2("Aloo");
		chatDTO.setIngredient3("Sweet");
		chatDTO.setIngredient4("khara");
		chatDTO.setIngredient5("Chat masala");
		chatDTO.setIngredient6("Garam masala");
		chatDTO.setIngredient7("Pani");
		chatDTO.setPrice(35);
		ref.addAttribute("chat", chatDTO);
		return "index.jsp";
	}

}
