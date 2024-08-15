package pessoa.main;

import java.time.LocalDate;
import java.time.Month;

import pessoa.PessoaFisica;
import pessoa.PessoaJuridica;

public class Main {
   public Main() {
      PessoaFisica pf1 = new PessoaFisica("Gabriel Nicolas Caleb Pinto",
                                          LocalDate.of(1966,Month.MARCH,27),
                                          "09910133016", 
                                          "Rua Ednaldo", 190, "Barro", "Rolandia", "12345678");
      
      PessoaFisica pf2 = new PessoaFisica("Larissa Hadassa Almada",
                                          LocalDate.of(1981,Month.APRIL,13),
                                          "49398715252", 
                                          "Rua Ednaldo", 190, "Barro", "Rolandia", "12345678");
      
      System.out.println(pf1);
      System.out.println(pf2);
      
      
      PessoaJuridica pj1 = new PessoaJuridica("Casas Pernambucanas",
                                          	  LocalDate.of(1908,Month.SEPTEMBER,25),
                                              "51181391000129",
                                              "Arthur Lundgren Tecidos S.A.",
                                              "Rua Ednaldo", 190, "Barro", "Rolandia", "12345678");
      
      PessoaJuridica pj2 = new PessoaJuridica("Hering",
                                              LocalDate.of(1880,Month.JANUARY,1),
                                              "49943223000181",
                                              "Companhia Hering S.A.",
                                              "Rua Ednaldo", 190, "Barro", "Rolandia", "12345678");

      System.out.println(pj1);
      System.out.println(pj2);
   }

   public static void main(String[] args) {
      new Main();
   }
}
