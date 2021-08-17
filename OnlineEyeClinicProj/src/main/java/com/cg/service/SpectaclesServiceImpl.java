package com.cg.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.Exceptions.SpectacleIdNotFoundException;
import com.cg.dao.ISpectaclesRepo;
import com.cg.model.Spectacles;

@Service
public class SpectaclesServiceImpl implements ISpectaclesService{
 
	@Autowired
	private ISpectaclesRepo spectRepo;
    //add data
	@Override
	public Spectacles addSpectacle(Spectacles spectacle) {
		return spectRepo.saveAndFlush(spectacle);
	}
    //delete a field by specifying the spectaclesId
	@Override
	public Spectacles removeSpectacle(int spectacleId)throws SpectacleIdNotFoundException{
		Supplier<SpectacleIdNotFoundException> supplier=()->new SpectacleIdNotFoundException("no spectacle is available with given id");
		Optional<Spectacles> s=Optional.ofNullable(spectRepo.findById(spectacleId).orElseThrow(supplier));
		spectRepo.deleteById(spectacleId);
		return s.get();
	}
    //update spectacle data 
	@Override
	public Spectacles updateSpectacle(Spectacles spectacle) {
		return spectRepo.saveAndFlush(spectacle);
	}
    //get spectacles data for specific spectacleId
	@Override
	public Spectacles getSpectacle(int spectacleId)throws SpectacleIdNotFoundException {
		Supplier<SpectacleIdNotFoundException> supplier=()->new SpectacleIdNotFoundException("no spectacle is available with given id");
		Optional<Spectacles> s=Optional.ofNullable(spectRepo.findById(spectacleId).orElseThrow(supplier));
		return s.get();
	}

	//get all data in spectacles
	@Override
	public List<Spectacles> getAllSpectacle() {
		return spectRepo.findAll();}
}
