package org.example;
import java.awt.*;

public class Prenda {
  private TipoDePrenda tipoDePrenda;
  private Color colorPrincipal;
  private Color colorSecundario;
  private Material material;
  private Trama trama;

  public Prenda(TipoDePrenda tipoDePrenda, Color colorPrincipal, Color colorSecundario, Material material, Trama trama) {
    if (tipoDePrenda == null) {
      throw new IllegalArgumentException("el tipo de prenda es obligatorio");
    }
    if (colorPrincipal == null) {
      throw new IllegalArgumentException("el color principal es obligatorio");
    }
    if (material == null) {
      throw new IllegalArgumentException("el material es obligatorio");
    }

    this.tipoDePrenda = tipoDePrenda;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.material = material;
    this.trama = trama;
  }
}
