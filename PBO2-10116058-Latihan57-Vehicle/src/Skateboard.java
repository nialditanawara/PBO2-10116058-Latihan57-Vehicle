/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan57.vehicle;

public class Skateboard extends Vehicle {

    private double myBoardLength;

    public Skateboard() {
        this.myBoardLength = myBoardLength;
        Vehicle vc2 = new Vehicle();
        vc2.setMyBrand("Ally Skate");
        vc2.setMyModel("Rocket");
        myBoardLength = 54.5;
        System.out.println("Skateboard");
        System.out.println("Brand : " + vc2.getMyBrand());
        System.out.println("Model : " + vc2.getMyModel());
        System.out.println("Panjang Board : " + myBoardLength);
    }

    public double getMyBoardLength() {
        return myBoardLength;
    }

    public void setMyBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }

}