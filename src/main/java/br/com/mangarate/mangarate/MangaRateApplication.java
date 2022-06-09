package br.com.mangarate.mangarate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.mangarate.mangarate.core.models.Manga;
import br.com.mangarate.mangarate.core.repositories.MangaRepository;

@SpringBootApplication
public class MangaRateApplication implements CommandLineRunner {

	@Autowired
	private MangaRepository mangaRepository;

	public static void main(String[] args) {
		SpringApplication.run(MangaRateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		var manga = new Manga();
		manga.setNome("Akira");
		manga.setResumo(
				"O ano é 2019. Já passaram 38 anos desde a 3ª Guerra Mundial, iniciada com uma explosão atômica em 1982. O mundo foi devastado. Nas ruas de uma Neo Tokyo pós-apocalíptica, jovens delinquentes dedicam suas vidas a espalhar o terror e o caos. Em uma dessas noites, a gangue liderada por Shotaro Kaneda sofre um acidente. Tetsuo Shima, o melhor amigo de Kaneda, atropela uma criança. Após o ocorrido, Tetsuo começa a sentir reações que parecem ter despertado poderes jamais imaginados.");
		manga.setCapa(
				"https://1.bp.blogspot.com/-9dusqHaxPns/WQ0BEzfWAQI/AAAAAAAAJHY/720e0WctVWcrcoG2Rzy8d46Eygypld9UACK4B/s1600/akira_01.jpg");
		mangaRepository.save(manga);

		var manga2 = new Manga();
		manga2.setNome("Berserk");
		manga2.setResumo(
				"O misterioso Guts, o \"Espadachim Negro\", carrega em sua mão mecânica uma enorme espada, e em seu pescoço uma estranha marca que atrai forças demoníacas. Em sua busca por vingança contra um antigo inimigo, nem tudo sai a seu favor, e ele recebe ajuda de uma fantástica criatura.");
		manga2.setCapa(
				"https://http2.mlstatic.com/manga-berserk-volume-1-panini-2014-edico-de-luxo-2-brinde-D_NQ_NP_20211-MLB20187489598_102014-F.jpg");
		mangaRepository.save(manga2);
	}

}
