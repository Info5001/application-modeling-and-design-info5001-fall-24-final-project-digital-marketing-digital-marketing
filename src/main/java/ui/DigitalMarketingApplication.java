/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;

import com.github.javafaker.Faker;
import com.github.tomaslanger.chalk.Chalk;

import model.Business.Business;
import model.Business.ConfigureABusiness;

/**
 *
 * @author kal bugrara
 */
public class DigitalMarketingApplication {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Faker magicBox = new Faker();

    // String sampleName = magicBox.name().firstName();

    ArrayList<String> companies = new ArrayList<String>();

    for (int i = 0; i < 100; i++) {
      String newsCompanyPick = magicBox.company().name();
      companies.add(newsCompanyPick);
    }

    companies.sort((String s1, String s2) -> s1.compareTo(s2));

    for (String company : companies) {
      System.out.println(Chalk.on(company).red());
    }

    // Faker magicBox = new Faker();

    // System.out.println("================== First, Last name ==================
    // ");
    // for (int index=0; index < 50; index++){
    // String fullName = magicBox.name().fullName();
    // System.out.println(fullName);
    // }

    // System.out.println("================== Companies ================== ");

    // for (int index=0; index < 50; index++){
    // String companyName = magicBox.company().name();
    // System.out.println(companyName);
    // }

    // System.out.println("================== Products ================== ");

    // for (int index=0; index < 50; index++){
    // String product = magicBox.commerce().productName();
    // System.out.println(product);
    // }

    // System.out.println("================== Yoda Quotes ================== ");

    // for (int index=0; index < 50; index++){
    // String quote = magicBox.yoda().quote();
    // System.out.println(quote);
    // }

    // Business business =
    // ConfigureABusiness.createABusinessAndLoadALotOfData("Amazon", 50, 10, 30,
    // 100,
    // 10);

  }
}
