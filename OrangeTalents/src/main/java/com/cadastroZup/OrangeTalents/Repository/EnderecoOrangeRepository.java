package com.cadastroZup.OrangeTalents.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastroZup.OrangeTalents.Model.EnderecoOrange;

@Repository
public interface EnderecoOrangeRepository extends JpaRepository<EnderecoOrange, Long>{

}
