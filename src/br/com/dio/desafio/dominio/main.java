package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso js");
		curso2.setDescricao("Descrição Curso js");
		curso2.setCargaHoraria(4);		
				
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição Mentoria Java");
		mentoria.setData(LocalDate.now());

	/*	System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria); */
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devFlaviano = new Dev();
		devFlaviano.setNome("Flaviano");
		devFlaviano.InscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Flaviano:" + devFlaviano.getConteudosInscritos());
		devFlaviano.progredir();
		devFlaviano.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Flaviano:" + devFlaviano.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos Flaviano:" + devFlaviano.getConteudosConcluidos());
		System.out.println("XP:" + devFlaviano.calcularTotalXp());
		
		System.out.println("*****");
		
		Dev devDaniel = new Dev();
		devDaniel.setNome("Daniel");
		devDaniel.InscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Daniel:" + devDaniel.getConteudosInscritos());
		devDaniel.progredir();
		devDaniel.progredir();
		devDaniel.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Daniel:" + devDaniel.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos Daniel:" + devDaniel.getConteudosConcluidos());
		System.out.println("XP:" + devDaniel.calcularTotalXp());
		
		
	}
	
	

}
