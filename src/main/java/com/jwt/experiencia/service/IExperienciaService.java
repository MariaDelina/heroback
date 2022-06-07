
package com.jwt.experiencia.service;

import com.jwt.experiencia.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
     public List<Experiencia> verExperiencia();
    public void crearExperiencia(Experiencia exp);
    public void borrarExperiencia (Long id);
    public Experiencia buscarExperiencia(Long id);
    public void actualizarExperiencia(Experiencia exp);
    public void updateExperiencia(Long id, Experiencia exp);
}
