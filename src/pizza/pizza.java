package pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;


public class pizza {

    private String name;
    private BigDecimal price ;
    private ArrayList<String> ListIngredients = new ArrayList<>();// ListIngredients;
    // tout les float on le transforme en BigDecimal c'est pour un pb d'arrondi

    Scanner LectureClavier = new Scanner(System.in);

    public pizza(String name)
    {this.name = name;}

    public String getName(){return name;}
    public BigDecimal getPrice(){return price;}

    public void setName(String n ) {this.name = n;}

    public void setPrice(BigDecimal p ) {this.price = p;}

    public ArrayList getListIngredients(){return ListIngredients;}


}
