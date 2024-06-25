package org.example;

public class Borrador {
  private TipoDePrenda tipoDePrenda;
  private Color colorPrincipal;
  private Color colorSecundario;
  private Material material;
  private Trama trama;

  public TipoDePrenda especificarTipo(TipoDePrenda tipoDePrenda) {
    if (tipoDePrenda == null) {
      throw new IllegalArgumentException("el tipo de prenda es obligatorio");
    }
    return this.tipoDePrenda = tipoDePrenda;
  }

  public Color especificarColorPrincipal(Color colorPrincipal) {
    if (colorPrincipal == null) {
      throw new IllegalArgumentException("el color principal es obligatorio");
    }
    return this.colorPrincipal = colorPrincipal;
  }

  public Color especificarColorSecundario(Color colorSecundario) {
    return this.colorSecundario = colorSecundario;
  }

  public Material especificarMaterial(Material material) {
    if (material == null) {
      throw new IllegalArgumentException("el material es obligatorio");
    }
    return this.material = material;
  }

  public Trama especificarTrama(Trama trama) {
    //cuando no se indica la trama, por defecto se colocará lisa
    if (trama == null) {
      return Trama.LISA;
    }
    return this.trama = trama;
  }

  public Prenda crearPrenda() {
    return new Prenda(tipoDePrenda, colorPrincipal, colorSecundario, material, trama);
  }
}
