package com.cdainfo.afipApiRest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdainfo.afipApiRest.domunio.Relaciones;

	@Repository
	public interface RelacionesRepository extends JpaRepository<Relaciones, Integer> {
		List<Relaciones> findByIdrelaciones(Integer idrelaciones);

		List<Relaciones> findByCuil(Integer cuil);
}
