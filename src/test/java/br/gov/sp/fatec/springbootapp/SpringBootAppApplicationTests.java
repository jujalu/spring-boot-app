package br.gov.sp.fatec.springbootapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import br.gov.sp.fatec.springbootapp.entity.Usuario;
import br.gov.sp.fatec.springbootapp.repository.UsuarioRepository;

@SpringBootTest
@Transactional
@Rollback
class SpringBootAppApplicationTests {

	@Autowired
	private UsuarioRepository usuarioRepo;

	@Test
	void contextLoads() {
	}

	@Test
	void testaInsercao(){
		Usuario usuario = new Usuario();
        usuario.setNome("Usuario2");
        usuario.setSenha("SenhaF0rte");
		usuarioRepo.save(usuario);
		assertNotNull(usuario.getId());
	}

}
