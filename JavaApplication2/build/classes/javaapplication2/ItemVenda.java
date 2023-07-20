/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/*************************************
 * dtm.addColumn("Item de venda");
        dtm.addColumn("Codigo do produto");
        dtm.addColumn("Descrição");
        dtm.addColumn("Marca");
        dtm.addColumn("Unidade");
        dtm.addColumn("Quantidade");
        dtm.addColumn("Preço");
        dtm.addColumn("Valor");
        dtm.addColumn("Desconto");
        dtm.addColumn("Valor Total");
 * @author 05331011071
 ************************************/
public class ItemVenda {
    
   private int ItemVenda;
   private  String codproduto;
   private int quantidade;
   private double desconto;
   private String IDvend;
   private Double precounit;

    public ItemVenda(int ItemVenda, String codproduto, int quantidade, double desconto, String IDvend, double precounit) {
        this.ItemVenda = ItemVenda;
        this.codproduto = codproduto;
        this.quantidade = quantidade;
        this.desconto = desconto;
        this.IDvend = IDvend;
        this.precounit = precounit;
    }

    public int getItemVenda() {
        return ItemVenda;
    }

    public void setItemVenda(int ItemVenda) {
        this.ItemVenda = ItemVenda;
    }

    public String getCodproduto() {
        return codproduto;
    }

    public void setCodproduto(String codproduto) {
        this.codproduto = codproduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    /**
     * @return the IDvend
     */
    public String getIDvend() {
        return IDvend;
    }

    /**
     * @param IDvend the IDvend to set
     */
    public void setIDvend(String IDvend) {
        this.IDvend = IDvend;
    }

    /**
     * @return the precounit
     */
    public Double getPrecounit() {
        return precounit;
    }

    /**
     * @param precounit the precounit to set
     */
    public void setPrecounit(Double precounit) {
        this.precounit = precounit;
    }
   
   
     
    
}
