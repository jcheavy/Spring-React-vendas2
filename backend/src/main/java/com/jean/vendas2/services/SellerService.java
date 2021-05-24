package com.jean.vendas2.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jean.vendas2.dto.SellerDTO;
import com.jean.vendas2.entities.Seller;
import com.jean.vendas2.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	SellerRepository repository;

	public List<SellerDTO> findAll() {
		
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
