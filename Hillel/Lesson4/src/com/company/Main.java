package com.company;

import com.company.Building.Museum;
import com.company.Building.Office;
import com.company.Building.Residential;
import com.company.Furniture.Furniture;
import com.company.Furniture.Other;
import com.company.Furniture.Relax;
import com.company.Furniture.Work;
import com.company.Plants.Flower;
import com.company.Plants.Grass;
import com.company.Plants.Plants;
import com.company.Plants.Tree;

public class Main {

    public static void main(String[] args) {
        Human human = new Human("Lola",24,5054);
        Human human1 = new Human("Lola",24,5047);
        Human human2 = new Human("Lola",24,5054);

        System.out.println("--------");

        System.out.println(human.equals(human2));

        System.out.println("--------");

        System.out.println(human.toString());

        System.out.println("--------");

        Museum museum = new Museum("Museum",1,2,"Get st.",
                4,true,true,1998);
        System.out.println(museum.toString());

        System.out.println("--------");

        Office office = new Office("MTC",3,10,"Pushkina st.",
                10,false,true,true,50);
        System.out.println(office.toString());

        System.out.println("--------");

        Residential residential = new Residential("Gilstroy",5,25,"50 years",
                8,true,true,true);
        System.out.println(residential.toString());
        System.out.println("--------");

        Tree tree = new Tree("Topol'",true,false,true,"Road",8);
        System.out.println(tree.toString());

        System.out.println("--------");

        Plants flower = new Flower("Rose",false,false,true,7,"Seeds");
        System.out.println(flower.toString());

        System.out.println("--------");

        Grass grass = new Grass("Lawn grass",false,false,true,false,
                false,"foolbal");
        System.out.println(grass.toString());

        Furniture workTable = new Work(3125,"IKEA workTable TC-01","white","wood");
        System.out.println(workTable.toString());

        Furniture sofa = new Relax(2145574,"sofa","black",5);
        System.out.println(sofa.toString());

        Other other = new Other(1255478,"Flower table","white","hall");
        System.out.println(other.toString());
    }
}
