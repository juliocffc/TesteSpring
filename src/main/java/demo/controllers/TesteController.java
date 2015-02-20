package demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/teste")
public class TesteController {

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String sayHello(){
		return "Hello Word";
	}

	@RequestMapping(value="/alunos/{ra}",method=RequestMethod.GET)
	public Aluno getAluno(@PathVariable Integer ra){
		Aluno novo = new Aluno("fulano", ra);
		return novo;
	}
	
	@RequestMapping(value="/alunos",method=RequestMethod.POST)
	public String criarAluno(@RequestBody Aluno novo){
		return "Aluno:"+novo.getNome()+"recebido!";
	}
	
}
