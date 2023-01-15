package com.example.practica1_api_rest.Controlador;

import com.example.practica1_api_rest.Modelo.ventas;
import com.example.practica1_api_rest.Repositorio.comercial_repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class comercial_controlador
{
  @Autowired
  private comercial_repositorio comercialRep;

    @GetMapping(value = "/getventas")
    public List<ventas> getventas(){
        return comercialRep.findAll();
    }

  @PostMapping(value = "/postventas")
  public String guardarVenta(@RequestBody ventas Ventas){
    comercialRep.save(Ventas);
    return "venta agregada";
  }

  @PutMapping(value = "/putventas/{id}")
  public String editarVenta(@PathVariable long id, @RequestBody ventas Ventas){
    ventas updatedventa = comercialRep.findById(id).get();
    updatedventa.setElectrodomestico(Ventas.getElectrodomestico());
    updatedventa.setPrecio(Ventas.getPrecio());
    comercialRep.save(updatedventa);
    return "Venta Editada";
  }

  @DeleteMapping(value = "/deleteventas/{id}")
  public String eliminarVenta(@PathVariable long id){
    ventas deletedVenta = comercialRep.findById(id).get();
    comercialRep.delete(deletedVenta);
    return "Venta Eliminada";
  }




}
