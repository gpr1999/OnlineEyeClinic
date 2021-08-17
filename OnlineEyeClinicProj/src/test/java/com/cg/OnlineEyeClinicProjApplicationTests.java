package com.cg;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.cg.dao.ISpectaclesRepo;

@SpringBootTest
class OnlineEyeClinicProjApplicationTests {
	
	@Autowired
	 ISpectaclesRepo repo;
		@Test
	public	void testSpectaclesId() {
			int id=204;
			assertNotNull(repo.findById(id).get());
		}
		
		@Test
		public void testGetSpectacles() {
			assertNotNull(repo.findAll());
		}
		

	}


