package pe.bazan.jhosep.com.pginasamarillasapp.repositories;

import java.util.ArrayList;
import java.util.List;

import pe.bazan.jhosep.com.pginasamarillasapp.models.Company;

/**
 * Created by Alumno on 5/04/2018.
 */

public class CompanyRepository {

    private static List<Company> companies = new ArrayList<>();

    static {
        companies.add(new Company(100, "Restaurant", "Alameda", "Jr. de la Unión", "0176376213",
                "alameda@gmail.com", "alamaeda.oom.pe","ic_company", "Disfruta de nuestras mejores promociones y exquisitos platillos"));

        companies.add(new Company(200, "SuperMarket", "Metro", "San Juan de Lurigancho", "016542146",
                "metro@gmail.com", "www.metro.oom.pe","ic_company2", "Disfruta de nuestras mejores promociones y exquisitos platillos"));

        companies.add(new Company(300, "Pharmacy", "Inka Farma", "Av. Los ficus", "014215301",
                "InkaFarma@gmail.com", "inkafarma.oom.pe","ic_company3", "Estamos siempre para atenderlo"));

       companies.add(new Company(400, "Bank", "BBVA", "Centro de Lima", "017462164",
                "BBVAa@gmail.com", "bbva.oom.pe","ic_company4", "Ayudando a mantener su dinero a salvo"));

        companies.add(new Company(500, "Cinema", "UVK", "El Agustino", "016230723",
                "Cine_UVK@gmail.com", "uvk.oom.pe","ic_company5", "Disfrute de las mejores peliculas y estrenos que existen"));

        companies.add(new Company(600, "University", "UNI", "Av. Tupac Amaru", "014620063",
                "U_UNI@gmail.com", "uni.oom.pe","ic_company6", "Universidad número 1 de Ingenieria del Perú"));

        companies.add(new Company(700, "Cinema", "Cinepolis", "Centro de Lima", "013342006",
                "cinepolis@gmail.com", "cinepolis.oom.pe","ic_company7", "Contamos con una nueva sección 4D"));

        companies.add(new Company(800, "University", "San Marcos", "Cercado de Lima", "012154621",
                "UNMSM@gmail.com", "unmsm.oom.pe","ic_company8", "Universidad Nacional Mayor de San Marcos"));

        companies.add(new Company(900, "SuperMarket", "Plaza Vea", "Ov. Santa Anita", "0154654103",
                "PlazaVea@gmail.com", "plazavea.oom.pe","ic_company9", "Precios más bajos siempre"));

        companies.add(new Company(1000, "Pizza", "Pizza Hut", "Ov. Santa Anita", "0177610321",
                "PizzaHut@gmail.com", "pizzahut.oom.pe","ic_company", "Ven y prueba nuestras mejores pizzas para toda la familia"));



        // Tercera Ronda
        companies.add(new Company(100, "Restaurant", "Alameda", "Jr. de la Unión", "0176376213",
                "alameda@gmail.com", "alamaeda.oom.pe","ic_company", "Disfruta de nuestras mejores promociones y exquisitos platillos"));

        companies.add(new Company(200, "SuperMarket", "Metro", "San Juan de Lurigancho", "016542146",
                "metro@gmail.com", "www.metro.oom.pe","ic_company2", "Disfruta de nuestras mejores promociones y exquisitos platillos"));

        companies.add(new Company(300, "Pharmacy", "Inka Farma", "Av. Los ficus", "014215301",
                "InkaFarma@gmail.com", "inkafarma.oom.pe","ic_company3", "Estamos siempre para atenderlo"));

        companies.add(new Company(400, "Bank", "BBVA", "Centro de Lima", "017462164",
                "BBVAa@gmail.com", "bbva.oom.pe","ic_company4", "Ayudando a mantener su dinero a salvo"));

        companies.add(new Company(500, "Cinema", "UVK", "El Agustino", "016230723",
                "Cine_UVK@gmail.com", "uvk.oom.pe","ic_company5", "Disfrute de las mejores peliculas y estrenos que existen"));

        companies.add(new Company(600, "University", "UNI", "Av. Tupac Amaru", "014620063",
                "U_UNI@gmail.com", "uni.oom.pe","ic_company6", "Universidad número 1 de Ingenieria del Perú"));

        companies.add(new Company(700, "Cinema", "Cinepolis", "Centro de Lima", "013342006",
                "cinepolis@gmail.com", "cinepolis.oom.pe","ic_company7", "Contamos con una nueva sección 4D"));

        companies.add(new Company(800, "University", "San Marcos", "Cercado de Lima", "012154621",
                "UNMSM@gmail.com", "unmsm.oom.pe","ic_company8", "Universidad Nacional Mayor de San Marcos"));

        companies.add(new Company(900, "SuperMarket", "Plaza Vea", "Ov. Santa Anita", "0154654103",
                "PlazaVea@gmail.com", "plazavea.oom.pe","ic_company9", "Precios más bajos siempre"));

        companies.add(new Company(1000, "Pizza", "Pizza Hut", "Ov. Santa Anita", "0177610321",
                "PizzaHut@gmail.com", "pizzahut.oom.pe","ic_company", "Ven y prueba nuestras mejores pizzas para toda la familia"));

    }

    public static List<Company> getList() {return companies; }


}
