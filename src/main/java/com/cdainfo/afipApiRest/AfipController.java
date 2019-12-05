package com.cdainfo.afipApiRest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cdainfo.afipApiRest.domunio.Impuesto;
import com.cdainfo.afipApiRest.domunio.Relaciones;
import com.cdainfo.afipApiRest.repository.ImpuestoRepository;
import com.cdainfo.afipApiRest.repository.RelacionesRepository;

import java.sql.Date;
import java.util.List;

@RestController
public class AfipController {
    @Autowired
    ImpuestoRepository impuestoRepository;
    @Autowired
    RelacionesRepository relacionesRepositoy;
    @GetMapping("/impuesto")
    public List<Impuesto> getAllImpuestos() {
        return impuestoRepository.findAll();
    }
    
    @GetMapping("/impuesto/{idimpuestos}") 
    public List<Impuesto> getAllImpuestos(@PathVariable Integer idimpuestos) {
        return impuestoRepository.findByIdimpuestos(idimpuestos);
    }
    @GetMapping("/impuesto/fechaliquidacion/{fecha1}/{fecha2}")
    public List<Impuesto> getImpuestosByFecha_liq(@PathVariable Date fecha1 ,@PathVariable Date fecha2 ) {
        return impuestoRepository.findAllByFechaLiqBetween(fecha1, fecha2);
    }
    
    @PostMapping("/impuesto/add")
    public Impuesto createImpuesto(@RequestBody Impuesto body) {
      return impuestoRepository.save(body);
    }
    
    @PutMapping("/impuesto/actualizar")
    public Impuesto updateImpuesto(@RequestBody Impuesto body) {
      return impuestoRepository.save(body);
    }
  /*
    @PutMapping("/impuesto/actualizar/{idimpuestos}/{fecha}")
    public List<Impuesto> updateImpuestofechaLiq(@PathVariable Integer idimpuestos ,@PathVariable Date fecha) {
      return impuestoRepository.findAllByIdimpuestosAndFechaLiq(idimpuestos, fecha);
    }
    */
    
    @GetMapping("/impuesto/relacion")
    public List<Relaciones> getAllRelaciones() {
        return relacionesRepositoy.findAll();
    }
    @GetMapping("/impuesto/relacion/{cuil}")
    public List<Relaciones> getAllRelaciones(@PathVariable Integer cuil) {
        return relacionesRepositoy.findByCuil(cuil);
    }
    @PostMapping("/impuesto/relacion/add")
    public Relaciones createRelacion(@RequestBody Relaciones body) {
      return relacionesRepositoy.save(body);
    }
   

	}

