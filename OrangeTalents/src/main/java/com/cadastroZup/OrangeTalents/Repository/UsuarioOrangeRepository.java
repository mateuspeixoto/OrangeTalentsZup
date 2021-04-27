package com.cadastroZup.OrangeTalents.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastroZup.OrangeTalents.Model.UsuarioOrange;

@Repository	
public interface UsuarioOrangeRepository extends JpaRepository<UsuarioOrange, Long>{

}
