package com.xworkz.manju.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.manju.dto.PastriesDTO;
import com.xworkz.manju.entity.PastriesEntity;
import com.xworkz.manju.repository.PastriesRepository;

@Service
public class PastriesServiceImpl implements PastriesService {

	@Autowired
	private PastriesRepository repositoryPastries;

	public PastriesServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<PastriesDTO>> validateAndSave(PastriesDTO dto) {
		System.out.println("Running validateAndSave method in service..");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<PastriesDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations in dto" + dto);
			return violations;
		} else {
			System.out.println("There is no violations in dto,can save.. ");
			PastriesEntity entity = new PastriesEntity();
			entity.setId(dto.getId());
			entity.setName(dto.getName());
			entity.setColor(dto.getColor());
			entity.setPrice(dto.getPrice());
			entity.setType(dto.getType());
			entity.setFlavour(dto.getFlavour());
			boolean saved = repositoryPastries.save(entity);
			System.out.println("saving" + saved);

			return Collections.emptySet();
		}
	}

	@Override
	public PastriesDTO findById(int id) {
		if (id > 0) {
			PastriesEntity entity = this.repositoryPastries.findById(id);
			if (entity != null) {
				System.out.println("entity is found in service for id" + id);
				PastriesDTO dto = new PastriesDTO();
				dto.setId(entity.getId());
				dto.setName(entity.getName());
				dto.setColor(entity.getColor());
				dto.setPrice(entity.getPrice());
				dto.setType(entity.getType());
				dto.setFlavour(entity.getFlavour());
				return dto;
			}

		}
		return PastriesService.super.findById(id);
	}

	@Override
	public List<PastriesDTO> findByColor(String color) {
		System.out.println("Running findByColor in service " + color);
		if (color != null && !color.isEmpty()) {
			System.out.println("Color is valid .. calling repo..");
			List<PastriesEntity> entities = this.repositoryPastries.findByColor(color);

			// list<entity>-->list<Dto> converting entity to DTO
			List<PastriesDTO> listOfDto = new ArrayList<PastriesDTO>();

			for (PastriesEntity entity : entities) {
				PastriesDTO dto = new PastriesDTO();
				dto.setId(entity.getId());
				dto.setName(entity.getName());
				dto.setColor(entity.getColor());
				dto.setPrice(entity.getPrice());
				dto.setType(entity.getType());
				dto.setFlavour(entity.getFlavour());
				listOfDto.add(dto);// adding to list
			}
			System.out.println("Size of dto" + listOfDto.size());
			System.out.println("Size of entities" + entities.size());
			return listOfDto;

		} else {
			System.out.println("Color is invalid");
		}
		return PastriesService.super.findByColor(color);
	}

	@Override
	public Set<ConstraintViolation<PastriesDTO>> validateAndUpdate(PastriesDTO dto) {
		System.out.println("Runnig validateAndUpdate in service..");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<PastriesDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations in dto" + dto);
			return violations;
		} else {
			System.out.println("There is no return violations in dto ,can update data..");
			PastriesEntity entity = new PastriesEntity();
			entity.setId(dto.getId());
			entity.setName(dto.getName());
			entity.setColor(dto.getColor());
			entity.setPrice(dto.getPrice());
			entity.setType(dto.getType());
			entity.setFlavour(dto.getFlavour());
			boolean update = this.repositoryPastries.update(entity);
			System.out.println("Data is updated" + update);
			return Collections.emptySet();

		}

	}

	@Override
	public boolean validateAndDelete(int id) {
		System.out.println("Running validateAndDelete in service.." + id);
		if (id < 0) {
			return false;
		} else {
			boolean delete = this.repositoryPastries.delete(id);
			System.out.println("Deleted" + delete);
			return delete;
		}
	}

}