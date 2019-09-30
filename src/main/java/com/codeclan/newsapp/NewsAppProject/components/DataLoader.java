package com.codeclan.newsapp.NewsAppProject.components;

import com.codeclan.newsapp.NewsAppProject.models.Article;
import com.codeclan.newsapp.NewsAppProject.models.Category;
import com.codeclan.newsapp.NewsAppProject.models.Journalist;
import com.codeclan.newsapp.NewsAppProject.repository.ArticleRepository.ArticleRepository;
import com.codeclan.newsapp.NewsAppProject.repository.CategoryRepository.CategoryRepository;
import com.codeclan.newsapp.NewsAppProject.repository.JournalistRepository.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    JournalistRepository journalistRepository;

    @Autowired
    CategoryRepository categoryRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Journalist journalist1 = new Journalist( "Iain", "McWhirter");
        journalistRepository.save(journalist1);

        Journalist journalist2 = new Journalist( "Sally", "Magnusson");
        journalistRepository.save(journalist2);

        Journalist journalist3 = new Journalist( "Kevin", "Maguire");
        journalistRepository.save(journalist3);

        Journalist journalist4 = new Journalist( "Catriona", "Shearer");
        journalistRepository.save(journalist4);

        Category category1 = new Category("Politics");
        categoryRepository.save(category1);

        Category category2 = new Category("Sport");
        categoryRepository.save(category2);

        Category category3 = new Category("Environment");
        categoryRepository.save(category3);

        Category category4 = new Category("Science");
        categoryRepository.save(category4);


        Article article1 = new Article(
                "Post-Crash Bitcoin Warning As Wallets Targeted In ‘Active And Ongoing’ Hack Attack",
                3,
                "A bad week for bitcoin investors just got worse. First, there was the crash, and now a threat to wallets has been identified.",
                "First bitcoin crashes and then more bad news is piled onto cryptocurrency investors Bitcoin wentinto" +
                        " meltdown starting September 24 when the BTC price dropped by",
                journalist1,
                "https://thumbor.forbes.com/thumbor/600x315/https%3A%2F%2Fspecials-images.forbesimg.com%2Fimageserve%2F976598338%2F960x0.jpg");
        articleRepository.save(article1);

        Article article2 = new Article(
                "Crypto Exchange Coindirect Launches OTC Brokerage in South Africa",
                4,
                "Cryptocurrency exchange Coindirect launches an over-the-counter brokerage service in South Africa",
                "Cryptocurrency exchange Coindirect launches an over-the-counter (OTC) brokerage in South Africa" +
                        "As industry news outlet CoinInsider reported on Sept. 27, the platform creates a vast liquidity pool by integrating with global platforms, allows for Bitcoin (BT… [+932 chars]",
                journalist2,
                "https://images.cointelegraph.com/images/740_aHR0cHM6Ly9zMy5jb2ludGVsZWdyYXBoLmNvbS9zdG9yYWdlL3VwbG9hZHMvdmlldy9iNTI5MGI0NTE4ZjY0ZTc5MTI1YWRkNzYzMTYxOWIwNS5qcGc=.jpg");
        articleRepository.save(article2);

        Article article3 = new Article(
                "CoinCola, Leading the Digital Currency Education Across Africa",
                6,
                "COINCOLA CRYPTO TOUR NIGERIA The digital currency sphere has experienced significant growth in " +
                        "Africa over the past 10 years. This growth is largely catalyzed by a user base under age 40. CoinCola is at the forefront of the digital currency peer-to-peer marke…",
                "COINCOLA CRYPTO COINCOLA CRYPTO TOUR NIGERIA The digital currency sphere has experienced " +
                        "significant growth in Africa over the past 10 years. This growth is largely catalyzed by a user base under age 40. CoinCola is at the forefront of the digital currency… [+4868 chars]",
                journalist3,
                "https://i2.wp.com/cdn.vanguardngr.com/wp-content/uploads/2019/09/IMG-20190927-WA0001" +
                        ".jpg?fit=1080%2C1080&ssl=1"
        );
        articleRepository.save(article3);

        Article article4 =  new Article(
                "BTC Price Rebounds From $7,700: Crypto Traders Hope for Relief Rally",
                2,
                "Technical analysts anticipate Bitcoin’s price to recover in the short term in a relief rally " +
                        "following a minor rebound to $8,200",
                "Subsequent to the recovery of the Bitcoin price (BTC) movement from $7,700 to around $8,200 in the " +
                        "past 24 hours, technical analysts anticipate Bitcoin and other major crypto assets to " +
                        "recover in the short term. Speaking to Cointelegraph, crypto trader Nick … [+9284 chars]",
                journalist4,
                "https://images.cointelegraph.com/images/740_aHR0cHM6Ly9zMy5jb2ludGVsZWdyYXBoLmNvbS9zdG9yYWdlL3VwbG9hZHMvdmlldy80NTcxOGYzODBjZmIxNmQ0YjQ1OWQ0MTBlZmNlZDc3YS5qcGc=.jpg"
        );
        articleRepository.save(article4);

        article1.addCategory(category1);
        article1.addCategory(category2);
        articleRepository.save(article1);

        //article1.addCategory(category2);
        //articleRepository.save(article1);


        article2.addCategory(category3);
        articleRepository.save(article2);

        article3.addCategory(category2);
        articleRepository.save(article3);

        article4.addCategory(category4);
        articleRepository.save(article4);
    }
}

