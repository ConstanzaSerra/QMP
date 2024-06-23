package org.example;

public class TipoDePrenda {
  private Categoria categoria;

  public TipoDePrenda(Categoria categoria) {
    if (categoria == null) {
      throw new IllegalArgumentException("la categoria es obligatoria");
    }
    this.categoria = categoria;
  }
}
