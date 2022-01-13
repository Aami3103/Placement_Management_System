package com.placementmanagement.Placement.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placementmanagement.Placement.model.Placement;
import com.placementmanagement.Placement.repository.PlacementRepository;

@Service
public class PlacementService {

	@Autowired
    private PlacementRepository repo;
	
	public List<Placement> listAll() {
        return repo.findAll();
    }
     
    public void save(Placement plc) {
        repo.save(plc);
    }
     
    public Placement get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
 
}