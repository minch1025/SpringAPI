package com.mincho.MinchJuice.service;

import java.util.List;
import com.mincho.MinchJuice.dao.ToyblogDAO;
import com.mincho.MinchJuice.logic.*;
import com.mincho.MinchJuice.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ToyblogServiceImpl implements ToyblogService{

	@Autowired
	ToyblogDAO toyblogDAO;

	public List<Toyblog> getToyblogList() {
		System.out.println("==================================================");
		return toyblogDAO.getToyblogList();
	}
	
}