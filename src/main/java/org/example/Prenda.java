package org.example;
import java.awt.*;

public class Prenda {
  private TipoDePrenda tipoDePrenda;
  private Color colorPrincipal;
  private Material material;

  public Prenda(TipoDePrenda tipoDePrenda, Color colorPrincipal, Material material) {
    if (tipoDePrenda == null) {
      throw new IllegalArgumentException("el tipo de prenda es obligatorio");
    }
    if (colorPrincipal == null) {
      throw new IllegalArgumentException("el color principal es obligatorio");
    }

    this.tipoDePrenda = tipoDePrenda;
    this.colorPrincipal = colorPrincipal;
    this.material = material;
  }
}
