package service;

import java.util.List;

import domain.product;

public class VendingMachine {
    private Holder holder;
    private Display display;
    private CoinDispenser coindispenser;
    private List <product> assort;
    public VendingMachine(Holder holder, Display display, CoinDispenser coindispenser, List<product> assort) {
        this.holder = holder;
        this.display = display;
        this.coindispenser = coindispenser;
        this.assort = assort;
    }
    public Holder getHolder() {
        return holder;
    }
    public void setHolder(Holder holder) {
        this.holder = holder;
    }
    public Display getDisplay() {
        return display;
    }
    public void setDisplay(Display display) {
        this.display = display;
    }
    public CoinDispenser getCoindispenser() {
        return coindispenser;
    }
    public void setCoindispenser(CoinDispenser coindispenser) {
        this.coindispenser = coindispenser;
    }
    public List<product> getProducts() {
        return assort;
    }
    public void setProducts(List<product> assort) {
        this.assort = assort;
    }
    

}
