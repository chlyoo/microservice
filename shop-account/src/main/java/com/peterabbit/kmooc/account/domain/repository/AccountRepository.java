package com.peterabbit.kmooc.account.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.peterabbit.kmooc.account.domain.model.Account;

@RepositoryRestResource
public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {
	Account findByName(@Param("name") String name);
}
