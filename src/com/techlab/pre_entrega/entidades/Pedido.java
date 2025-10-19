package com.techlab.pre_entrega.entidades;

import com.techlab.pre_entrega.entidades.DetallePedido;

import java.util.ArrayList;

public class Pedido {
    private static int proximoId = 1;
    private int idPedidos;
    private ArrayList<DetallePedido> detallePedido;

    public Pedido() {
        this.idPedidos = proximoId++;
        this.detallePedido = new ArrayList<>();
    }
    public void agregarDetalle(DetallePedido detalle) {
        this.detallePedido.add(detalle);
    }
    public int getIdPedidos() {
        return idPedidos;
    }

    public ArrayList<DetallePedido> getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(ArrayList<DetallePedido> detallePedido) {
        this.detallePedido = detallePedido;
    }
}
