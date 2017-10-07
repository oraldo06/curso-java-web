package br.com.tt.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.net.SyslogConstants;

@RestController
@RequestMapping("/api/cliente")
public class ClienteApi {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping
	List<Cliente> clientes(){
		return service.consulta();
		
	}
	
	@GetMapping("/{id}")
	Cliente cliente(@PathVariable(name="id") Integer id){
		List<Cliente> clientes = service.consulta();
		if(id > clientes.size()){
			return new Cliente();
		}
		return clientes.get(id - 1);
		
	}
	
	@PostMapping
	Cliente salvar(@RequestBody Cliente cliente){
		return service.salvar(cliente);
	}
	
	@DeleteMapping("{id}")
	void excluir(@PathVariable (name = "id")Long id){
		service.excluir(id);
		
	}

}
