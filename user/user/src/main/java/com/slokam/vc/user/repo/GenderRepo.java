package com.slokam.vc.user.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.vc.user.entity.Gender;
				@Repository
				public interface GenderRepo extends JpaRepository<Gender, Integer> {

				}
