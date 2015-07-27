package com.andreluisgomes.dao;

import com.andreluisgomes.modelo.Fatura;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by agomes on 27/07/15.
 */
public class FaturaDAO {

    public List<Fatura> buscarfaturasVencidas(){
        List<Fatura> faturasVencidas = new ArrayList<>();

        Fatura f1 =  new Fatura("joao@joao",100, LocalDate.now().minusDays(3));
        Fatura f2 =  new Fatura("maria@joao",200, LocalDate.now().minusDays(2));
        Fatura f3 =  new Fatura("jose@joao",300, LocalDate.now().minusDays(10));
        Fatura f4 =  new Fatura("pedro@joao",400, LocalDate.now().minusDays(5));

        return Arrays.asList(f1,f2,f3,f4);
    }
}
