package uco.edu.co.springbootapp.dto;

import uco.edu.co.springbootapp.onlinetest.entity.IndicadorInventarioEntity;
import uco.edu.co.springbootapp.utilitarios.UtilTexto;
import uco.edu.co.springbootapp.utilitarios.UtilUUID;

import java.util.UUID;

public final class InventarioDTO {
    private UUID codigo;
    private String nombreProducto;
    private int cantidad;
    private IndicadorInventarioEntity codigoIndicador;

    public InventarioDTO() {
        setId(UtilUUID.obtenerValorDefecto());
        setNombreProducto(UtilTexto.getInstancia().obtenerValorDefecto());
        setCodigoIndicador(new IndicadorInventarioEntity());
    }

    public InventarioDTO(final UUID id) {
        setId(id);
        setNombreProducto(UtilTexto.getInstancia().obtenerValorDefecto());
        setCodigoIndicador(IndicadorInventarioEntity.obtenerValorDefecto());
    }

    public InventarioDTO(final UUID id, String nombreProducto, int cantidad, final IndicadorInventarioEntity codigoIndicador) {
        setId(id);
        setNombreProducto(nombreProducto);
        setCantidad(cantidad);
        setCodigoIndicador(codigoIndicador);
    }

    public UUID getId() {
        return codigo;
    }

    public void setId(final UUID id) {
        this.codigo = UtilUUID.obtenerValorDefecto(id);
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(final String nombreProducto) {
        this.nombreProducto = UtilTexto.getInstancia().quitarEspaciosBlancoInicioFin(nombreProducto);
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(final int cantidad) {
        this.cantidad = Integer.parseInt(UtilTexto.getInstancia().quitarEspaciosBlancoInicioFin(String.valueOf(cantidad)));
    }

    public IndicadorInventarioEntity getCodigoIndicador() {
        return codigoIndicador;
    }

    public void setCodigoIndicador(final IndicadorInventarioEntity codigoIndicador) {
        this.codigoIndicador = IndicadorInventarioEntity.obtenerValorDefecto(codigoIndicador);
    }



}