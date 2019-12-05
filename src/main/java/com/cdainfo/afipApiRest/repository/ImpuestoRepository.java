package com.cdainfo.afipApiRest.repository;

import com.cdainfo.afipApiRest.domunio.Impuesto;
//import com.cdainfo.dto.ImpuestoClaveFiscalDto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;


@Repository
public interface ImpuestoRepository extends JpaRepository<Impuesto, Integer> {

	List<Impuesto> findAllByNombreLike(String nombre);

	List<Impuesto> findByIdimpuestos(Integer idimpuestos);

	List<Impuesto> findAllByFechaLiqBetween(Date fecha1, Date fecha2);

	// List<Impuesto> findAllByIdimpuestosAndFechaLiq(Integer idimpuestos, Date fecha);

}
