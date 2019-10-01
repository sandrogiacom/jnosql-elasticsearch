package com.giacom.jnosql;

import static org.junit.jupiter.api.Assertions.*;

import org.jnosql.diana.api.document.Document;
import org.jnosql.diana.api.document.DocumentEntity;
import org.jnosql.diana.api.document.DocumentQuery;
import org.jnosql.diana.elasticsearch.document.ElasticsearchDocumentCollectionManager;
import org.jnosql.diana.elasticsearch.document.ElasticsearchDocumentCollectionManagerFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HelloWorldTest {


    @Test
    public void testImmutableCollections() {

        List<String> fruits = List.of("Mangosteen", "Durian fruit", "Longan");

        assertThrows(UnsupportedOperationException.class, () -> {
            fruits.add("Mango");
            fruits.remove(1);
        });

        assertEquals(3, fruits.size());

    }

//    @Test
//    public void shouldRemoveEntityById() {
//        ElasticsearchDocumentCollectionManager entityManager;
//        ElasticsearchDocumentCollectionManagerFactory  managerFactory = ElasticsearchDocumentCollectionManagerFactorySupplier.INSTACE.get();
//        DocumentEntity documentEntity = entityManager.insert(DocumentEntityGerator.getEntity());
//        Document id = documentEntity.find("_id").get();
//
//        DocumentQuery query = select().from(DocumentEntityGerator.COLLECTION_NAME).where(id.getName()).eq(id.get()).build();
//
//        DocumentDeleteQuery deleteQuery = delete().from(DocumentEntityGerator.COLLECTION_NAME).where(id.getName()).eq(id.get()).build();
//
//        entityManager.delete(deleteQuery);
//        assertTrue(entityManager.select(query).collect(Collectors.toList()).isEmpty());
//    }

}
