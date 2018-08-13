package com.doyutu.springbootseedproject.search.repository;

import com.doyutu.springbootseedproject.entity.SeedUser;
import com.doyutu.springbootseedproject.search.document.SearchSeedUser;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @author DoyuTu
 * @version 0.0.1
 * spring-boot-seed-project
 */
public interface RepositorySeedUser extends ElasticsearchRepository<SearchSeedUser, String> {

    List<SeedUser> findAllByUserNameOrTypeOrState(String userName, String type, String state);
}
