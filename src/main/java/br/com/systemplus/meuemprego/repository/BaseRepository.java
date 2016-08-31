package br.com.systemplus.meuemprego.repository;

import java.io.Serializable;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.systemplus.meuemprego.model.BaseEntity;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity<?>, ID extends Serializable>
		extends PagingAndSortingRepository<T, ID> {
}