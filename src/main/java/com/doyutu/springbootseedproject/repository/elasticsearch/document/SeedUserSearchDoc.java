package com.doyutu.springbootseedproject.search.document;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @author DoyuTu
 * @version 0.0.1
 * spring-boot-seed-project
 */
@Data
@Accessors(chain = true)
@Document(indexName = "seed", type = "user", shards = 1, replicas = 0, refreshInterval = "-1")
public class SearchSeedUser implements Serializable {

    private static final long serialVersionUID = 71649405740074529L;
    @Id
    private String id;
    private String userName;
    private String type;
    private String state;

}
