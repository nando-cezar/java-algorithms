package ui;

import business.Common;
import business.Controlled;
import business.NotControlled;
import business.Pharmacy;

public class Main {

    public static void main(String[] args){
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.getMedication().add(new Common(1, "COMUM", 2.40f, 30));
        pharmacy.getMedication().add(new Common(1, "COMUM", 4.50f, 30));
        pharmacy.getMedication().add(new Controlled(1, "CONTROLADO", 2.50f, 5));
        pharmacy.getMedication().add(new NotControlled(1, "NÃO CONTROLADO", 2.50f, 30));

        try {
            pharmacy.getMedication().get(0).purchase();
            System.out.println(pharmacy.getMedication().get(0));

            pharmacy.getMedication().get(1).purchase();
            System.out.println(pharmacy.getMedication().get(1));

            pharmacy.getMedication().get(2).purchase();
            System.out.println(pharmacy.getMedication().get(2));

            pharmacy.getMedication().get(2).purchase();
            System.out.println(pharmacy.getMedication().get(2));

            pharmacy.getMedication().get(2).purchase();
            System.out.println(pharmacy.getMedication().get(2));

            pharmacy.getMedication().get(2).purchase();
            System.out.println(pharmacy.getMedication().get(2));

            pharmacy.getMedication().get(2).purchase();
            System.out.println(pharmacy.getMedication().get(2));

            pharmacy.getMedication().get(2).giveBack(1);
            System.out.println(pharmacy.getMedication().get(2));

            pharmacy.getMedication().get(3).purchase();
            System.out.println(pharmacy.getMedication().get(3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
