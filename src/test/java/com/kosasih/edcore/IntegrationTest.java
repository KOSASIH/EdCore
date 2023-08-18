package com.kosasih.edcore;

import com.kosasih.edcore.EdCoreApp;
import com.kosasih.edcore.config.AsyncSyncConfiguration;
import com.kosasih.edcore.config.EmbeddedElasticsearch;
import com.kosasih.edcore.config.EmbeddedKafka;
import com.kosasih.edcore.config.EmbeddedSQL;
import com.kosasih.edcore.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { EdCoreApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
