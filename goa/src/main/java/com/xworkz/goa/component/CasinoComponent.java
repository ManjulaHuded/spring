package com.xworkz.goa.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.CasinoDTO;

@Component
@RequestMapping("/fee")
public class CasinoComponent {
	
	public CasinoComponent() {
		System.out.println("Created " +this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onCasino(CasinoDTO casinoDTO,Model model) {
		System.out.println(casinoDTO);
		model.addAttribute("name", casinoDTO.getName());
		model.addAttribute("cruise", casinoDTO.getCruise());
		model.addAttribute("entryFee", casinoDTO.getEntryFee());
		model.addAttribute("freeFood", casinoDTO.isFreeFood());
		return "CasinoSuccess.jsp";
		
		
	}

}
