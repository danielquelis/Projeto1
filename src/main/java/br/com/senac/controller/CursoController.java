package br.com.senac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.senac.servico.CategoriaService;
import br.com.senac.servico.CursoService;

@Controller
public class CursoController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@Autowired
	private CursoService cursoService;
	
	@GetMapping("/listarCurso")
	public ModelAndView listaCursos() {
		ModelAndView mv = new ModelAndView("curso/paginaCursos");
		mv.addObject("cursos", cursoService.listaCursos());
		return mv;
	}

}
