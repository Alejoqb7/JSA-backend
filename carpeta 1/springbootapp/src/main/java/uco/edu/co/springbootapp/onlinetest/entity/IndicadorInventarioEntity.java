package uco.edu.co.springbootapp.onlinetest.entity;

import uco.edu.co.springbootapp.utilitarios.UtilObjeto;
import uco.edu.co.springbootapp.utilitarios.UtilTexto;
import uco.edu.co.springbootapp.utilitarios.UtilUUID;

import java.util.UUID;

public final class IndicadorInventarioEntity {
    private UUID codigo;
    private String nombre;

    public IndicadorInventarioEntity() {
        setCodigo(UtilUUID.obtenerValorDefecto());
        setNombre(UtilTexto.getInstancia().obtenerValorDefecto());

    }

    public IndicadorInventarioEntity(final UUID codigo, final String nombre) {
        setCodigo(codigo);
        setNombre(nombre);
    }
    public static IndicadorInventarioEntity obtenerValorDefecto() {
        return new IndicadorInventarioEntity();
    }
    public static IndicadorInventarioEntity obtenerValorDefecto(final IndicadorInventarioEntity indicador) {
        return UtilObjeto.getInstancia().obtenerValorDefecto(indicador, obtenerValorDefecto());
    }

    public UUID getCodigo() {
        return codigo;
    }

    public void setCodigo(final UUID codigo) {
        this.codigo = UtilUUID.obtenerValorDefecto(codigo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = UtilTexto.getInstancia().quitarEspaciosBlancoInicioFin(nombre);
    }


    }