package br.com.tt.cliente;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ClienteService {
	
	List<Cliente> consulta(){
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente(1L, "João", "03258000112", new Date()));
		clientes.add(new Cliente(2L, "Maria", "02587654789", new Date()));
		clientes.add(new Cliente(3L, "Pedro", "09874654789", new Date()));
		clientes.add(new Cliente(4L, "Mario", "05874547896", new Date()));
		clientes.add(new Cliente(5L, "Montito", "03599845632", new Date()));
		
		return clientes;
	}

}
